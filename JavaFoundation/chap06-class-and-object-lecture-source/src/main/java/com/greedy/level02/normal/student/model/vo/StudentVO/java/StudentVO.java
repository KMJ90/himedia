package com.greedy.level02.normal.student.model.vo.StudentVO.java;

import com.greedy.level02.normal.book.model.vo.BookVO.BookVO;

public class StudentVO {

    // 필드
    private int grade;
    private int classroom;
    private String name;
    private double height;
    private char gender;

    // setter
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    // getter
    public int getGrade() {
        return grade;
    }
    public int getClassroom() {
        return classroom;
    }
    public String getName() {
        return name;
    }
    public double getHeight() {
        return height;
    }
    public char getGender() {
        return gender;
    }
    public StudentVO() {  // 기본생성자
    }
    public StudentVO(int grade, int classroom, String name, double height, char gender) {  //모든 필드를 초기화하는 생성자
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.height = height;
        this.gender = gender;
    }
    public void printInformation() {
        System.out.println("StudentVO{" + "\n" +
                "학년 : " + grade + "\n" +
                "반 : " + classroom + "\n" +
                "이름 : " + name + "\n" +
                "키 : " +
                 + height + "\n" +
                "성별 : " + gender + "\n" +
                '}');
    }
}
