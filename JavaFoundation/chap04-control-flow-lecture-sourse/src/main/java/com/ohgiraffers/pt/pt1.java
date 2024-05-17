package com.ohgiraffers.pt;

import java.util.Scanner;

public class pt1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("나이가 어떻게 되세요?");
        int age = 0;

        System.out.print("나이 입력 : ");
        age = sc.nextInt();

        if(age >= 20) {
            System.out.print("판매 가능합니다.");
        } else {
            System.out.print(" 판매 불가능합니다. 음료 코너에서 골라주세요.");
        }
    }
}
