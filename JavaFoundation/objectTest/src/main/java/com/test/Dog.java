package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class Dog {
    // 강아지 속성 : 이름(String), 재주(String[])
    private String name;  // 이름
    private String[] talent;  // 재주

    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();

    // 기본 생성자
    public Dog() {}

    // 강아지의 이름만 불러오기 위해 매개변수 (이름)만 받는 생성자 생성
    public Dog(String name) {

        this.name = name;
    }

    // 강아지의 재주만 받는 생성자
    public Dog(String[] talent) {

        this.talent = talent;
    }

    // 재주가 담긴 메소드
    public void learnAbility(String[] talent) {
        this.talent = talent;
    }
        // 강아지의 정보가 출력되는 조회 메소드
        // 이름과 재주가 출력되도록 하기!!
        // (재주는 배열이기 때문에 for 문 사용)
        // Arrays.toString()

    // Dog 의 반환타입인 void 인 메소드 호출
    public void doSomeThingVoid(String talent) {
        // switch 문 사용 작성
        switch (talent) {
            case "앉아" :
                System.out.println("앉아!를 할 수 있어요:)");
                break;
            case "빵" :
                System.out.println("죽는 연기를 할 수 있어요");
                break;
            case "기다려" :
                System.out.println("기다릴 수 있어요");
                break;
        }
        System.out.println("아직 못배운 재주에요");
    }
    public String doSomeThingVoid2(String talent) {
        switch (talent) {
            case "앉아" :
                System.out.println("앉아 를 실행");
                return input;
            case "빵" :
                System.out.println("빵 을 실행");
                return input;
            case "기다려" :
                System.out.println("기다려 를 실행");
                return input;
        }
        return "알 수 없는 재주에요";
    }
    public boolean doSomeThingVoid3(boolean talent) {
        switch (talent) {
            if (input.equals("앉아")) {
                System.out.println("o");
            }
        }
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", talent='" + Arrays.toString(talent) + '\'' +
                '}';
        // Arrays.toString 작성시 콘솔창에 출력될때 []괄호로 묶어줄 수 있음
        // 이런식으로 출력됨 --> talent='[앉아, 빵, 기다려]
    }
}
