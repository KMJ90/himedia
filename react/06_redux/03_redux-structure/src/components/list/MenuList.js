import { useEffect } from "react";
import { useDispatch, useSelector} from "react-redux";
import {callGetMenuListAPI} from "../../api/MenuAPICalls";
import MenuItem from "../item/MenuItem";

function MenuList() {  // MenuList 함수 컴포넌트를 정의

    const dispatch = useDispatch();  // useDispatch 훅을 사용하여 dispatch 함수를 가져옴

    // useSelector를 사용하여 Redux store의 menuReducer에서 menuList 상태를 가져옴
    const {menuList} = useSelector(state => state.menuReducer);  // {menuList} = MenuModules에서 가져온 값

    useEffect(() => {  // useEffect 훅을 사용하여 컴포넌트가 마운트될 때 한 번만 실행되는 로직을 정의
        // 메뉴 목록을 조회하는 API를 호출하는 로직을 담은 함수를 전달
        dispatch(callGetMenuListAPI());
    },  [])

    console.log(menuList);

    return (
        <div className="menuBox">  {/* 'menuBox' 클래스를 가진 div 요소로 컴포넌트를 래핑 */}
            
            {/* 메뉴 목록이 존재하는 경우, 각 메뉴 항목을 MenuItem 컴포넌트로 매핑하여 렌더링 */}
            {menuList && menuList.map(menu => <MenuItem key={menu.id} menu={menu}/>)}
        </div>
    )
}

export default MenuList;