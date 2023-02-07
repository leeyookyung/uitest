package com.example.uitest.Controller;

import com.example.uitest.entity.board;
import com.example.uitest.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UIController {
    @Autowired
    private BoardService boardService;

    @GetMapping("/")
    public String UI(Model model) {
        return "UiTemplate";
    }

    @PostMapping("/UIpro")
    public String UIpro(board board, String title, String content) {

        System.out.println(title);
        System.out.println(content);
//        boardService.write(board);
        return "";
    }
        @GetMapping("/list")
        public String boardlist(Model model) {
        model.addAttribute("list", boardService.boardlist());
            return "boardlist";
    }
}

//    @PostMapping("/UIpro")
//    public String UIpro(board board, String title, String content) {
//
//        System.out.println(title);
//        System.out.println(content);
//        //System.out.println(board,getTitle());
//        //boardService.write(board);
//        return "Uipro";
//    }
//    @GetMapping("/list")
//    public String boardlist(Model model) {
//        model.addAttribute("list", boardService.boardlist());
//        return "boardlist";

