import { useSearchParams } from "react-router-dom";
import {useState, useEffect} from "react";
import {getSearchMenu} from "../api/MenuAPI";
import boxStyle from "./Menu.module.css";
import MenuItem from "../components/MenuItem";

function MenuSearchResult() {

    // 쿼리 스트링 형태로 전달 된 값은 useSearchParams hook을 통해 꺼낼 수 있다
    const [searchParams] = useSearchParams();  // useSearchParams : 배열 형태로 꺼내옴

    // 쿼리 스트링의 키 값을 get함수에 전달하여 해당 파라미터 값을 읽어온다
    const menuName = searchParams.get('menuName');  // 'menuName' : 꺼내고 싶은 키값

    const [menuList, setMenuList] = useState();

    useEffect(() => {
        setMenuList(getSearchMenu(menuName));
    }, []);

    return (
        <div>
            <h1>메뉴 검색 결과</h1>
            <div className={boxStyle.MenuBox}>
                {menuList && menuList.map(menu => <MenuItem key={menu.menuCode} menu={menu}/>)}
            </div>
        </div>
    )
}

export default MenuSearchResult;