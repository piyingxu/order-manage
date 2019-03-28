package com.great.dto.base;

import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author yinqi
 * @date 2019/3/28
 */
public class PageBaseParam extends BaseEntity {

    /**
     * 要查询的页面数
     */
    @ApiModelProperty(value = "查询页面",example = "1" )
    private int pageNum = 1;

    /**
     * 页面数据大小
     */
    @ApiModelProperty(value = "单页数据大小",example = "10")
    private int pageSize = 10;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.JSON_STYLE);
    }
}