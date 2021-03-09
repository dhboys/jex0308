package org.dongho.board;

import org.dongho.board.config.BoardConfig;
import org.dongho.board.mapper.BoardMapper;
import org.dongho.common.config.CommonConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CommonConfig.class , BoardConfig.class})
@Log4j
public class BoardTests {

	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void testList() {
		mapper.getList().forEach(b -> log.info(b));
	}
	
}
