package com.test;

import java.util.Scanner;

public class Person {

    // 사람의 속성 : 이름(String), 나이(int), 국적(String), 강아지(클래스) -- 캡슐화

    // 필드 생성
    private String name;  // 이름
    private int age;  // 나이
    private String nationality;  // 국적
    private Dog dog;


    // 기본 생성자
    public Person() {}

    // 매개변수 받는 생성자  : 이 구문이 작성되어 있으면,
    // Application 에서 ()안에 매개변수를 직접적으로 작성할 수 있다 (예: "홍길동", 30)
    // 출력문을 Application 에 작성하지 않고 메소드에 작성하려면 ()안의 매개변수가 없어야 한다
    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void setNational(String national) {
        // String[] 로 국적배열 만든 후 반복문, 조건문 작성
        String[] nationality2 = {"한국","일본","중국","홍콩","터키"};
//
        // 방법 1. 향상된 for 문 사용
//        for(String s : nationality2) {
//            if(s.equals(national)) {
//                this.nationality = national;
//                break;
//            } else {
//                this.nationality = "한국";
//            }
//        }

        // 방법 2. 조건문(for)문 사용
        for (int i = 0; i < nationality2.length; i++) {
            if (nationality2[i].equals(national)) {
                this.nationality = national;
                break;
            } else {
                this.nationality = "한국";
            }
        }
    }
    public void adoptDog(String dogName) {
        // 강아지 이름을 입력받고, 입력받은 이름을 속성으로 강아지 객체 생성하여
        // 이 사람의 강아지로 설정

        // 입력받은 이름을 속성으로 객체 생성
        Dog dogObject = new Dog(dogName);
        this.dog = dogObject;

    }
    public void teachDog(String[] talent) {
        // 내 강아지의 재주를 설정
        dog.learnAbility(talent);

    }
    // 강아지에게 재주 시키기
    public void orderToDog() {
        // 1. void 메소드 출력
        // 2. String 으로 변경하여 출력
        // 출력예시) 뽀삐는 앉아! 를 할 수 있어요:) or 뽀삐는 짖어! 를 배우지 않았어요
        // 3. boolean 으로 변경하여 출력
        // 출력예시) 뽀삐는 앉아! 를 배웠어요!! or 뽀삐는 짖어! 를 할 수 없어요

    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", dog=" + dog +
                '}';
    }
}
