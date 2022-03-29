package com.example.librarypj;

import com.example.librarypj.controller.HomeController;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;


@SpringBootApplication
public class LibrarypjApplication {
    public static void main(String[] args) {
        SpringApplication.run(LibrarypjApplication.class, args);
    }
}


