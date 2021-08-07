package com.logbook.business.mapper;

import com.logbook.business.model.LogComForumEntity;
import com.logbook.business.model.LogTagEntity;

import java.util.List;

public interface LogTagEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LogTagEntity record);

    int insertSelective(LogTagEntity record);

    LogTagEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LogTagEntity record);

    int updateByPrimaryKey(LogTagEntity record);

    List<LogTagEntity> selectAll();
}