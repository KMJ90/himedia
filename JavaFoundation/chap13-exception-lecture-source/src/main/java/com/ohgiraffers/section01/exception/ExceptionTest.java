package com.ohgiraffers.section01.exception;

public class ExceptionTest {

    // 돈을 얼마나 가지고 있는지 확인하는 구문
    public void checkEnoughMoney(int price, int money) throws Exception {  // throws Exception : 예외처리 위임
        System.out.println("가지고 계신 돈은 " + money + "원 입니다.");

        if (money >= price) {
            System.out.println("상품을 구입하기 위한 금액이 충분합니다.");

        } else {
            throw new Exception();  // 예외 발생
        }

        System.out.println("즐거운 쇼핑 하세요~");
    }
}
