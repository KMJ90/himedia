import {useState, useEffect} from "react";
import { getMenuList } from "../api/MenuAPI";
import boxStyle from "./Menu.module.css";
import MenuItem from "../components/MenuItem";
import {useNavigate} from "react-router-dom";

function Menu() {

    const [menuList, setMenuList] = useState();

    const [searchValue, setSearchValue] = useState('');

    useEffect(() => {
        setMenuList(getMenuList());
    }, []);

    // console.log(menuList);

    // 버튼을 누르면 입력 요청 url을 바꿈
    const navigate = useNavigate();

    const onClickHandler = () => navigate(`/menu/search?menuName=${searchValue}`);

    return (
        <div>
            <h1>메뉴 목록</h1>

            <div>
                <input 
                type="search"
                name="menuName"
                value={searchValue}
                onChange={e => setSearchValue(e.target.value)}
                />
                <button onClick={onClickHandler}>검색</button>
            </div>

            <div className={boxStyle.MenuBox}>
                {menuList && menuList.map(menu => <MenuItem key={menu.menuCode} menu={menu}/>)}
            </div>
        </div>
    );
}

export default Menu;