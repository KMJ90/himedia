// [[Prototyoe]]

const user = {
    activate : true,
    login : function() {
        console.log('로그인 되었습니다.');
    }
};

const student = {
    passion : true
};

// __Proto__는 [[prototype]]의 getter, setter 이다
// Object.getPrototypeOf, Object.getPrototypeOf를 써서 prototype을 get, set 하는 것이 좋다
student.__proto__ = user;  // 상속 개념

console.log(student.passion);
console.log(student.activate);
student.login();  // 상속 개념으로 user에 있는 login 기능 사용 가능

// 프로토타입 체인
const class8Student = {
    classNo : 8,
    __proto__ : student
};

// 프로토타입 체이닝은 순환 참조가 허용되지 않는다
user.__proto__ = class8Student;  // TypeError: Cyclic __proto__ value

console.log(class8Student.passion);  // student 에서 상속 받음
console.log(class8Student.activate);  // user 에서 상속 받음