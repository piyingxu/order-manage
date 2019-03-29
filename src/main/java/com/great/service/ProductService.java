package com.great.service;

import com.great.model.DishesInfo;

import java.util.List;

/**
 * @author yinqi
 * @date 2019/3/27
 * 商品
 */
public interface ProductService {

    DishesInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<DishesInfo> findUpAll();

    //Page<ProductInfo> findAll(Pageable pageable);

    DishesInfo save(DishesInfo productInfo);

//    //加库存
//    void increaseStock(List<CartDTO> cartDTOList);
//
//    //减库存
//    void decreaseStock(List<CartDTO> cartDTOList);
//
//    //上架
//    ProductInfo onSale(String productId);
//
//    //下架
//    ProductInfo offSale(String productId);
}
