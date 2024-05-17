package com.ohgiraffers.jpql.section02.parameter;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ParameterBindingRepository {

    @PersistenceContext
    private EntityManager entityManager;

    // 이름 기준 파라미터 바인딩
    public List<Menu> selectMenuByBindingName(String menuName) {
        String jpql = "SELECT m FROM Section02Menu m WHERE m.menuName = :menuName";  // 이름 기준 : :menuName
        List<Menu> resultMenuList = entityManager.createQuery(jpql, Menu.class)  // TypedQuery 를 반환하는 구문
                .setParameter("menuName", menuName)
                .getResultList();

        return resultMenuList;
    }

    // 위치 기준 파라미터 바인딩
    public List<Menu> selectMenuByBindingPosition(String menuName) {
        String jpql = "SELECT m FROM Section02Menu m WHERE m.menuName = ?1";  // 위치 기준 : ?1
        List<Menu> resultMenuList = entityManager.createQuery(jpql, Menu.class)  // TypedQuery 를 반환하는 구문
                .setParameter(1, menuName)
                .getResultList();

        return resultMenuList;
    }
}
