package com.study.project.board.model.dao;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class) 
//@MybatisTest //spring boot - mybatis test 
@Import(BoardDao.class) 
public class BoardDaoTest { 
	@Autowired 
	private BoardDao boardDao;
}


