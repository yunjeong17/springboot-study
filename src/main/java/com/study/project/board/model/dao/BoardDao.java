package com.study.project.board.model.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.study.project.board.model.vo.Board;


public interface BoardDao {
	
	List<Board> getBoardList();
	void createBoard(Board board);
	Board getBoard(int boardNo);
	void updateBoard(Board board);
	void deleteBoard(int boardNo);
	
}
