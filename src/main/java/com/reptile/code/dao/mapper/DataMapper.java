package com.reptile.code.dao.mapper;

import com.reptile.code.dao.entity.Data;
import com.reptile.code.dao.entity.DataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface DataMapper {
    long countByExample(DataExample example);

    int deleteByExample(DataExample example);

    int deleteByPrimaryKey(String issueid);

    int insert(Data record);

    int insertSelective(Data record);

    List<Data> selectByExampleWithRowbounds(DataExample example, RowBounds rowBounds);

    List<Data> selectByExample(DataExample example);

    Data selectByPrimaryKey(String issueid);

    int updateByExampleSelective(@Param("record") Data record, @Param("example") DataExample example);

    int updateByExample(@Param("record") Data record, @Param("example") DataExample example);

    int updateByPrimaryKeySelective(Data record);

    int updateByPrimaryKey(Data record);
}