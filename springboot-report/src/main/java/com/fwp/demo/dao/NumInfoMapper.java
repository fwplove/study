package com.fwp.demo.dao;


import com.fwp.demo.entity.NumInfo;
import com.fwp.demo.entity.NumInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NumInfoMapper {
    int deleteByPrimaryKey(String numId);

    int insert(NumInfo record);

    int insertSelective(NumInfo record);

    NumInfo selectByPrimaryKey(String numId);

    int updateByPrimaryKeySelective(NumInfo record);

    int updateByPrimaryKey(NumInfo record);
}
