package com.sparta.junit5practice;

import org.junit.jupiter.api.*;

public class BeforeAfterTest {

    @BeforeEach
    void setUp() {
        System.out.println("@BeforeEach : 각각의 테스트 코드가 실행되기 전에 수행");
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach : 각각의 테스트 코드가 실핼된 후에 수행\n");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("@BeforeAll : 모든 테스트 코드가 실행되기 전에 최초로 수행\n");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("@AfterAll : 모든 테스트 코드가 수행된 후 마지막으로 수행\n");
    }

    @Test
    void test1(){
        System.out.println("코드작성1");
    }

    @Test
    void test2(){
        System.out.println("코드작성2");
    }

}
