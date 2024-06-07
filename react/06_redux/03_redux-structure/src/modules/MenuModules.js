import {handleActions, createActions} from "redux-actions";


// 초기값
const initialState = {};  // 초기 상태 값을 빈 객체로 설정

// 액션
const GET_MENULIST = 'menu/GET_MENULIST';  // GET_MENULIST 액션의 타입을 정의
const GET_MENU = 'menu/GET_MENU';  // GET_MENU 액션의 타입을 정의

export const {menu : {getMenulist, getMenu}} = createActions({  // createActions를 사용하여 액션 생성자 함수를 생성
    
    // GET_MENULIST 액션을 생성하는 함수. result를 받아 menuList라는 키의 payload로 반환
    [GET_MENULIST] : result => ({menuList : result}),  // [GET_MENULIST] = type : result => ({menuList : result}) = payload
                                                      // menuList 라는 payload의 key 값이 -> MenuList로 전달됨

    // GET_MENU 액션을 생성하는 함수. result를 받아 menu라는 키의 payload로 반환
    [GET_MENU] : result => ({menu : result})
});

// 리듀서 함수
const menuReducer = handleActions({  // handleActions 함수를 사용하여 리듀서를 민듬
    [GET_MENULIST] : (state, {payload}) => payload,  // GET_MENULIST 액션이 발생했을 때 상태를 업데이트하는 함수. payload 값을 반환
    [GET_MENU] : (state, {payload}) => payload  // GET_MENU 액션이 발생했을 때 상태를 업데이트하는 함수. payload 값을 반환

}, initialState);  // 초기 상태를 초기값으로 설정

export default menuReducer;