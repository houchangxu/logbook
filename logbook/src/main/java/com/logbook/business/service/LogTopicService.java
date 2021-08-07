package com.logbook.business.service;

import com.logbook.business.mapper.LogComTopicEntityMapper;
import com.logbook.business.mapper.LogTagEntityMapper;
import com.logbook.business.model.LogComTopicEntity;
import com.logbook.business.model.LogTagEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class LogTopicService {

    @Autowired
    private LogComTopicEntityMapper logComTopicEntityMapper;

    public List<LogComTopicEntity> getAllTopic() {
       return logComTopicEntityMapper.selectAll();
    }
}
