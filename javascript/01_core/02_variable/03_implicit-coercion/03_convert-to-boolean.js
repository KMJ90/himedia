// implicit-coercion (암묵적 타입 변환)

// 03. boolean 타입으로 변환

// 자바스크립트 엔진은 boolean 타입이 아닌 값을 
// Truthy 값(참으로 평가되는 값) 또는 Falsy 값(거짓으로 평가되는 값)으로 구분함
// Truthy -> true,  Falsy -> false로 암묵적 타입 변환

if(true) console.log("if(true)");                   // o
if(false) console.log("if(false)");                 // x
if(undefined) console.log("if(undefined)");         // x
if(null) console.log("if(null)");                   // x
if(0) console.log("if(0)");                         // x
if(NaN) console.log("if(NaN)");                     // x
if('') console.log("if('')");                       // x
if('JavaScript') console.log("if('JavaScript')");   // o

// false, undefined, null, 0, NaN, ''(빈 문자열)은 Falsy 값
// 이 외의 모든 값은 Truthy 값