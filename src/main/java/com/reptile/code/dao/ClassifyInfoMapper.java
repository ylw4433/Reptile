package com.reptile.code.dao;

import com.reptile.code.entity.ClassifyInfo;

public interface ClassifyInfoMapper {
    int deleteByPrimaryKey(String classifyid);

    int insert(ClassifyInfo record);

    int insertSelective(ClassifyInfo record);

    ClassifyInfo selectByPrimaryKey(String classifyid);

    int updateByPrimaryKeySelective(ClassifyInfo record);

    int updateByPrimaryKey(ClassifyInfo record);
}