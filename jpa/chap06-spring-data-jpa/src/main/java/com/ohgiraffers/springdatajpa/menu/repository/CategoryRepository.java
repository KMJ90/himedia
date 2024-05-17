package com.ohgiraffers.springdatajpa.menu.repository;
import com.ohgiraffers.springdatajpa.menu.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

// findById : ID 를 기반으로 데이터 조회
// findByAll(sort or pageable) : 정렬 or 페이징 적용할 수 있는 메소드
// findByMenuPrice(price) : menuPrice 필드를 기준으로 데이터 조회

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    // JPQL
    // findAll 메소드로 조회 가능하지만 JPQL 설정 테스트를 위해 설정함
//    @Query("SELECT c FROM Category c ORDER BY c.categoryCode")
//    List<Category> findAllCategory();

    // Native Query
    @Query(value = "SELECT category_code, category_name, ref_category_code FROM tbl_category ORDER BY category_code",
            nativeQuery = true)

    List<Category> findAllCategory();

}
