package com.hw1.model.dto;

public class Employee extends Person {

    private int salary;  // 급여
    private String dept;  // 부서

    // setter
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    // getter
    public int getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }

    // 기본 생성자
    public Employee() {super();}

    // 매개변수 받는 생성자
    public Employee(String name, int age, double height, double weight, int salary, String dept) {
        super(age, height, weight);  // 부모 생성자를 통해 초기화
        this.name = name;  // 부모 필드값에 직접접근 초기화
        this.salary = salary;
        this.dept = dept;
    }

    public String Information() {
        return super.Information() +
                "{" +
                ", salary : " + salary +
                ", dept : " + dept +
                '}';
    }
}
