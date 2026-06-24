package com.sparta.springprepare.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println("--------------------------");
        System.out.println("hello World!");
        return "hello World!";
    }

    @GetMapping("/get")
    @ResponseBody
    public String get(){
        System.out.println("--------------------------");
        System.out.println("Get Method 요청");
        return "Get Method 요청";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post(){
        System.out.println("--------------------------");
        System.out.println("Post Method 요청");
        return "Post Method 요청";
    }

    @PutMapping("/put")
    @ResponseBody
    public String put(){
        System.out.println("--------------------------");
        System.out.println("put Method 요청");
        return "put Method 요청";
    }

    @DeleteMapping("/delete")
    @ResponseBody
    public String delete(){
        System.out.println("--------------------------");
        System.out.println("delete Method 요청");
        return "delete Method 요청";
    }
}
