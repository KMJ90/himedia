package com.ohgiraffers.section06.staticKeyword;

public class StaticMethodTest {

    private int count;  // 핃드 선언
    public void nonStaticMethod() {
        this.count++;  // 인스턴스 생성 후 사용 가능한 메소드이기 때문에 this 에 주소가 들어있다
        System.out.println("nonStaticMethodTest");
    }
    public static void staticMethod() {
//        this.count++;  // 인스턴스를 생성하지 않고 사용하는 메소드이기 때문에 this 에는 주소가 들어갈 수 없다

        System.out.println("staticMethod 호출됨");
    }
}
