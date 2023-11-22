package com.example.serivce

import com.example.dto.BoardFormDto
import com.example.model.Board
import com.example.repository.BoardRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class BoardService @Autowired constructor(
    val boardRepository: BoardRepository,
    val modelMapper: ModelMapper
){
    fun save(boardFormDto: BoardFormDto): Long? {
        return boardRepository.save(modelMapper.map(boardFormDto, Board::class.java)).id
    }
}