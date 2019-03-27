package com.great.dao;

import com.great.model.OrderMaster;

public interface OrderMasterMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrderMaster record);

    int insertSelective(OrderMaster record);

    OrderMaster selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OrderMaster record);

    int updateByPrimaryKey(OrderMaster record);
}