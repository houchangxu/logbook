package com.logbook.business.user.mapper;

import com.logbook.business.user.model.LogUserEntity;

public interface LogUserEntityMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(LogUserEntity record);

    int insertSelective(LogUserEntity record);

    LogUserEntity selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(LogUserEntity record);

    int updateByPrimaryKey(LogUserEntity record);
}