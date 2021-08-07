package com.logbook.business.mapper;

import com.logbook.business.model.LogComForumEntity;

import java.util.List;

public interface LogComForumEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LogComForumEntity record);

    int insertSelective(LogComForumEntity record);

    LogComForumEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LogComForumEntity record);

    int updateByPrimaryKeyWithBLOBs(LogComForumEntity record);

    int updateByPrimaryKey(LogComForumEntity record);

    List<LogComForumEntity> selectAll();
}