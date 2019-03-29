package com.great.dao;

import com.great.dto.req.DishesInfoReq;
import com.great.dto.req.ProductReq;
import com.great.model.DishesInfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface DishesInfoMapper {

    int deleteByPrimaryKey(String id);

    int insert(DishesInfo record);

    int insertSelective(DishesInfo record);

    DishesInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DishesInfo record);

    int updateByPrimaryKey(DishesInfo record);

    List<DishesInfo> selectConditions(@Param("conditions") ProductReq conditions);
}