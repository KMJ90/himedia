import { getMenulist, getMenu } from "../modules/MenuModules";  // MenuModules 모듈에서 getMenulist와 getMenu를 가져옴
import {request} from "./api";  // api 모듈에서 request 함수를 가져옴


// 메뉴 목록을 가져오는 API를 호출 관련 액션 생성자 함수를 정의한 것
export function callGetMenuListAPI() {

    return async (dispatch, getState) => {  // thunk를 사용하여 비동기 작업을 처리하는 함수를 반환

        const result = await request('GET', '/menu');   // API를 호출하여 메뉴 목록을 가져옴

        // API 호출을 통해 반환 받은 데이터를 Store에 저장하기 위해 다시 dispatch(action객체)호출 한다
        dispatch(getMenulist(result));
    }
}

// 특정 메뉴의 상세 정보를 가져오는 API를 호출하는 액션 생성자 함수를 정의한 것
export function callGetMenuAPI(id) {

    return async (dispatch, getState) => {   // thunk를 사용하여 비동기 작업을 처리하는 함수를 반환

        const result = await request('GET', `/menu/${id}`)   // API를 호출하여 특정 메뉴의 상세 정보를 가져옴

        // API 호출을 통해 반환 받은 데이터를 Store에 저장하기 위해 다시 dispatch(action객체)호출
        dispatch(getMenu(result));
    }
}