package com.ohgiraffers.associationmapping.section03.bidirection;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class BiDirectionRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Menu findMenu (int menuCode) {
        return entityManager.find(Menu.class, menuCode);  // Menu.class : Menu 엔티티를 menuCode 로 찾아와라
    }

    public Category findCategory (int categoryCode) {
        return entityManager.find(Category.class, categoryCode);
    }
}
