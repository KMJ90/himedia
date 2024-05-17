package com.ohgiraffers.section02.superKeyword;

import java.util.Date;

public class Computer extends Product {

    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    // Computer 클래스의 기본생성자 호출
    public Computer() {
        System.out.println("Computer 클래스의 기본 생성자 호출함");
    }

    // Computer 클래스 모든 필드를 초기화하는 생성자 호출
    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;

        System.out.println("Computer 클래스 모든 필드를 초기화하는 생성자 호출함");
    }

    // Computer 클래스의 부모 필드도 초기화하는 생성자 호출
    public Computer(String code, String brand, String name, int price, Date manuFacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, manuFacturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;

        System.out.println("Computer 클래스의 부모 필드까지 초기화하는 생성자 호출함");
    }
    // setter
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }
    // getter
    public String getCpu() {
        return cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public int getRam() {
        return ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    // super. 을 통해 부모클래스(getInformation)를 호출하고, 문자열을 출력
    @Override
    public String getInformation() {
        return super.getInformation()
                + "Computer ["
                + "cpu : " + this.cpu
                + ", hdd : " + this.hdd
                + ", ram : " + this.ram
                + ", operationSystem : " + this.operationSystem
                + "]";
    }
}


