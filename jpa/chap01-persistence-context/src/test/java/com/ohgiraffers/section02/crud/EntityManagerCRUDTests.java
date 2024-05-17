package com.ohgiraffers.section02.crud;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EntityManagerCRUDTests {

    private EntityManagerCRUD crud;

    @BeforeEach
    void initManager() {
        this.crud = new EntityManagerCRUD();
    }

    @DisplayName("메뉴 코드로 메뉴 조회 테스트")
    @ParameterizedTest  // 하나의 테스트 메소드로 여러 개의 파라미터에 대한 테스트가 가능함
    @CsvSource({"2,2", "3,3"})  // CsvSource : 컴마를 기준으로 아래의 매개변수로 데이터를 전달한다
    void testFindMethodByMenuCode(int menuCode, int expected) {

        // given


        // when
        Menu foundMenu = crud.findMenuByMenuCode(menuCode);

        // then
        assertEquals(expected, foundMenu.getMenuCode());
        System.out.println("foundMenu = " + foundMenu);
    }

    private static Stream<Arguments> newMenu() {
        return Stream.of(
                Arguments.of(
                        "신메뉴",
                        35000,
                        4,
                        "Y"
                )
        );
    }

    @DisplayName("새로운 메뉴 추가 테스트")
    @ParameterizedTest
    @MethodSource("newMenu")
    void testRegist(String menuName, int menuPrice, int categoryCode, String orderableStatus) {

        // when
        Menu newMenu = new Menu(menuName, menuPrice, categoryCode, orderableStatus);
        Long count = crud.saveAndReturnAllCount(newMenu);  // saveAndReturnAllCount : 그래서 몇갠데~

        // then
        assertEquals(28, count);  // 28 : 컬럼의 행의 수 보다 하다 더 많게 설정
    }

    @DisplayName("메뉴 이름 수정 테스트")
    @ParameterizedTest
    @CsvSource("2, 변경 된 이름")
    void testModifyMenuName(int menuCode, String menuName) {

        // when
        Menu modifiedMenu = crud.modifyMenuName(menuCode, menuName);  // menuName : 변뎡 된 이름이 들어감

        // then
        assertEquals(menuName, modifiedMenu.getMenuName());  // 변경된 부분을 감지해 db에 전송해 업데이트를 해준다
    }

    @DisplayName("메뉴 삭제 테스트")
    @ParameterizedTest  // 파라미터를 전달하면서 테스트 진행
    @ValueSource(ints = {109, 110, 111})  // 삭제할 menuCode 번호 기입
    void testRemoveMenu(int menuCode) {

        // when
        Long count = crud.removeAndReturnAllCount(menuCode);

        // then
        assertEquals(27, count);  // ( 예상값 , 실제값 ) / 27 : 삭제된 후 행의 번호
    }
}
