package com.ohgiraffers.test2;

import com.ohgiraffers.test1.TestMethod;
import static com.ohgiraffers.test1.TestMethod.TestRandom;  //import문 작성시 아래에 메소드명 앞에 클래스명. 을 생략할 수 있다

public class Application {
    public static void main(String[] args) {

        TestMethod test = new TestMethod();
        test.Calculator(10, 20);
        double result = test.CircleArea();  // test.CircleArea();  ==> 호출문
        System.out.println("원의 부피는 : " + result);  // 출력문


        String str = TestRandom();  // TestRandom(); (메소드명) 앞에 클래스명. 을 넣어주면 위쪽에 import문을 생략할 수 있다
        System.out.println(str);
    }
}
