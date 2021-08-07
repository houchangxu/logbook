package com.logbook.business.mapper;

import com.logbook.business.model.LogPostEntity;
import com.logbook.business.model.LogPostPageBo;
import com.logbook.business.web.domain.LogPostPageVo;
import com.logbook.business.web.request.LogPostRequestParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LogPostEntityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LogPostEntity record);

    int insertSelective(LogPostEntity record);

    LogPostEntity selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LogPostEntity record);

    int updateByPrimaryKey(LogPostEntity record);

    List<LogPostPageBo> getPage(@Param("param") LogPostRequestParam param);
}