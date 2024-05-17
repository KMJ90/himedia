package com.ohgireffers.section01.array;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {

        // [카드뽑기]
        // 1. 문자열 배열에 SPADE, CLOVER, HEART, DIAMOND 를 저장
        // 2. 문자열 배열에 2, 3, 4, 5, 6, 7, 8, 9, 10, JACK, QUEEN, KING, ACE 를 저장
        // 3. 1번과 2번 배열의 길이에 맞도록 난수를 각각 발생시킨다
        // 4. 위에서 발생시킨 난수를 활용하여 카드를 출력한다

        // =========출력예시=========
        //당신이 뽑은 카드는 DIAMOND 9 카드 입니다.

        String[] sarr = new String[] {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] str = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};
        int inum = (int)(Math.random() * sarr.length);  // 난수 발생 시키는 구문(int 사용)
        int inum2 = (int)(Math.random() * str.length);  // 난수 발생 시키는 구문(int 사용)
        System.out.println("당신이 뽑은 카드는 " + sarr[inum] + str[inum2] + " 카드 입니다.");

    }
}
