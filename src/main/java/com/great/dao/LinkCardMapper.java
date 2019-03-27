package com.great.dao;

import com.great.model.LinkCard;

public interface LinkCardMapper {
    int deleteByPrimaryKey(String id);

    int insert(LinkCard record);

    int insertSelective(LinkCard record);

    LinkCard selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(LinkCard record);

    int updateByPrimaryKey(LinkCard record);
}