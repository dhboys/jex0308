package org.dongho.board.service;

import org.dongho.board.domain.Board;
import org.dongho.board.dto.BoardDTO;

public interface BoardService {

	// dto가 들어오면 vo를 만드는 메서드
	default Board toDomain(BoardDTO dto) {
		
		Board.builder().bno(dto.getBno())
					   .title(dto.getTitle())
					   .content(dto.getContent())
					   .writer(dto.getWriter())
					   .regdate(dto.getRegdate())
					   .updateDate(dto.getUpdateDate())
					   .build();
		
		return null;
					   
	}
	
}
