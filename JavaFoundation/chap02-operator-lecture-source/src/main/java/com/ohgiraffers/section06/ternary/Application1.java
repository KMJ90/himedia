package com.ohgiraffers.section06.ternary;

public class Application1 {
    public static void main(String[] args) {
        /* 삼항 연산자란
        *  자바에서 유일하게 피연산자 항목이 3개인 연산자이다.
        *  (조건식)? 참일 때 사용할 값 : 거짓일 때 사용할 값
        *  */

        /* 삼항 연산자 단독 사용 */
        int num1 = 10;
        int num2 = -10;
        String result1 = (num1 > 0)? "양수" : "양수 아님";
        String result2 = (num2 > 0)? "양수" : "양수 아님";
        System.out.println("result1 : " + result1);     // 양수
        System.out.println("result2 : " + result2);     // 양수 아님

        /* 삼항 연산자 중첩 사용 */
        int num3 = 5;
        int num4 = 0;
        int num5 = -5;

        String result3 = (num3 > 0)? "양수" : (num3 == 0)? "0" : "음수";
        String result4 = (num4 > 0)? "양수" : (num4 == 0)? "0" : "음수";
        String result5 = (num5 > 0)? "양수" : (num5 == 0)? "0" : "음수";
        System.out.println("result3 : " + result3);     // 양수
        System.out.println("result4 : " + result4);     // 0
        System.out.println("result5 : " + result5);     // 음수


    }
}
