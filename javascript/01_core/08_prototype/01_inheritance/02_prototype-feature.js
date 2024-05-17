// Prototype feature

const user = {  // user라는 객체를 정의 
    id : 'user',  // <= 객체의 상태(속성)
    login : function() {  // <= 함수가 있는 구문이 메소드
        console.log(`${this.id}님 로그인 되었습니다.`);
    }
};

// 프로토타입은 프로퍼티를 읽을 때만 사용하며
// 프로퍼티를 추가, 수정, 삭제하는 연산은 객체에 직접 한다
const student = {  // student라는 객체를 정의
    __proto__ : user  // __proto__속성을 사용하여 user 객체를 상속받고 있음
};

// login 메소드 내의 this는 프로토타입에 영향을 받지 않으며
// 메소드를 객체에서 호출하든 프로토타입에서 호출하든 상관없이
// this는 언제나 . 앞에 있는 객체이다
student.id = 'user001';
// student.login();
// user.login();

// => 메소드는 공유되지만 객체의 상태는 공유되지 않는다

for(let prop in student) {
    // for in 반복문은 상속 프로퍼티도 순회 대상에 포함시킨다
    console.log(prop);

    let isOwn = student.hasOwnProperty(prop);

    // 내 프로퍼티 인지 상속 프로퍼티 인지 if문으로 확인
    if(isOwn) {
        console.log(`객체 자신의 프로퍼티 ${prop}`);
    
    } else {
        console.log(`상속 프로퍼티 ${prop}`);
    }
}