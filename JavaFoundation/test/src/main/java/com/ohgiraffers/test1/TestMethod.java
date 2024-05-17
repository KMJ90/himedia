package com.ohgiraffers.test1;

import java.util.Random;
import java.util.Scanner;

public class TestMethod {

    // 1.번
   public void Calculator(int a, int b) {   // 리턴값이 없는 메소드 생성 (void 사용)
        System.out.println("두 수를 더한 값은 : " + (a += b) + "입니다.");
        System.out.println("두 수를 뺀 값은 : " + (a -= b) + "입니다.");
        System.out.println("두 수를 곱한 값은 : " + (a *= b) + "입니다.");
        System.out.println("두 수를 나눈 값은 : " + (a /= b) + "입니다.");
        System.out.println("두 수를 나누고 남은 값은 : " + (a %= b) + "입니다.");

    }
    // 2.번
    public double CircleArea() {  // 리턴값( double형 )이 있는 메소드 생성 (public 사용)

        final double PI = 3.14;  // 원주율(PI)을 상수로 선언하고 초기화

        Scanner sc = new Scanner(System.in); // 스캐너 객체생성

        System.out.println("원의 반지름 : ");
        double radius = sc.nextDouble();  //  반지름(radius) 선언 후 초기화

        double result = PI * radius * radius;  //  결과 값 = 원주율 * 반지름 * 반지름

        return result;

    }
    // 3.번
    public static String TestRandom() {

        Random random = new Random();
        int result = random.nextInt(10)+1 ;  // 0부터 10까지의 수는 11자리 임 : (10)+1로 표현함

        String str = "생성 된 난수는 " + result + "입니다";

        return str;
        }
    }

