package com.ohgiraffers.jpql.section03.projection;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ProjectionRepository {

    @PersistenceContext
    private EntityManager entityManager;

    // Entity
    public List<Menu> singleEntityProjection() {
        String jpql = "SELECT m FROM Section03Menu m";  // SELECT m FROM : 엔티티 projection
        return entityManager.createQuery(jpql, Menu.class).getResultList();
    }

    // Embedded
    public List<MenuInfo> embeddedTypeProjection() {
        String jpql = "SELECT m.menuInfo FROM EmbeddedMenu m";  // FROM 절에는 Embedded 사용 불가능
        return entityManager.createQuery(jpql, MenuInfo.class).getResultList();
    }

    // Scalar
    public List<Object[]> scalarTypeProjection() {
        String jpql = "SELECT c.categoryCode, c.categoryName FROM Section03Category c";
        return entityManager.createQuery(jpql).getResultList();
    }

    // Class
    public List<CategoryInfo> newCommandProjection() {
        String jpql = "SELECT new com.ohgiraffers.jpql.section03.projection.CategoryInfo(c.categoryCode, c.categoryName)"
                + " FROM Section03Category c";
        return entityManager.createQuery(jpql, CategoryInfo.class).getResultList();
    }
}
