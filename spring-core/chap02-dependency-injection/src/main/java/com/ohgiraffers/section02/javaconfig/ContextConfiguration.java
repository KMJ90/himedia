package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public Account accountGenerator() {
        return new PersonalAccount(20, "110-234-567890");
    }

    @Bean
    public MemberDTO memberGenerator() {

        // 생성자 주입
        // MemberDTO 생성자를 통해 Account 를 생성하는 메소드를 호출한 리턴 값을 전달하여 bean 조립
        return new MemberDTO(1, "판다", "panda@naver.com", accountGenerator());

//         setter 주입
        // setter 를 통해 Account 를 생성하는 메소드를 호출한 리턴값을 전달하여 bean 조립
//        MemberDTO member = new MemberDTO();
//        member.setSequence(1);
//        member.setName("판다");
//        member.setEmail("panda@naver.com");
//        member.setPersonalAccount(accountGenerator());
//
//        return member;
    }
}
