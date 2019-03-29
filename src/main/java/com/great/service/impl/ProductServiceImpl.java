package com.great.service.impl;


import com.great.dao.DishesInfoMapper;
import com.great.dto.base.PageDto;
import com.great.dto.base.RespResult;
import com.great.dto.base.RespUtil;
import com.great.dto.req.ProductReq;
import com.great.dto.res.ProductRes;
import com.great.model.DishesInfo;
import com.great.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 *
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private DishesInfoMapper dishesInfoMapper;

    @Override
    public DishesInfo findOne(String productId) {
       return dishesInfoMapper.selectByPrimaryKey(productId);
    }

    @Override
    public List<DishesInfo> findUpAll() {
        return null;
    }

    @Override
    public RespResult<PageDto<ProductRes>> queryProductList(ProductReq req) {
      /*  PageDto<ProductRes> pageDto = queryLoanListCommon(req.getMerchantId(), req.getPageSize(), req.getPageNum());
        return RespUtil.success(pageDto);*/
      return null;
    }

    @Override
    public DishesInfo save(DishesInfo productInfo) {
        return null;
    }


}
