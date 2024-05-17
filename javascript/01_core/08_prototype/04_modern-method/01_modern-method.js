// 프로토타입 접근 시 사용하는 모던 메소드

const user = {
    activate : true
};

// Object.create(proto) : [[prototype]] 이 proto를 참조하는 빈 객체 생성
const student = Object.create(user);  // Object.create : 메소드
console.log(student.activate);  // student가 activate를 잘 참조하고 있는지

// Object.getPrototypeOf(obj) : obj의 [[prototype]]을 반환
console.log(Object.getPrototypeOf(student) === user);

// Object.setPrototypeOf(obj, proto) : obj의 [[prototype]]을 proto로 설정
Object.setPrototypeOf(student, {});  // student의 포로토타입을 {}으로 변경
console.log(Object.getPrototypeOf(student) === user);