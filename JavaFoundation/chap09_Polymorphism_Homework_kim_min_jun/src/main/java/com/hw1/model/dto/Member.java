package com.hw1.model.dto;

public class Member {

    // 필드생성
    private String name;  // 회원명
    private int age;  // 회원나이
    private char gender;  // 성별
    private int couponCount;  // 요리학원쿠폰개수 = 0

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setCouponCount(int couponCount) {
        this.couponCount = couponCount;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public int getCouponCount() {
        return couponCount;
    }

    // 생성자
    public Member(String name, int age, char gender, int couponCount) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.couponCount = couponCount;
    }

    // 기본 생성자
    public Member() {
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", couponCount=" + couponCount +
                '}';
    }
}
