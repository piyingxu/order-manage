package com.great.service;

import com.great.model.OrderSell;

import java.util.List;

/**
 * @author: yingxu.pi@transsnet.com
 * @date: 2019/5/7 16:38
 */
public interface OrderService {

    List<OrderSell> selectByOrderSell(String merchantId);

}
