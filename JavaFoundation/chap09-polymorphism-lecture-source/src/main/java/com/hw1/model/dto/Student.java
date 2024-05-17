package com.hw1.model.dto;

public class Student extends Person {

    // 필드 생성
    private int grade;  // 학년
    private String major;  // 전공

    // setter
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // getter
    public int getGrade() {
        return grade;
    }

    public String getMajor() {
        return major;
    }

    // 기본 생성자
    public Student() {super();}

    // 매개변수 받는 생성자
    public Student(String name, int age, double height, double weight,int grade, String major) {
        super(age, height, weight);  // 부모 생성자를 통해 초기화
        this.name = name;  // 부모 필드값에 직접접근 초기화
        this.grade = grade;
        this.major = major;
    }

    public String Information() {
        return super.Information() +
                "{" +
                ", grade : " + grade +
                ", major : " + major +
                '}';
    }
}
