package com.ohgiraffers.restapi.section01.response;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Message {

    private int httpStatusCode;

    private String message;
}
