// 1. 클래스 이름이 없는 : 익명 클래스 표현식
let Tutor = class {  

    teach() {
        console.log('이해하셨나요~?');
    }
};

new Tutor().teach();

// 2. 기명 클래스 표현식
let Tutee = class MyTutee {
    learn() {
        console.log('우와~ 이해했어요!');
        console.log(MyTutee);  // MyTutee 라는 이름은 클래스 안에서만 사용할 수 있다
    }
};

new Tutee().learn();
// console.log(MyTutee);  // 에러 발생 : ReferenceError: MyTutee is not defined

// 3. 클래스를 동적 생성
function makeTutee(message) {
    return class {  // feedback 메소드를 가진 익명의 클래스를 반환 해라
        feedback() {
            console.log(message);
        };
    };
}

let SecondTutee = makeTutee("10점 만점에 10점~");
new SecondTutee().feedback();

// => 클래스 표현식 정의가 가능하다는 것의 의미는 함수처럼 클래스도 일급 객체이며,
// 다른 표현식 내부에서 정의, 전달, 반환, 할당이 가능하다는 것이다