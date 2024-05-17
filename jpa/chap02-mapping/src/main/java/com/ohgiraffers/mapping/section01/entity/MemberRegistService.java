package com.ohgiraffers.mapping.section01.entity;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class MemberRegistService {

    private MemberRepository memberRepository;

    public MemberRegistService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Transactional
    public void registMember(MemberRegistDTO newMember) {  // 이쪽의 ()안에는 DTO 타입

        Member member = new Member(
                newMember.getMemberId(),
                newMember.getMemberPwd(),
                newMember.getMemberName(),
                newMember.getPhone(),
                newMember.getAddress(),
                newMember.getEnrollDate(),
                newMember.getMemberRole(),
                newMember.getStatus()
        );

        memberRepository.save(member);  // 이쪽의 ()안에는 엔티티 타입
    }

    @Transactional
    public String registMemberAndFindName(MemberRegistDTO newMember) {

        registMember(newMember);  // registMember 에 저장
        return memberRepository.findNameById(newMember.getMemberId());  // 저장된 Id를 기준으로 이름을 반환
    }
}
