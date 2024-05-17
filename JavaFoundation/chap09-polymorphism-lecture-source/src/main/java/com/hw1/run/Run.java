package com.hw1.run;

import com.hw1.model.dto.Employee;
import com.hw1.model.dto.Student;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        // 학생 정보를 기록할 수 있게 객체 배열 할당
        Student[] student = new Student[3];

        // 배열을 이용하여 3명의 학생 정보 초기화
        student[0] = new Student("홍김동",20,178.2,70,1,"정보시스템공학과");
        student[1] = new Student("김말똥",21,187.3,80,2,"경영학과");
        student[2] = new Student("강개순",23,167.0,45,4,"정보통신공학과");

        // 학생 정보 모두 출력  -> 향상된 for 문
        for (Student std : student) {  // (클래스명 사용할이름 : 배열변수)
            System.out.println(std.Information());
        }

        // 사원 정보 ================================================================

        // 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
        Employee[] employee = new Employee[10];

        Scanner sc = new Scanner(System.in);

        // 사원들의 정보를 계속 입력 받기 (무한 반복문)
        while (true) {
            // while 값이 true 라면 아래 구문 무한 반복실행
            System.out.print("객체를 계속 추가하시겠습니까? (y/n) : ");
            String add = sc.nextLine();

            // 반복실행을 하는데, 만약 입력받은 문자열이 y라면~
            if (add.equalsIgnoreCase("y")) {
                // 인덱스값 0부터 시작해서 최대 길이보다 작을때까지만 하나씩 증가시키면서 실행해줘
                for (int i = 0; i < employee.length; i++) {
                    // 사원의 정보를 입력받기 전에 null 값 인지 확인
                    if (employee[i] == null) {

                        System.out.print("사원의 이름을 입력하세요 : ");
                        String name = sc.nextLine();

                        System.out.print("사원의 나이를 입력하세요 : ");
                        int age = sc.nextInt();

                        System.out.print("사원의 키를 입력하세요 : ");
                        Double height = sc.nextDouble();

                        System.out.print("시원의 몸무게를 입력하세요 : ");
                        Double weight = sc.nextDouble();

                        System.out.print("사원의 급여를 입력하세요 : ");
                        int salary = sc.nextInt();
                        sc.nextLine();      // 개행문자

                        System.out.print("사원의 부서를 입력하세요 : ");
                        String dept = sc.nextLine();

                        // 정보를 입력 받았으면 ()안의 매개변수 정보를 [i]한테 넣어주고 반복 끝내
                        employee[i] = new Employee(name,age,height,weight,salary,dept);
                        break;  // 정보를 받았으니 반복문(for 문)을 끝내
                    }
                }
            // 만약에 객체를 추가 하겠냐는 문구에 'n' 을 눌렀다면
            } else if (add.equalsIgnoreCase("n")) {
                System.out.println("사원 정보 입력을 종료합니다.");
                break;
            } else {
                // while 문 안에 if 문이 있기 때문에 else 를 끝으로 종료되지 않고 계속 반복함(while)
                System.out.println("잘 못 입력했습니다. 'y' 또는 'n'만 입력해주세요 :) ");
            }
        }
        // 입력받은 사원들의 정보를 모두 출력
        for (Employee emp : employee) {
            // 입력받은 정보가 null 이 아니라면
            if (emp != null) {
                // 입력받은 정보까지 출력
                System.out.println(emp.Information());
            }
        }
    }
}
