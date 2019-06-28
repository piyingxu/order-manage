package com.great.dao;

import com.great.model.OrderMaster;
import com.great.model.OrderSell;

import java.util.List;

public interface OrderMasterMapper {

    int deleteByPrimaryKey(String id);

    int insert(OrderMaster record);

    int insertSelective(OrderMaster record);

    OrderMaster selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OrderMaster record);

    int updateByPrimaryKey(OrderMaster record);

    List<OrderSell> selectByOrderSell(String merchantId);
}