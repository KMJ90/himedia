// Object 프로토타입

// Object는 내장 객체 생성자 함수인데 이 생성자 함수의 prototype은 
// toString 을 비롯한 다양한 메소드가 구현되어 있는 거대한 객체를 참조한다
// new Object()를 호출하거나 리터럴 문법 {prototype...}을 사용해 객체를 만들 때,
// 새롭게 생성된 객체의 [[prototype]]은 Object.prototype을 참조한다

const obj1 = new Object();
const obj2 = {};

console.log(obj1.__proto__ === Object.prototype);  // true
console.log(obj2.__proto__ === Object.prototype);  // true

console.log(obj2.toString === obj1.__proto__.toString);  // true
console.log(obj2.toString === Object.prototype.toString);  // true