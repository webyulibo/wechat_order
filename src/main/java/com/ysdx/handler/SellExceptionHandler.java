package com.ysdx.handler;

import com.ysdx.VO.ResultVO;
import com.ysdx.config.ProjectUrlConfig;
import com.ysdx.exception.SellException;
import com.ysdx.exception.SellerAuthorizeException;
import com.ysdx.utils.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class SellExceptionHandler {

    @Autowired
    private ProjectUrlConfig projectUrlConfig;

    //拦截登录异常
    @ExceptionHandler(value = SellerAuthorizeException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ModelAndView handlerAuthorizeException() {
        return new ModelAndView("redirect:"
                .concat(projectUrlConfig.getWechatOpenAuthorize())
                .concat("/sell/wechat/qrAuthorize")
                .concat("?returnUrl=")
                .concat(projectUrlConfig.getWechat_order())
                .concat("/sell/seller/login"));
    }

    @ExceptionHandler(value= SellException.class)
    @ResponseBody
    public ResultVO handlerSellException(SellException e){
            return ResultVOUtil.error(e.getCode(),e.getMessage());
    }
}