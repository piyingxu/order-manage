package com.great.service.impl;


import com.great.dao.DishesInfoMapper;
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
    public DishesInfo save(DishesInfo productInfo) {
        return null;
    }


}
