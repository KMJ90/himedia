package com.ohgiraffers.test1;

public class Application {
    public static void main(String[] args) {

        // 1.번
        int inum = 1;
        float fnum = 0.1f;
        double dnum = 0.2d;
        boolean bnum = true;
        char ch = 'A';
        byte by = 2;
        short snum = 1;
        long lnum = 1;

        // 2.번
        int num = (int) (inum + lnum);  // long을 int로 바꾸는 공식 // (int + long)은 long

        // 3.번
        int count = -10;

        String str = (count > 0)? "양수입니다" : "음수입니다";

        System.out.println("음수 or 양수 결과는 : " + str);

    }
}
