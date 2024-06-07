import { useParams } from "react-router-dom";
import Menu from "../components/item/Menu";


function MenuDetail() {  // MenuDetail 함수 컴포넌트를 정의

    const { id } = useParams();  // useParams를 사용하여 URL 매개변수를 가져옵니다. 여기서는 'id'를 가져옴

    return (
        <div>  {/* div 요소로 컴포넌트를 래핑 */}
            <h1>메뉴 상세</h1>
            <Menu id={id}/>  {/* Menu 컴포넌트를 렌더링하고, 'id'를 props로 전달 */}
        </div>
    );
}

export default MenuDetail;