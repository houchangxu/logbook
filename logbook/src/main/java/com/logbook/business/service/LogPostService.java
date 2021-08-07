package com.logbook.business.service;

import com.logbook.business.mapper.LogPostEntityMapper;
import com.logbook.business.model.LogPostPageBo;
import com.logbook.business.web.domain.LogPostPageVo;
import com.logbook.business.web.request.LogPostRequestParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@Slf4j
public class LogPostService {

    @Autowired
    private LogPostEntityMapper logPostEntityMapper;

    public List<LogPostPageVo> getPage(LogPostRequestParam logPostRequestParam) {
        logPostRequestParam.setLimit(logPostRequestParam.getPageNo() + logPostRequestParam.getPageSize());
        List<LogPostPageBo> logPosts = logPostEntityMapper.getPage(logPostRequestParam);
        return logPosts.stream().map(logPostEntity -> {
            LogPostPageVo logPostVo = new LogPostPageVo();
            BeanUtils.copyProperties(logPostEntity, logPostVo);
            logPostVo.setImage(Optional.ofNullable(logPostEntity.getImage()).map(i -> Arrays.stream(logPostEntity.getImage().split(",")).filter(Objects::nonNull).collect(Collectors.toList())).orElse(null));
            return logPostVo;
        }).collect(Collectors.toList());
    }
}
