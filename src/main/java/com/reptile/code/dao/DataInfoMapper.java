package com.reptile.code.dao;

import com.reptile.code.entity.DataInfo;

public interface DataInfoMapper {
    int deleteByPrimaryKey(String issueid);

    int insert(DataInfo record);

    int insertSelective(DataInfo record);

    DataInfo selectByPrimaryKey(String issueid);

    int updateByPrimaryKeySelective(DataInfo record);

    int updateByPrimaryKey(DataInfo record);
}