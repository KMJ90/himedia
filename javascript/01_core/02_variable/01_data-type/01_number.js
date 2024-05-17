// 01. 숫자 타입 

// 정수, 실수, 음수 모두 숫자 타입이다.
var integer = 10;
var double = 5.5;
var negative = -10;

// 숫자 타입은 모두 실수로 처리된다
console.log(10 === 10.0);  // === : 값과 타입을 비교하는 기호

console.log(typeof integer);
console.log(typeof double);

// 실수끼리의 나누기이므로 소수점까지 처리된다
console.log(10 / 4);  // 2.5

// 추가적으로 세 가지 특별한 값도 표현할 수 있다
console.log(10 / 0);  // Infinitu : 양의 무한대
console.log(10 / -0);  // -Infinitu : 음의 무한대
console.log(1 * '문자열');  // NaN : 산술 연산 불가 (Not-a-Number)