// 3. 일반 함수와의 차이점

function Teacher(name, hobby) {  // 되도록 첫 문자는 대문자 사용 : Teacher
    
    this.name = name;
    this.hobby = hobby;
    this.getInfo = function() {
        return`${this.name}의 취미는 ${this.hobby}입니다.`;
    }
}

// new 연산자와 함께 호출하면 생성자 함수로 동작한다
// 만약 new 연산자와 함께 호출하지 않으면 일반 함수로 동작한다
const teacher = new Teacher('판다','열정적으로 수업하기');
console.log(teacher);  // new연산자를 사용하지 않아 일반 함수로써 호출된 teacher는 리턴 값(반환문)이 없어서 undefined 반환
console.log(hobby);  // 일반 함수로써 호출된 Teacher 내의 this는 전역 객체를 가리킨다

// < new.target >
// (생성자 함수가 new 연산자 없이 호출되는 것을 방지하기 위해 ES6에서 지원)
// new 연산자와 함께 생성자 함수로서 호출 시, new.target은 함수 자신을 가리킨다
// new 연산자 없이 일반 함수로 호출 시, 함수 내부의 new.target은 undefined 이다

// undefined : Falsy한 값
// new target : 자기 자신을 가리킬 때 : Truthy한 값

function Dog(name,skill) {
    
    if(!new.target) {
        return new Dog(name,skill);
    }
    this.name = name;
    this.skill = skill;
}

const dog1 = Dog('뽀삐', '앉아~~')
console.log(dog1);

const dog2 = new Dog('먼지', '기다려!!')
console.log(dog2);

// 대부분 빌트인 생성자 함수 (Object, String, Number, Boolean,...)는
// new 연산자와 함께 호출되었는지 확인 후 적절한 값을 반환한다
const obj = Object();
console.log(obj);  // new 연산자 없이 잘 동작하여 빈 객체를 반환한다

// String, Number, Boolean의 경우 new 연산자 없이 호출하면 객체 값이 아닌
// 문자열, 숫자, 논리(true & false)를 반환한다 -> 데이터 타입 변환에 사용
