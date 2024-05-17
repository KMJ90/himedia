package com.greedy.level02.normal.book.model.vo.BookVO;

public class BookVO {

    // 필드
    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    // setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    // getter
    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public BookVO() {  // 기본생성자
    }

    public BookVO(String title, String publisher, String author) {  // 3가지를 초기화 하는 생성자
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    public BookVO(String title, String publisher, String author, int price, double discountRate) {  // 모든 필드를 초기화하는 생성자
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }

    public void printInformation() {   // 호출받아서 출력하는 구문
        System.out.println("BookVO{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", discountRate=" + discountRate +
                '}');
    }


}

