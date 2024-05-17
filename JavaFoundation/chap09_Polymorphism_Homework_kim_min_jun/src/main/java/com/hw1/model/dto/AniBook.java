package com.hw1.model.dto;

public class AniBook {

    // 필드생성
    private int accessAge;  // 제한 나이

    // setter
    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }

    // getter
    public int getAccessAge() {
        return accessAge;
    }

    // 생성자
    public AniBook(int accessAge) {
        this.accessAge = accessAge;
    }

    // 기본 생성자
    public AniBook() {
    }

    @Override
    public String toString() {
        return "AniBook{" +
                "accessAge=" + accessAge +
                '}';
    }
}
