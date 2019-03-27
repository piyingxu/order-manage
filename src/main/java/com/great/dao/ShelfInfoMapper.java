package com.great.dao;

import com.great.model.ShelfInfo;

public interface ShelfInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(ShelfInfo record);

    int insertSelective(ShelfInfo record);

    ShelfInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ShelfInfo record);

    int updateByPrimaryKey(ShelfInfo record);
}