package com.study.project.board.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.study.project.board.model.dao.BoardDao;
import com.study.project.board.model.vo.Board;

@RunWith(SpringRunner.class) //JUnit에 내장된 실행자 외에 다른 실행자를 실행시키는데, 여기선 SpringRunner 실행자를 사용한다. 즉, 스프링 부터 테스트와 JUnit 사이에 연결자 역할
@SpringBootTest 
@AutoConfigureMockMvc
public class BoardControllerTest {
	@Autowired
	private MockMvc mvc;
	
	@Autowired
	private BoardDao boardDao;
	
	@Test
	public void getBoardListTest() throws Exception {
		mvc.perform(get("/board")).andExpect(status().isOk());
	}
	

	@Before
	public void beforeClass() {
		System.out.println("-----테스트 시작-----");
	}
	
	@After
	public void afterClass() {
		System.out.println("-----테스트 종료-----");
	}

	@Test
	public void createBoardTest() throws Exception{
		//given
		String title="제목입니다";
		String content="내용입니다.";
		int writer=1;
		
		Board board=Board.builder().boardTitle(title).boardContent(content).boardWriter(writer).build();
		
		boardDao.createBoard(board);
		
		//when
		List<Board> result=boardDao.getBoardList();

		//then
		assertThat(result.get(0).getBoardTitle()).isEqualTo(title);
		assertThat(result.get(0).getBoardContent()).isEqualTo(content);
		assertThat(result.get(0).getBoardWriter()).isEqualTo(writer);
		
	}


}
