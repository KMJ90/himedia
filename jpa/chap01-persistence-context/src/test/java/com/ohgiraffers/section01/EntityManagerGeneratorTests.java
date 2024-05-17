package com.ohgiraffers.section01;

import com.ohgiraffers.section01.entitymenager.EntityManagerFactoryGenerator;
import com.ohgiraffers.section01.entitymenager.EntityManagerGenerator;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerGeneratorTests {

    @Test
    @DisplayName("엔티티 매니저 팩토리 생성 확인")
    void testGenerateEntityManagerFactory() {

        // given

        // when
        EntityManagerFactory factory = EntityManagerFactoryGenerator.getInstance();

        // then
        assertNotNull(factory);  // factory 가 null 이 아니라면 실행
    }

    @Test
    @DisplayName("엔티티 매니저 팩토리 싱글톤 인스턴스 확인")
    void testIsEntityManagerFactorySingletonInstance() {

        // given

        // when
        EntityManagerFactory factory1 = EntityManagerFactoryGenerator.getInstance();
        EntityManagerFactory factory2 = EntityManagerFactoryGenerator.getInstance();

        // then
        assertEquals(factory1, factory2);  // 두 객체가 동일한 객체인지 확인
    }

    @Test
    @DisplayName("엔티티 매니저 스코프 확인")
    void testEntityManagerLifeCycle() {

        // given

        // when
        EntityManager entityManager1 = EntityManagerGenerator.getInstance();
        EntityManager entityManager2 = EntityManagerGenerator.getInstance();

        // then
        assertNotEquals(entityManager1, entityManager2);
    }

}
