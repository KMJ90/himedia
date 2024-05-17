package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.awt.print.Book;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookManager {

    Scanner sc = new Scanner(System.in);

    ArrayList<BookDTO> bookList = new ArrayList<>();

    // 기본 생성자
    public BookManager() {}

    // 메소드
    public void addBook(BookDTO book) {
        // 해당 BookDOT 객체를 리스트에 담기
    }

    public void deleteBook(int key) {
        // 전달받은 위치의 인덱스 값 제거
    }

    public void searchBook(String title) {
        // 전달받은 제목으로 리스트에서 조회하여 일치하는 객체가 있으면
        // 해당 도서정보를 출력하고, 없는경우 “조회된 도서가 목록에 없습니다”를 출력
    }

    public void displayAll() {
        // 도서목록 전체 출력
    }

    public List<BookDTO> sortedBookList(int type) {
        // 정렬방식별 오름차순/내림차순 정렬 (switch 문 이용)
    }

    public void printBookList (List<BookDTO> printList) {
        // 전달받은 리스트 객체의 내용 출력
    }
}
