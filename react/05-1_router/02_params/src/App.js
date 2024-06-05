import { BrowserRouter, Routes, Route } from "react-router-dom";
import Layout from "./LayOuts/Layout";
import Main from "./pages/Main";
import About from "./pages/About";
import Menu from "./pages/Menu";
import MenuDetails from "./pages/MenuDetails";
import MenuSearchResult from "./pages/MenuSearchResult";
import Error from "./pages/Error";


// header와 navbar는 고정된 상태로 나머지는 변화시키기
function App() {

  return (
   <BrowserRouter>
        <Routes>
          <Route path="/" element={<Layout />}>
            <Route index element={<Main/>}/>
            <Route path="about" element={<About/>}/>
            <Route path="menu">
              <Route index element = {<Menu/>}/>
              <Route path=":menuCode" element = {<MenuDetails />}/>
              <Route path="search" element={<MenuSearchResult />} />
            </Route>
          </Route>
          {/* path="*" : 위에 정의된 것 이외에 정의되지 않은 모든 것 */}
          <Route path="*" element={<Error/>} />
        </Routes>
      </BrowserRouter>
  );
}

export default App;
