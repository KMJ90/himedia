package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);

    private BookManager bm;

    // 기본 생성자
    public BookMenu() {
        this.bm = new BookManager();
    }


    // 메소드
    public void mainMenu() {
        // *** 도서 관리 프로그램 ***
        // 1. 새 도서 추가 // addBook (inputBook()이 리턴한 객체) 실행
        // 2. 도서정보 정렬 후 출력 // printBookList() 실행
        //                       =>인자로 selectSortedBook()하여 리턴받은 리스트 객체사용
        // 3. 도서 삭제 // deleteBook (inputBookNo()이 리턴한 도서 번호) 실행
        // 4. 도서 검색출력 // searchBook (inputBookTitle()이 리턴한 도서 제목) 실행
        //                => 결과가 있는경우 해당 도서를 출력하고,
        //                   결과가 없는 경우 “조회한 도서가 목록에 없습니다.”
        // 5. 전체 출력 // displayAll() 실행
        //             => 비어있을 경우 “출력결과가 없습니다.”
        //                비어있지 않은 경우 전체 출력
        // 6. 끝내기 // main()으로 리턴
        // 메뉴 번호 선택 : >> 입력 받음
        // 메뉴 화면 반복 실행 처리
        // 해당 메뉴 번호에 따라 BookManager 클래스 메소드 실행
    }

    public BookDTO inputBook() {
        // "도서 제목 : " >> 입력 받음
        // "도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : " >> 입력 받음 (숫자로)
        // "도서 저자 : " >> 입력 받음

        System.out.println("도서 번호 : ");
        int bNo = sc.nextInt();

        System.out.println("도서 제목 : ");
        String title = sc.nextLine();

        System.out.println("(1.인문 / 2.자연과학 / 3.의료 / 4.기타) : ");
        int category = sc.nextInt();

        System.out.println("도서 저자 : ");
        String author = sc.nextLine();

        // 매개변수 생성자를 이용하여 위의 초기값을 이용한 BookDTO 객체 리턴
        return new BookDTO (bNo, category, title, author);  // new 를 붙여서 초기화
    }

    public int inputBookNo() {
        // “도서 번호 : “ >> 입력 받음 >> 리턴
        System.out.println("도서 번호 : ");
        int bNo = sc.nextInt();
        return bNo;
    }

    public String inputBookTitle() {
        // “도서 제목 : “ >> 입력 받음 >> 리턴
        System.out.println("도서 제목 : ");
        String title = sc.nextLine();
        return title;
    }

     public List<BookDTO> selectSortedBook() {
         // 도서 정렬방식을 정수로 입력받아서
         // 1. 도서번호(ISBN)으로 오름차순정렬
         // 2. 도서번호(ISBN)으로 내림차순정렬
         // 3. 책 제목으로 오름차순 정렬
         // 4. 책 제목으로 내림차순 정렬
         // BookManager 객체의 sortedBookList() 메소드를 이용하여 출력
         System.out.println("도서 정렬방식을 선택하세요(1번 ~ 4번 택1) : ");
         int select = sc.nextInt();
    }
}
