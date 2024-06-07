import menuReducer from "./MenuModules";
import { combineReducers } from "redux";

const rootReducer = combineReducers({  // combineReducers : 리듀서들을 하나로 병합해줌

    menuReducer  // 여기서 menuReducer는 실제로 MenuModules에서 가져온 메뉴 관련 리듀서

});

export default rootReducer;
