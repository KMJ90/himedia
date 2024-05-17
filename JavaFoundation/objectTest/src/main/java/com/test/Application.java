package com.test;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // 1. 사람 생성(이름, 나이는 생성과 동시에 초기화되어야 함)

        // 2. 1.에서 만든 사람의 국적 설정
        // (한국, 일본, 중국, 홍콩, 터키 중 하나만 가능 / 만약 다른 국가를 입력했다면 '한국' 자동 설정)

        // 3. 강아지 입양 -> 사람이 할 수 있는 일 (= Person 의 메소드를 호출해서 Dog 를 추가)
        // 단, 강아지는 반드시 이름이 있어야 함 (강아지 입력 스캐너로 입력 받기)

        // 4. 강아지에게 재주 가르치기 -> 사람이 할 수 있는 일
        // (=Person 의 매개변수가 있는 메소드를 호출해서 dog 의 ability 추가)

        // 5. 강아지에게 재주 시키기 -> 사람이 할 수 있는 일 (= Person 의 메소드)
        // 1) 강아지에게 재주를 시키면 어떤 재주를 시킬지 입력받는다 (= Person 의 메소드 호출)
        // 2) 입력받은 재주를 강아지가 하도록 시킨다 (= Person 의 메소드 동작 내용)
        // 3) 강아지는 할 수 있는 재주면 해당 재주를 출력하고, 그렇지 않으면
        // '아직 못배운 재주에요' 를 출력한다 (= Dog 의 메소드 동작 내용)

        Person person = new Person("홍길동",30);
        System.out.println(person);

        person.setNational("미국");
        System.out.println(person);


        // 강아지 이름 입력받기
        Scanner sc = new Scanner(System.in);

        System.out.print("강아지 이름을 입력하세요 : ");
        String dogName = sc.nextLine();

        person.adoptDog(dogName);  // person 클래스에 있는 adoptDog 메소드의 dogName 을 출력
        System.out.println(person);

        // 강아지 재주 가르치기
        String[] teachingAbility = new String[]{"앉아","빵","기다려"};
        person.teachDog(teachingAbility);
        System.out.println(person);

        // 강아지 재주 시키기

    }

}
