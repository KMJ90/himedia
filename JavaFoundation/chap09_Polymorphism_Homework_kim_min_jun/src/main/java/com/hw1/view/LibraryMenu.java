package com.hw1.view;

import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {

    LibraryManager Im;  // 초기화 생성
    Scanner sc = new Scanner(System.in);  // 초기화 생성

    public void mainMenu() {

        Member member = new Member();  // Member 객체 생성

        System.out.println("이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.println("나이를 입력하세요 : ");
        int age = sc.nextInt();

        System.out.println("성별을 입력하세요 : ");
        char gender = sc.nextLine().charAt(0);
    }
    public void selectAll() {

    }
    public void searchBook() {

    }
    public void rentBook() {

    }
}
