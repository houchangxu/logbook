package com.logbook.business.service;

import com.logbook.business.mapper.LogTagEntityMapper;
import com.logbook.business.model.LogTagEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class LogTagService {

    @Autowired
    private LogTagEntityMapper logTagEntityMapper;

    public List<LogTagEntity> getAllTag() {
       return logTagEntityMapper.selectAll();
    }
}
