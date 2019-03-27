package com.great.web;

import com.great.dto.base.RespResult;
import com.great.dto.base.RespUtil;
import com.great.dto.test.TestReq;
import com.great.util.Log;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "测试接口", tags = "Test")
@RestController
@RequestMapping("order/manager/")
public class TestController {

    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @ApiOperation("1、测试接口")
    @Log
    @PostMapping("test")
    public RespResult<String> callback(@RequestBody TestReq req) {
        return  RespUtil.success("success");
    }


}