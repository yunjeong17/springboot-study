package com.study.project.board.model.BoardService;

import java.util.List;

import com.study.project.board.model.vo.Board;

public interface BoardService {

	List<Board> getBoardList();
	void createBoard(Board board);
	Board getBoard(int boardNo);
	void updateBoard(Board board);
	void deleteBoard(int boardNo);

}
