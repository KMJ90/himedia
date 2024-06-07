import { Link } from "react-router-dom";

function MenuItem({menu}) {  // 이 함수형 컴포넌트는 'menu'라는 객체를 프롭으로 받음

    return (
        <Link to={`/menu/${menu.id}`}>  {/* Link 컴포넌트는 클릭 시 메뉴 세부 정보 페이지로 이동하는 링크를 생성. 'to' 속성은 대상 URL을 지정하는데, 여기서는 메뉴의 ID를 동적으로 포함시킴. */}
            <div className="menuItem">
                <h3>이름 : {menu.menuName}</h3>   {/* 'menu.menuName'은 'menu' 객체의 'menuName' 속성에 접근. */}
                <h3>가격 : {menu.menuPrice}</h3>   {/* 'menu.menuPrice'는 'menu' 객체의 'menuPrice' 속성에 접근. */}
                <h3>종류 : {menu.categoryName}</h3>  {/* 'menu.categoryName'은 'menu' 객체의 'categoryName' 속성에 접근. */}
            </div>
        </Link>
    );
}

export default MenuItem;  // MenuItem 컴포넌트를 내보내어 다른 부분에서 사용할 수 있도록 함