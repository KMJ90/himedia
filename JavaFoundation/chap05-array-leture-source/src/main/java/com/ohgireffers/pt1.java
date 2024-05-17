package com.ohgireffers;

import java.util.Map;
import java.util.Scanner;

public class pt1 {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 80;
        int num3 = 50;

        int result1 = Math.max(20,Math.max(80, 50));
        int result2 = Math.min(20, Math.min(80, 50));

        System.out.println("쵀대값은 : " + result1);
        System.out.println("최소값은 : " + result2);


    }
}
