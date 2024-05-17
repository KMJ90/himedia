package com.ohgiraffers.jpql.section04.paging;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class PagingRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Menu> usingPagingAPI(int offset, int limit) {
        String jpql = "SELECT m FROM Section04Menu m ORDER BY m.menuCode DESC";

        List<Menu> pagingMenuList = entityManager.createQuery(jpql, Menu.class)
                .setFirstResult(offset)  // setFirstResult : 조회를 어디서 시작할 것인가(실질적으로는 0부터 시작)
                .setMaxResults(limit)  // setMaxResults : 조회 시 가져올 데이터의 수
                .getResultList();

        return pagingMenuList;
    }
}
