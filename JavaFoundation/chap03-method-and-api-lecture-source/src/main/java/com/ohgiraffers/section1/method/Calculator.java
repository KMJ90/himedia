package com.ohgiraffers.section1.method;

public class Calculator {


        public int minNumberOf(int first, int second) {  //static 사용x
            return (first > second)? second : first;
        }

        public static int maxNumberOf(int first, int second) {  //static 사용
            return (first > second)? first : second;
        }

}
