package com.great.dto.base;

import java.io.Serializable;
import com.alibaba.fastjson.JSONObject;
import com.great.util.GsonUtils;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class BaseEntity implements Serializable {

    @Override
    public String toString() {
        return GsonUtils.fromObject2Json(this);
    }

    @Override
    public int hashCode() {
        return this.toString().length();
    }

    @Override
    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }
}
