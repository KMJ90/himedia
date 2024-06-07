import { useDispatch } from "react-redux";
import { callGetMenuAPI } from "../../api/MenuAPICalls";
import { useEffect } from "react";
import { useSelector } from "react-redux";


function Menu({id}) {  // Menu 컴포넌트 정의

    const dispatch = useDispatch();  // useDispatch()를 사용하여 dispatch 함수를 가져옴
    const {menu} = useSelector(state => state.menuReducer);  // Redux store의 menuReducer에서 menu 상태를 가져옴

    useEffect(() => {  // useEffect 훅을 사용하여 컴포넌트가 마운트될 때 한 번만 실행되는 로직을 정의
        dispatch(callGetMenuAPI(id));  // 컴포넌트가 마운트될 때 메뉴 정보를 가져오는 API를 호출하는 액션을 디스패치 함
    }, [])

    return (
        menu &&  // menu가 존재하는 경우에만 아래의 JSX를 렌더링
        <>
            <h3>메뉴 이름 : {menu.menuName}</h3>
            <h3>메뉴 가격 : {menu.menuPrice}</h3>
            <h3>메뉴 종류 : {menu.categoryName}</h3>
            <h3>메뉴 상세 : {menu.detail.description}</h3>
        </>
    )
}

export default Menu;  // Menu 컴포넌트를 외부로 내보냄