package org.dongho.board.mapper;

import org.dongho.board.config.BoardConfig;
import org.dongho.board.domain.Board;
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
public class BoardMapperTests {

	@Autowired
	private BoardMapper mapper;
	
	@Test
	public void testInsert() {
		Board vo = Board.builder().title("mapper 테스트").content("content 테스트").writer("writer 테스트").build();
		
		mapper.insert(vo);
	}
	
	@Test
	public void testRead() {
		log.info(mapper.read(3));
	}
	
}
