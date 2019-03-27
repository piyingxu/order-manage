package com.great.dao;


import com.great.model.EvaluationInfo;

public interface EvaluationInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(EvaluationInfo record);

    int insertSelective(EvaluationInfo record);

    EvaluationInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(EvaluationInfo record);

    int updateByPrimaryKey(EvaluationInfo record);
}