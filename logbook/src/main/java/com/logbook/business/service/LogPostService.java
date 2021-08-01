package com.logbook.business.service;

import com.logbook.business.mapper.LogPostEntityMapper;
import com.logbook.business.model.LogPostEntity;
import com.logbook.business.web.domian.LogPostVo;
import com.logbook.business.web.request.LogPostRequestParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class LogPostService {

    @Autowired
    private LogPostEntityMapper logPostEntityMapper;

    public List<LogPostVo> getPage(LogPostRequestParam logPostRequestParam){
        logPostRequestParam.setLimit(logPostRequestParam.getPageNo()+logPostRequestParam.getPageSize());
        List<LogPostEntity> logPosts = logPostEntityMapper.getPage(logPostRequestParam);
        return logPosts.stream().map(logPostEntity -> {
            LogPostVo logPostVo = new LogPostVo();
            BeanUtils.copyProperties(logPostEntity, logPostVo);
            log.info("this is info");
            return logPostVo;
        }).collect(Collectors.toList());
    }
}
