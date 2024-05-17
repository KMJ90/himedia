package com.ohgiraffers.mapping.section01.entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @PersistenceContext  // @PersistenceContext : 알아서 스코프에 맞게 만들어줌( 의존성 주입 )
    private EntityManager entityManager;

    public void save (Member member) {  //  persist : 전달받은 member 엔티티를 저장한다
        entityManager.persist(member);
    }

    public String findNameById(String memberId) {

        String jpql = "SELECT m.memberName From entityMember m WHERE m.memberId = '" + memberId + "'";  // m : 별칭 필수로 들어가야함
        return entityManager.createQuery(jpql, String.class).getSingleResult();  // String.class : 반환받고자 하는 타입 / getSingleResult : 하나의 값만 가져옴
    }
}
