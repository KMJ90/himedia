package com.ohgiraffers.hw1.model.dto;

public class BookDTO {

    // 필드(속성) 생성
    private int bNo;  // 도서 번호
    private int category;  // 장르 분류 번호
    private String title;  // 도서 제목
    private String author;  // 도서 저자

    // 기본생성자
    public BookDTO() {}

    // 매개변수 받는 생성자
    public BookDTO(int bNo, int category, String title, String author) {
        this.bNo = bNo;
        this.category = category;
        this.title = title;
        this.author = author;
    }

    // setter
    public void setbNo(int bNo) {
        this.bNo = bNo;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //  getter
    public int getbNo() {
        return bNo;
    }

    public int getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "bNo=" + bNo +
                ", category=" + category +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
