package com.logbook.business.mapper;

import com.logbook.business.model.LogThreadDraftEntity;

public interface LogThreadDraftEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LogThreadDraftEntity record);

    int insertSelective(LogThreadDraftEntity record);

    LogThreadDraftEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LogThreadDraftEntity record);

    int updateByPrimaryKey(LogThreadDraftEntity record);
}