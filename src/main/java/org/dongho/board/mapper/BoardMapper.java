package org.dongho.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.dongho.board.domain.Board;
import org.dongho.board.dto.BoardDTO;

public interface BoardMapper {

	public List<Board> getList(@Param("skip") int skip , @Param("count") int count);
	
	public int getTotalCount();
	
	public Board read(int bno);
	
	void insert (Board board);
	
	boolean delete(int bno);
	
	boolean update(BoardDTO boardDTO);
	
	
}
