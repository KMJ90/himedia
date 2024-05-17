package com.ohgiraffers.section02.crud;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EntityManagerCRUD {

    private EntityManager entityManager;

    // 1. 특정 메뉴 코드로 메뉴 조회하는 기능
    public Menu findMenuByMenuCode(int menuCode) {
        entityManager = EntityManagerGenerator.getInstance();
        return entityManager.find(Menu.class, menuCode);  // find 사용으로 PK를 찾음(조회)
    }

    // 2. 새로운 메뉴를 저장하는 기능
    public Long saveAndReturnAllCount(Menu newMenu) {
        entityManager = EntityManagerGenerator.getInstance();

        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();  // 트렌젝션의 시작을 명시적으로 알림

        entityManager.persist(newMenu);

        entityTransaction.commit();

        return getCount(entityManager);
    }

    // 3. 메뉴 개수 조회하는 기능
    private Long getCount(EntityManager entityManager) {
        // JPQL 문법 -> 나중에 별도 챕터에서 다룸
        return entityManager.createQuery("select count(*) from Section02Menu", Long.class).getSingleResult();
    }

    // 4. 메뉴 이름을 수정하기 기능
    public Menu modifyMenuName(int menuCode, String menuName) {
        // entityManager 새로 만들기
        entityManager = EntityManagerGenerator.getInstance();
        Menu foundMenu = entityManager.find(Menu.class, menuCode);  // foundMenu : 찾아온 메뉴이름

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        foundMenu.setMenuName(menuName);  // setMenuName 으로 전달받은 menuName 으로 수정

        transaction.commit();

        return foundMenu;
    }

    // 5. 특정 메뉴 코드로 메뉴 삭제하는 기능
    public Long removeAndReturnAllCount(int menuCode) {

        entityManager = EntityManagerGenerator.getInstance();
        Menu foundMenu = entityManager.find(Menu.class, menuCode);  // foundMenu : 찾아온 메뉴이름

        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        entityManager.remove(foundMenu);  // 찾아온 정보(foundMenu)를 삭제

        transaction.commit();  // 트렌젝션 하여 db에 전달

        return getCount(entityManager);  // getCount : 업데이트 후 전체 개수가 몇개인지
    }

}
