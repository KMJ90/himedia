// 3. 에러 발생

// 1. 암묵적 전역
(function(){
    // 'use strict'
    x = 1;
    console.log(x);  // ReferenceError: x is not defined
})();

// 2. 변수, 함수, 매개변수의 삭제
(function(){
    'use strict'
    var x = 1;
    // delete x;  // 엄격모드에서는 식별자에 대해 'delete'를 호출할 수 없다
})();

// 3. 매개변수 이름의 중복
(function(){
    'use strict'
    function test(x, x) {  // SyntaxError: Duplicate parameter name not allowed in this context
        return x + x;
    }
    console.log(test(1, 2));
})();