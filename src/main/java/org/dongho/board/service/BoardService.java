package org.dongho.board.service;

import java.util.List;

import org.dongho.board.domain.Board;
import org.dongho.board.dto.BoardDTO;
import org.dongho.board.dto.PageDTO;

public interface BoardService {

	// dto가 들어오면 vo를 만드는 메서드
	default Board toDomain(BoardDTO dto) {
		
		Board vo = Board.builder().bno(dto.getBno())
					   .title(dto.getTitle())
					   .content(dto.getContent())
					   .writer(dto.getWriter())
					   .regdate(dto.getRegdate())
					   .updateDate(dto.getUpdateDate())
					   .build();	
		
		return vo;
					   
	}
	
	default BoardDTO toDTO(Board board) {
		
		BoardDTO boardDTO = BoardDTO.builder().bno(board.getBno())
											  .title(board.getTitle())
											  .content(board.getContent())
											  .writer(board.getWriter())
											  .regdate(board.getRegdate())
											  .updateDate(board.getUpdateDate())
											  .build();
		
		return boardDTO;
	
	}
	
	// list 얻어오는 메서드
	public List<BoardDTO> getList(PageDTO pageDTO);
	
	public int getTotalCount();
	
	// register
	public void insert(Board board);
	
	// read
	public Board read(int bno);
}
