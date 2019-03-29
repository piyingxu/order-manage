package com.great.service;

import com.great.dto.base.PageDto;
import com.great.dto.base.RespResult;
import com.great.dto.req.ProductReq;
import com.great.dto.res.ProductRes;
import com.great.model.DishesInfo;

import java.util.List;

/**
 * @author yinqi
 * @date 2019/3/27
 * 商品(菜品)
 */
public interface ProductService {

    DishesInfo findOne(String productId);

    /**
     * 查询所有在架商品列表
     * @return
     */
    List<DishesInfo> findUpAll();

    /**
     * 分页查询所有在架商品列表（菜品）
     * @return
     */
    RespResult<PageDto<DishesInfo>> queryProductList(ProductReq req);

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
