package com.great.dto.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.great.dto.base.PageBaseParam;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * 商品(包含类目)
 * Created by yinqi
 * 2019-03-28
 */
@Data
public class ProductReq extends PageBaseParam {

    private static final long serialVersionUID = 6486413067728884469L;

    @ApiModelProperty(value = "商户id", example = "7866619", required = true)
    private String merchantId;
}
