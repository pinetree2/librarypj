package com.example.librarypj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;

@Controller
public class LBController {



    // 버튼을 눌렀을때 넘어가게 ..?
    @GetMapping(value = "/crawling")
    public String startCrawl(Model model) throws IOException{
        return "result";
    }
}
