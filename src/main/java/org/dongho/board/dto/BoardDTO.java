package org.dongho.board.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardDTO {

	private Integer bno;
	private String title,content,writer;
	private Date regdate,updateDate;
	
}
