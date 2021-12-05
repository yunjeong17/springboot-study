package com.study.project.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.study.project.board.model.BoardService.BoardService;
import com.study.project.board.model.vo.Board;

@RestController
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/board")
	public ResponseEntity<?> getBoardList() {
		List<Board> boardList= boardService.getBoardList();
		return new ResponseEntity<>(boardList,HttpStatus.OK);
	}
	
	@PostMapping("/board")
	public ResponseEntity<?> createBoard(@RequestBody Board board) {
		boardService.createBoard(board);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping("/board/{boardNo}")
	public ResponseEntity<?> getBoard(@PathVariable int boardNo) {
		Board board=boardService.getBoard(boardNo);
		return new ResponseEntity<>(board,HttpStatus.OK);
	}
	
	@PutMapping("/board/{boardNo}")
	public ResponseEntity<?> updateBoard(@PathVariable int boardNo, @RequestBody Board board) {
		board.setBoardNo(boardNo);
		boardService.updateBoard(board);
		return new ResponseEntity<>(board,HttpStatus.OK);
	}
	
	@DeleteMapping("/board/{boardNo}")
	public ResponseEntity<?> deleteBoard(@PathVariable int boardNo) {
		boardService.deleteBoard(boardNo);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
