package com.ohgiraffers.section01.aop;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MemberDAO {

    // MemberDTO 객체를 저장하는 Map, 이 Map 은 회원의 ID(Long)를 키로 사용하여
    // MemberDTO 객체를 값으로 저장
    private final Map<Long, MemberDTO> memberMap;  // Long : ID(key)

    public MemberDAO() {
        memberMap = new HashMap<>(); // memberMap : MemberDTO 객체를 저장하는 HashMap

        memberMap.put(1L, new MemberDTO(1L, "판다")); // (key)가 1L인 MemberDTO 객체를 생성하여, "판다"라는 이름으로 초기화하고
                                                               // memberMap 에 추가
        memberMap.put(2L, new MemberDTO(2L, "다람쥐")); // (key)가 2L인 MemberDTO 객체를 생성하여, "다람쥐"라는 이름으로 초기화하고
                                                                // memberMap 에 추가
    }
    public Map<Long, MemberDTO> selectMembers() { // selectMembers() 메소드는 Map<Long, MemberDTO> 형태의 객체를 반환
        return memberMap; // memberMap 변수는 MemberDAO 정보를 담고 있음
                          // selectMembers() 메소드 호출하면 MemberDAO 의 모든 정보 반환
    }

    public MemberDTO selectMember(Long id) {
        MemberDTO returnMember = memberMap.get(id);
        /* throw new RuntimeException : 에러를 막기 위해서 적어준다 */
        if (returnMember == null) throw new RuntimeException("해당하는 id의 회원이 없습니다.");

        return returnMember;

    }
}
