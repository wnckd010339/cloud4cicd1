package com.example.cloud4cicd1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hi")
    public  String hi(){
        return  "hi";
    }



    @GetMapping("/hi2")
    public  String hi2(){
        return  "hi2";
    }



    @GetMapping("/hi3")
    public  String hi3(){
        return  "hi3";
    }
}
