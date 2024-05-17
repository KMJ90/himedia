// 엄격 모드 적용

// 전역의 선두 또는 함수 몸체의 선두에 'use strict'를 추가한다

// 'use strict';

function test() {
    'use strict'
    x = 10;
    // 코드의 선두에 위치시키지 않으면 strict mode가 제대로 동작하지 않음
    // 'use strict'
}

test();  // ReferenceError: x is not defined : x 에 키워드를 붙이지 않아 에러

console.log(x);

// 즉시 실행 함수에서도 사용가능
(function(){
    'use strict';
})();