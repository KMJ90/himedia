import {NavLink} from "react-router-dom";

function Navber () {

    return (
        <div>
            <ul>
                <li><NavLink to="/">메인으로</NavLink></li>
                <li><NavLink to="/menu">메뉴보기</NavLink></li>
            </ul>
        </div>
    );
}

export default Navber;