// optional chaining operator

// ES11(ECMAScript2020)에서 도입된 연산자로
// 좌항의 피연산자가 null 또는 undefined인 경우 undefined를 반환하고
// 그렇지 않으면 우항의 프로퍼티 참조를 이어간다

var obj = null;

/* let val = obj.value;  // TypeError: Cannot read properties of null (reading 'value') */

var val = obj?.value;
console.log(val);  // undefined

var str = "";

// str 을 빈 문자열이라 falsy한 값으로 취급해서 빈 문자열이 len에 담긴다
/* var len = str && str.length; */

len = str?.length;

console.log(len);