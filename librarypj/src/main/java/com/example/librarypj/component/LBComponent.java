package com.example.librarypj.component;

import com.example.librarypj.LibrarypjApplication;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class LBComponent {
    public static void main(String[] args) {
        SpringApplication.run(LibrarypjApplication.class, args);
        getSeats();

    }

    public static void getSeats() {
        //jsoup 객체 선언과 url 삽입
        //final : 수정할 수 없는 변수
        final String libUrl = "http://203.229.203.240/8080/Domian5_jythh.asp";

        try {
            Connection con = Jsoup.connect(libUrl); //연결
            Document doc = con.get(); //가져온다~
//			System.out.println(doc);
            getSeatsName(doc);
            getSeatsNum(doc);
//			String SeatsNum = getSeatsNum(doc);
//			String SeatsName = getSeatsName(doc);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void getSeatsName(org.jsoup.nodes.Document doc) {

    }

    public static void getSeatsNum(org.jsoup.nodes.Document doc) {

        Elements elements = doc.select("tr");
        System.out.println(elements);


    }
}
