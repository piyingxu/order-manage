package com.great.web;

import com.great.dto.base.PageDto;
import com.great.dto.base.RespResult;
import com.great.dto.base.RespUtil;
import com.great.dto.req.ProductReq;
import com.great.dto.res.ProductRes;
import com.great.service.ProductService;
import com.great.util.Log;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yinqi
 * @date 2019/3/28
 * 商家商品（菜品）
 */
@Api(description = "商家商品（菜品）", tags = "seller-product")
@RestController
@RequestMapping("/seller/product")
public class SellerProductController {

    private static final Logger log = LoggerFactory.getLogger(SellerProductController.class);
    @Autowired
    private ProductService productService;

    /**
     * @Author yinqi
     * @Description
     * @Date 10:44 2019/3/28
     * @Param [req]
     *
     * @return com.great.dto.base.RespResult<java.lang.String>
     **/
    @ApiOperation("1、商品(菜品)列表")
    @Log
    @PostMapping("/list")
    public RespResult<PageDto<ProductRes>> queryProductList(@RequestBody  ProductReq productReq) {

        //return  RespUtil.success("success");
        return null;
    }

}
