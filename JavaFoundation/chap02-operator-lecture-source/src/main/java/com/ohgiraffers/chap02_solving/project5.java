package com.ohgiraffers.chap02_solving;

public class project5 {
    public static void main(String[] args) {

        int month = 9;
        int day = 20;
        String name = "본인이름";

        String gift = (month <= 6 && day <= 15)? "배민쿠폰" :
                (month >= 7 && day >= 16)? "스타벅스터피" : "사탕";

        System.out.println (name + "님의 선물은 " + gift);

    }
}

