import { Link } from "react-router-dom";

function Main() {

    return (
        <div>
            <h1>메인</h1>
            <nav>
                <Link to="/">HOME</Link>
                <Link to="/about">소개</Link>
                <Link to="/menu">메뉴 목록</Link>
            </nav>
        </div>
    );
}

export default Main;  // 다른 페이지에서 이 컴포넌트를 (import)해서 사용할 수 있게하는 구문 