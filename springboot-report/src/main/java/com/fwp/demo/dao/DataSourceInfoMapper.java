package com.fwp.demo.dao;


import com.fwp.demo.entity.DbInfo;

import java.util.List;

public interface DataSourceInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(DbInfo record);

    int insertSelective(DbInfo record);

    DbInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(DbInfo record);

    int updateByPrimaryKey(DbInfo record);

    List<DbInfo> getInfoList();

    int usedCount(String id);
}
