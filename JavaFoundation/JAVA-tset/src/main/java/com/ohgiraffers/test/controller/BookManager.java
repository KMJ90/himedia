package com.ohgiraffers.test.controller;

import com.ohgiraffers.test.model.dto.BookDTO;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookManager {

    ArrayList<BookDTO> arrayList = new ArrayList<>();


    // 기본생성자
    public BookManager() {}

    // 메소드
    public void addBook(BookDTO book) {
        // BookDTO 객체를 ArrayList 에 추가하는 메소드
        arrayList.add(book);
    }
    public void deleteBook(int index) {
//        arrayList.remove();
    }

//    public int searchBook(String Title) {}

    public void printBook(int index) {
    }

    public void displayAll() {
    }

//    public ArrayList<BookDTO> sortedBookList() {}

    public void printBookList(List<BookDTO> brArray) {

        for (BookDTO bDto : arrayList) {
            System.out.println(bDto);
        }
    }
}
