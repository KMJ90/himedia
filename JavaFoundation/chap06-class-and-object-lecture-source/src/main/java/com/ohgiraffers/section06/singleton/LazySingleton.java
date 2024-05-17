package com.ohgiraffers.section06.singleton;

public class LazySingleton {

    // 클래스가 초기화 되는 시점에 필드를 선언해두고 null 로 초기화된다
    private static LazySingleton lazy;  // 필드 초기화
    private LazySingleton() {}
    public static LazySingleton getInstance() {  // 게으른 초기화의 반환법
        if (lazy == null) {
            lazy = new LazySingleton();
        }
        return lazy;
    }
}
