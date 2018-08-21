package com.tpgml.board;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = BoardApplication.class)
@WebAppConfiguration
public class BoardApplicationTests {

	@Autowired
	private SqlSessionFactory sqlSession;
	@Test
	public void contextLoads() {
	}
	
	@Test
	public  void testSqlSession() throws Exception{
		System.out.println("sqlSession : " + sqlSession);
	}

}
