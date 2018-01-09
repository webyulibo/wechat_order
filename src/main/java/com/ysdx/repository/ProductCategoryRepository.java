package com.ysdx.repository;

import com.ysdx.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 商品类目
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {
    /**
     * 根据商品类目id查询商品类目
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
