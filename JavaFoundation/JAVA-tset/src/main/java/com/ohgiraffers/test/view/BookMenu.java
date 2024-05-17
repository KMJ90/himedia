package com.ohgiraffers.test.view;

import com.ohgiraffers.test.controller.BookManager;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);

    BookManager bm = new BookManager();

    // 기본 생성자
    public BookMenu() {}

    // 메소드
    public void menu() {

        while (true) {
            System.out.println("======메뉴=======");
            System.out.println("1. 도서 생성");
            System.out.println("2. 도서 생성");
            System.out.println("3. 도서 생성");
            System.out.println("4. 도서 생성");
            System.out.println("0. 프로그램 종료");

            System.out.print("메뉴 선택 : ");
            int choiceNum = sc.nextInt();

            switch (choiceNum) {
                case 1:
                    bm.addBook(inputBook());
                    break;
                case 0:
                return;
                default:
                    return;
            }
        }

    }

    public BookDTO inputBook() {


        System.out.print("도서 번호 : ");
        int bookNum = sc.nextInt();

        System.out.println("1.인문 / 2.자연과학 / 3.의료 / 4.기타 : ");
        int category = sc.nextInt();

        System.out.println("제목을 입력해 주세요 : ");
        String title = sc.next();

        System.out.println("저자를 입력 : ");
        String author = sc.next();

        BookDTO bookDTO = new BookDTO(bookNum, category, title, author);

        return bookDTO;

//    public String inputBookTitle() {}
    }
}
