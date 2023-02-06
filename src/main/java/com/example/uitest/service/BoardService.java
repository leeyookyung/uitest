package com.example.uitest.service;

import com.example.uitest.entity.board;
import com.example.uitest.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;
    public void write(board board){

        boardRepository.save(board);
    }
    @Autowired
    public List<board> boardlist() {
        return boardRepository.findAll();

    }
}
