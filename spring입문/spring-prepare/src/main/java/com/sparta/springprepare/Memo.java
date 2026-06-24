package com.sparta.springprepare;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor     //클래스의 모든 필드를 매개변수로 받는 생성자(Constructor)를 자동으로 만들어다
@NoArgsConstructor      //매개변수가 없는 기본 생성자(Default Constructor)를 자동 생성
public class Memo {
    private String username;
    private String contents;
}

class Main {
    public static void main(String[] args){
        Memo memo = new Memo();
        memo.setUsername("taeheeKim");
        memo.setContents("oop");
        System.out.println("----------------------");
        System.out.println(memo.getUsername());
        System.out.println(memo.getContents());
    }
}