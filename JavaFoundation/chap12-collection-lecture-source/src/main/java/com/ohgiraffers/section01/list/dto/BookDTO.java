package com.ohgiraffers.section01.list.dto;

public class BookDTO {

    // 필드
    private int number;
    private String title;
    private String author;
    public int price;

    // 생성자
    public BookDTO(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    // setter
    public void setNumber(int number) {
        this.number = number;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    // getter
    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "number : " + number +
                ", title : " + title + '\'' +
                ", author : " + author + '\'' +
                ", price : " + price +
                '}';
    }
}
