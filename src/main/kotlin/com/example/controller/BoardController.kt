package com.example.controller

import com.example.dto.BoardFormDto
import com.example.model.Board
import com.example.serivce.BoardService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("board")
class BoardController @Autowired constructor(val boardService: BoardService) {

    //게시글 등록
    @PostMapping
    fun addPost(boardFormDto: BoardFormDto): ResponseEntity<Any> {
        val save = boardService.save(boardFormDto)
        return ResponseEntity.ok().body(save)
    }




}