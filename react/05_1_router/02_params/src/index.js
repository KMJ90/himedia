import React from 'react';
import ReactDOM from 'react-dom/client';
import App from './App';


// HTML 문서에서 id가 'root'인 요소를 찾아 해당 요소를 React의 렌더링 루트로 설정하고, root상수에 저장
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(  // App 컴포넌트를 root 요소 안에 렌더링 함
  
    <App />
  
);
