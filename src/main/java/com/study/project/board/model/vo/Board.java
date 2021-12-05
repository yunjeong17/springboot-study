package com.study.project.board.model.vo;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Board {
	private int boardNo;//	BOARD_NO
	private String boardTitle;//	BOARD_TITLE
	private String boardContent;//	BOARD_CONTENT	
	private int boardWriter;//	BOARD_WRITER
	private int count;//	COUNT
	private LocalDateTime createDate;//	CREATE_DATE
	private String status; //	STATUS

	@Builder
	public Board(String boardTitle, String boardContent, int boardWriter) {
		super();
		this.boardTitle = boardTitle;
		this.boardContent = boardContent;
		this.boardWriter = boardWriter;
	}	
		
}
