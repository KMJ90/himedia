package com.ohgiraffers.section03.increment;

public class Application1 {
    public static void main(String[] args) {
        /* 필기.
        *  증감연산자
        *  피연산자의 앞 or 뒤에 사용이 가능하다.
        *  '++' : 1 증가의 의미
        *  '--' : 1 감소의 의미
        *  */

        int num = 20;
        System.out.println("num : " + num);
        
        num++;  // 1 증가
        System.out.println("num : " + num);
        ++num;  // 1 증가 (단독사용 시, ++ 기호는 변수의 앞에 쓰던, 뒤에 쓰던 상관없이 동일하게 작동된다.)
        System.out.println("num : " + num);
        num--;  // 1 감소
        System.out.println("num : " + num);
        --num;  // 1 감소 (-- 기호도 마찬가지로 변수의 앞에 쓰던, 뒤에 쓰던 상관없이 동일하게 작동된다.)
        System.out.println("num : " + num);

        /* 주의사항.
        *  증감연산자는 다른 연산자와 함께 사용할 때 의미가 달라진다.
        *  다른 연산자와 함께 사용할 때 증감연산자의 의미
        *  'var++' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 증가시킴
        *  '++var' : 피연산자의 값을 먼저 1 증가시킨 후 다른 연산을 진행
        *  'var--' : 다른 연산을 먼저 진행하고 난 뒤 마지막에 피연산자의 값을 1 감소시킴
        *  '--var' : 피연산자의 값을 먼저 1 감소시킨 후 다른 연산을 진행
        * */

        int firstNum = 20;

        int result1 = firstNum++ * 3;                   // 다른 연산을 먼저 처리하고 마지막에 증가 처리 됨
        System.out.println("result1 : " + result1);     // 60
        System.out.println("firstNum : " + firstNum);   // 21

        int secondNum = 20;
        int result2 = ++secondNum * 3;                  // 증가를 먼저 처리하고 난 뒤, 다른 연산 처리 됨
        System.out.println("result2 : " + result2);     // 63

        int num1 = 10;
        int addNum = num1++;
        System.out.println("addNum : " + addNum);       // 10

    }
}
