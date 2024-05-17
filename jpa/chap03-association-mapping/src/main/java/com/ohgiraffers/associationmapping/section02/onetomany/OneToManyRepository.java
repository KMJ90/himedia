package com.ohgiraffers.associationmapping.section02.onetomany;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class OneToManyRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Category find(int categoryCode) {
        return entityManager.find(Category.class, categoryCode); // Category.class : 카테고리 엔티티로 조회해 온다
    }

    public void regist(Category category) {
        entityManager.persist(category);
    }
}
