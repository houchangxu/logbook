package com.logbook.business.mapper;

import com.logbook.business.model.LogComTopicEntity;

import java.util.List;

public interface LogComTopicEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LogComTopicEntity record);

    int insertSelective(LogComTopicEntity record);

    LogComTopicEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LogComTopicEntity record);

    int updateByPrimaryKey(LogComTopicEntity record);

    List<LogComTopicEntity> selectAll();
}