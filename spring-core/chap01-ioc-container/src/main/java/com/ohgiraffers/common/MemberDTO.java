package com.ohgiraffers.common;

import lombok.*;

@NoArgsConstructor  // 기본 생성자
@AllArgsConstructor  // 매개변수 받는 생성자

// 밑에 내용을 추가하지 않고 어노테이션으로도 기능 사용이 가능
@Setter
@Getter
@ToString

public class MemberDTO {

    // 필드
    private int sequence;  // 회원번호
    private String id;  // 아이디
    private String pwd;  // 비밀번호
    private String name;  // 이름
}
