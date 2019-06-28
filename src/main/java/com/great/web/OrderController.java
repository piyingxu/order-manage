package com.great.web;

import com.great.dto.base.RespResult;
import com.great.dto.base.RespUtil;
import com.great.model.OrderSell;
import com.great.service.OrderService;
import com.great.util.Log;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.GET;
import java.util.List;

/**
* @author: yingxu.pi@transsnet.com
* @date: 2019/5/7 17:24
*/
@Api(description = "下单相关", tags = "order")
@RestController
@RequestMapping("/order")
public class OrderController {

    private static final Logger log = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private OrderService orderService;

    @ApiOperation("货架下单列表")
    @Log
    @GetMapping("/sell")
    public RespResult<List<OrderSell>> orderSell(@RequestParam String merchantId) {
        return RespUtil.success(orderService.selectByOrderSell(merchantId));
    }

}
