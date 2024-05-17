package com.ohgiraffers.section1.method;

public class pretice1 {
    public static void main(String[] args) {

        int num = 5;
        pretice1 pre1 = new pretice1();
        pre1.method(num);
    }
    public void method(int num) {
        String sum = (num % 2 == 0)? "짝수입니다" : "홀수입니다";
        System.out.println("수는" + num + sum);
    }
}


