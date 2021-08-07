package com.logbook.business.service;

import com.logbook.business.mapper.LogComForumEntityMapper;
import com.logbook.business.model.LogComForumEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class LogChannelService {

    @Autowired
    private LogComForumEntityMapper logComForumEntityMapper;

    public List<LogComForumEntity> getAllChannel() {
       return logComForumEntityMapper.selectAll();
    }
}
