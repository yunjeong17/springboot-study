package com.study.project.board.model.BoardService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.project.board.model.dao.BoardDao;
import com.study.project.board.model.vo.Board;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDao boardDao;

	@Override
	public List<Board> getBoardList() {
		// TODO Auto-generated method stub
		return boardDao.getBoardList();
	}

	@Override
	public void createBoard(Board board) {
		// TODO Auto-generated method stub
		boardDao.createBoard(board);
	}

	@Override
	public Board getBoard(int boardNo) {
		// TODO Auto-generated method stub
		return boardDao.getBoard(boardNo);
	}

	@Override
	public void updateBoard(Board board) {
		// TODO Auto-generated method stub
		boardDao.updateBoard(board);
	}

	@Override
	public void deleteBoard(int boardNo) {
		// TODO Auto-generated method stub
		boardDao.deleteBoard(boardNo);
	}
	
	
}
