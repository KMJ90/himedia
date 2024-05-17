package com.hw1.model.dto;

public class Person {

    // 필드 생성
    protected String name;
    private int age;
    private double height;
    private double weight;

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    // 기본 생성자
    public Person() {}

    // 매개변수를 받는 생성자
    public Person(int age, double height, double weight) {
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String Information() {
        return "{" +
                "name : " + name + '\'' +
                ", age : " + age +
                ", height : " + height +
                ", weight : " + weight +
                '}';
    }
}
