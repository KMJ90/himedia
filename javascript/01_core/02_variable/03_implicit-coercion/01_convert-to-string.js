// implicit-corecion (암묵적 타입 변환)

// 01. 문자열 타입으로 변환
// 문자열 연결 연산자로 동작

// 문자열 타입이 아닌 피연산자를 문자열 타입으로 암묵적으로 변환
console.log(10 + '20');  // 문자열 합치기가 됨

// 템플릿 리터럴 표현식 삽입은 표현식의 결과를 문자열 타입으로 암묵적으로 변환
console.log(`10 + 20 : ${10 + 20}`);

// 문자열 타입이 아닌 값을 문자열 타입으로 암묵적으로 변환하는 결과
console.log(1 + '');           // "1" 문자열
console.log(NaN + '');         // "NaN" 문자열
console.log(Infinity + '');    // "Infinity" 문자열
console.log(true + '');        // "true" 문자열
console.log(null + '');        // "null" 문자열
console.log(undefined + '');   // "undefined" 문자열
/* console.log(Symbol + '');   // Symbol 은 문자열로 반환할 수 없음 */
console.log({} + '');          // [object object] 출력
console.log([] + '');          // "" 빈 문자열 출력
console.log(function(){} + '');  // "function(){}" 문자열