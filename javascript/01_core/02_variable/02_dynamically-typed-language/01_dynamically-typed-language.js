// 동적 타입 언어 (dynamic / weak type language)

var test;
console.log(typeof test);  // undefined

test = 1;
console.log(typeof test);  // unmber

test = 'JavaScript'
console.log(typeof test);  // string

test = true;
console.log(typeof test);  // boolean

test = null;
console.log(typeof test);  // object(o) null(x) 자바스크립트 버그이지만 기존코드에 영향을 줄 수 있어 수정X

test = Symbol();
console.log(typeof test);  // symbol

test = {};  // 객체
console.log(typeof test);  // object

test = [];  // 배열
console.log(typeof test);  // object

test = function(){};
console.log(typeof test);  // function