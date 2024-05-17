package com.ohgiraffers.jpql.section06.join;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class JoinRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Menu> selectByInnerJoin() {  // 내부 조인
        String jpql = "SELECT m FROM Section06Menu m JOIN m.category c";
        List<Menu> menuList = entityManager.createQuery(jpql, Menu.class).getResultList();
        return menuList;
    }

    public List<Object[]> selectByOuterJoin() {  // 외부 조인
        String jpql = "SELECT m.menuName, c.categoryName FROM Section06Menu m RIGHT JOIN m.category c"
                + " ORDER BY m.category.categoryCode";
        List<Object[]> menuList = entityManager.createQuery(jpql).getResultList();
        return menuList;
    }

    public List<Object[]> selectByCollectionJoin() {  // 컬렉션 조인
        String jpql = "SELECT m.menuName, c.categoryName FROM Section06Category c LEFT JOIN c.menuList m";
        List<Object[]> categoryList = entityManager.createQuery(jpql).getResultList();
        return categoryList;
    }

    public List<Object[]> selectByThetaJoin() {  // 세타 조인
        String jpql = "SELECT m.menuName, c.categoryName FROM Section06Category c, Section06Menu m";
        List<Object[]> categoryList = entityManager.createQuery(jpql).getResultList();
        return categoryList;
    }

    public List<Menu> selectByFetchJoin() {  // 패치 조인( N + 1 현상을 방지하기 위해 사용 )
        String jpql = "SELECT m FROM Section06Menu m JOIN FETCH m.category c";  // JOIN FETCH : 즉시로딩을 수행해서 가져온다
        List<Menu> menuList = entityManager.createQuery(jpql, Menu.class).getResultList();
        return menuList;
    }
}
