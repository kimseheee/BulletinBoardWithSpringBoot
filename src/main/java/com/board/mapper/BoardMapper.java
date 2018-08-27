package com.board.mapper;

import java.util.List;

import com.board.domain.BoardVO;

public interface BoardMapper {
	public void boardInsert(BoardVO board)throws Exception;
	public List<BoardVO>boardList() throws Exception;
}
