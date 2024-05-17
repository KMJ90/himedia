package com.ohgiraffers.hw2.model.comparator;

import java.util.ArrayList;
import java.util.Scanner;

public class MonsterDTO {

    // 연습용 클래스====================

    public ArrayList<MonsterDTO> release(ArrayList<MonsterDTO> monlist) {

        Scanner sc = new Scanner(System.in);

        // 일을 시킬 포켓펠의 이름을 입력 받음
        System.out.print("일을 시킬 포켓펠 이름을 입력하세요 : ");
        String monsterName = sc.nextLine();

        // 입력 받은 이름의 인덱스를 검색 후 monlist 에 저장하고 반복문 빠져나옴
        int index = -1;  // -> 아무것도 찾지못한 경우에 대한 관용적 표현
        for (int i = 0; i < catchedMonster.size; i++) {
            if (monlist.get(i).getmName().equals(monsterName)) {
                index = i;
                break;
            }
        }
        // 검색된 인덱스 번호를 배열에서 제거 후 리턴
        monlist.remove(index);
        System.out.print("입력한 " + monlist + " 이(가) work 리스트에 추가됨");

        return monlist;

        // 입력한 포켓펠의 속성을 구분하여 그에 맞는 일을 시키기 (출력하기)
        if (monlist == (풀타입)) {
            System.out.print(monlist + " 는 집짓는 일을 도와주기로 했다!");
        } else if (monlist == (불타입)) {
            System.out.print(monlist + " 는 요리를 도와주기로 했다!");
        } else if (monlist == (물타입)) {
            System.out.print(monlist + " 는 농사를 하기로 했다!");
        }



    }
}