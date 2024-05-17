package com.ohgiraffers;

import java.util.Random;
import java.util.Scanner;

public class pt {
    public static void main(String[] args) {

        // 6칸짜리 정수 배열 생성
        int[] lottoNumbers = new int[6];

        // 난수 발생을 위한 Random 객체 생성
        Random random = new Random();

        // 중복되지 않는 난수 발생 및 배열에 대입
        for (int i = 0; i < lottoNumbers.length; i++) {
            while (true) {
                int randomNumber = random.nextInt(45) + 1;
            }
        }
    }
}
