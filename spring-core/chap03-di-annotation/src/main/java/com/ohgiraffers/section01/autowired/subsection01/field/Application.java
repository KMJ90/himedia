package com.ohgiraffers.section01.autowired.subsection01.field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        BookService bookService = context.getBean("bookServiceField", BookService.class);

        // forEach : 함수를 인자로 받아 반복적으로 사용
        // 전체 도서 목록 조회 후 출력 확인
        bookService.selectAllBooks().forEach(System.out::println);  // System.out.println 메소드를 통해 출력하겠다

        // 도서 번호로 도서 조회 후 출력 확인
        System.out.println(bookService.searchBookBySequence(1));
        System.out.println(bookService.searchBookBySequence(2));
    }
}
