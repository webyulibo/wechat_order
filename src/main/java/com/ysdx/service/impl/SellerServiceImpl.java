package com.ysdx.service.impl;

import com.ysdx.dataobject.SellerInfo;
import com.ysdx.repository.SellerInfoRepository;
import com.ysdx.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository repository;

    @Override
    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}