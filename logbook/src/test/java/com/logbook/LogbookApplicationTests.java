package com.logbook;

import com.logbook.business.user.mapper.LogUserEntityMapper;
import com.logbook.business.user.model.LogUserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LogbookApplicationTests {

	@Autowired
	private LogUserEntityMapper logUserEntityMapper;

	@Test
	void contextLoads() {
		LogUserEntity logUserEntity = new LogUserEntity();
//		logUserEntityMapper.insert(logUserEntity);
	}

}
