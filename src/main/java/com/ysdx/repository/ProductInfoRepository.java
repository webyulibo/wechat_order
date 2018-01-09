package com.ysdx.repository;

import com.ysdx.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 商品信息
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {
    /**
     * 根据商品状态查询商品
     * @param productStatus
     * @return
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
