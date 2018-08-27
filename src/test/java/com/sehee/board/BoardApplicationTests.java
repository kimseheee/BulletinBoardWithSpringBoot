package com.sehee.board;

import java.sql.Connection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.board.domain.BoardVO;
import com.board.mapper.BoardMapper;
import com.tpgml.board.BoardApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BoardApplication.class)
@WebAppConfiguration
public class BoardApplicationTests {

	@Autowired
	private BoardMapper mapper;
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testMapper() throws Exception {
		BoardVO vo = new BoardVO();
		vo.setSubject("Subject");
		vo.setContent("Content");
		vo.setWriter("Writer");
		
		mapper.boardInsert(vo);
	}

}
