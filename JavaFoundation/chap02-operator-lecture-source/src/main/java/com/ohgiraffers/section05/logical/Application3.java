package com.ohgiraffers.section05.logical;

public class Application3 {
    public static void main(String[] args) {
        /* AND 연산과 OR 연산의 특징
        *  논리식 && 논리식 : 앞의 결과가 false이면 뒤를 실행 안함
        *                   조건식 두개가 모두 만족해야 true를 반환하기 때문에
        *                   앞의 결과가 false가 나오면 뒤의 조건을 확인할 필요 없이 false 반환
        *                   따라서 연산횟수를 줄이기 위해서는 앞에 false가 나올 가능성이 높은 조건을 작성
        *  논리식 || 논리식 : 앞의 결과가 true 이면 뒤를 실행 안함
        *                   조건식 하나만 만족해도 true를 반환하기 때문에
        *                   앞의 결과가 true가 나오면 뒤의 조건을 확인할 필요 없이 true 반환
        *                   따라서 연산횟수를 줄이기 위해서는 앞에 true가 나올 가능성이 높은 조건을 작성
        *  */

        int num1 = 10;
        int result1 = (false && ++num1 > 0 )? num1 : num1;  // (조건문)? 참일때 값 : 거짓일때 값;

        System.out.println("result1 : " + result1); // 앞의 값이 false 이기 때문에 뒤에 ++num1은 연산되지 않으므로, num1은 10이다.

        int num2 = 10;
        int result2 = (true || ++num2 > 0)? num2 : num2;

        System.out.println("result2 : " + result2); // 10; 마찬가지로 앞의 값이 true 라서 ++num2는 연산되지 않는다.

    }
}
