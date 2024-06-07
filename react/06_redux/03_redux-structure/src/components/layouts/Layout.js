import Header from "../commons/Header";
import Navber from "../commons/Navber";
import { Outlet } from "react-router-dom";

function Layout() {  // Layout 함수 컴포넌트를 정의

    return (
        <div>  {/* div 요소로 컴포넌트를 래핑 */}
            <Header/>  {/* Header 컴포넌트를 렌더링 */}
            <Navber/>  {/* Navber 컴포넌트를 렌더링 */}
            <Outlet/>  {/* react-router-dom의 Outlet 컴포넌트는 라우터의 자식 컴포넌트를 렌더링하기 위한 장소 */}
        </div>
    );
}

export default Layout;  // Layout 컴포넌트를 내보냄