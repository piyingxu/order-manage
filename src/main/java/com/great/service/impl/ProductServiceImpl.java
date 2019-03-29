package com.great.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.great.dao.DishesInfoMapper;
import com.great.dto.base.PageDto;
import com.great.dto.base.RespResult;
import com.great.dto.base.RespUtil;
import com.great.dto.req.ProductReq;
import com.great.model.DishesInfo;
import com.great.service.ProductService;
import com.great.util.BeanUtilsCopy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
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
    public RespResult<PageDto<DishesInfo>> queryProductList(ProductReq req) {
        PageHelper.startPage(req.getPage(), req.getLimit());
        List<DishesInfo> list = dishesInfoMapper.selectConditions(req);
        PageInfo<DishesInfo> pageInfo = new PageInfo<>(list);
        PageDto<DishesInfo> target = new PageDto<>();
        BeanUtilsCopy.copyProperties(pageInfo, target);
        target.setList(list);
        return RespUtil.success(target);
    }

    @Override
    public DishesInfo save(DishesInfo productInfo) {
        return null;
    }


}
