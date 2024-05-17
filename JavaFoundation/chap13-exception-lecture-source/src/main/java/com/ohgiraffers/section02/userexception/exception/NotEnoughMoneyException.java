package com.ohgiraffers.section02.userexception.exception;

public class NotEnoughMoneyException extends Exception {

    public NotEnoughMoneyException() {}  // 기본생성자

    public NotEnoughMoneyException(String message) {
        super(message);  // 예외 메세지
    }
}
