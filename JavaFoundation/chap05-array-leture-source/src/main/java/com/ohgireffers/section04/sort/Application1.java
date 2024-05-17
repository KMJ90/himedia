package com.ohgireffers.section04.sort;

public class Application1 {
    public static void main(String[] args) {
        // 변수의 두 값 변경하기 [정렬]
        int num1 = 10;
        int num2 = 20;

        int temp;  // temp 라는 공간을 만들어서
        temp = num1;  // num1의 값(10)을 새로만든 공간(temp)에 넣고
        num1 = num2;  // num2의 값(20)을 num1 자리로 보낸다
        num2 = temp;  // temp의 값(10)을 num2로 보낸다

        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);

        int[] arr = {2, 1, 3};

        int temp2;
        temp2 = arr[0];
        arr[0] = arr[1];
        arr[1] = temp2;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
