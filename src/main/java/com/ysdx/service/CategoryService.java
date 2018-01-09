package com.ysdx.service;

import com.ysdx.dataobject.ProductCategory;

import java.util.List;

/**
 * 商品类目
 */
public interface CategoryService {
    /**
     * 根据商品类目id查询某个商品类目
     * @param categoryId
     * @return
     */
    ProductCategory findOne(Integer categoryId);

    /**
     * 查询所有的商品类目
     * @return
     */
    List<ProductCategory> findAll();

    /**
     * 根据商品类目id查询商品类目
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    /**
     * 保存商品类目
     * @param productCategory
     * @return
     */
    ProductCategory save(ProductCategory productCategory);
}
