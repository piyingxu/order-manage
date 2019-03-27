package com.great.dao;

import com.great.model.DishesInfo;

public interface DishesInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(DishesInfo record);

    int insertSelective(DishesInfo record);

    DishesInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DishesInfo record);

    int updateByPrimaryKey(DishesInfo record);
}