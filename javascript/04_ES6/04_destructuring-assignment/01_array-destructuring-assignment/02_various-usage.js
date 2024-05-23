 // 객체 프로퍼티에 사용
 let user = {};  // 빈 객체 생성  / let user = []; 빈 배열 생성
 [user.firstName, user.lastName] = "Gwansoon Yu".split(' ');

 console.log(user);  // { firstName: 'Gwansoon', lastName: 'Yu' }

 // 변수 교환 용도로 사용할 수 있다
 let student = "학생";
 let teacher = "선생님";

 [student, teacher] = [teacher, student];  // 공간 = 값 (배열 리터럴)

 console.log(`학생 : ${student}, 선생님 : ${teacher}`);  // 학생 : 선생님, 선생님 : 학생

 // rest parameter ...로 나머지 요소를 한 번에 가져올 수도 있다
 let [sign1, sign2, ...rest] = ["양자리", "황소자리", "염소자리", "게자리", "물병자리"];

 console.log(sign1); 
 console.log(sign2);
 console.log(rest);   /* 양자리
                        황소자리
                        [ '염소자리', '게자리', '물병자리' ] */


// 기본 값을 설정하고 사용할 수도 있다
// let [firstName3 = "아무개", lastName3 = "홍"] = [];
let [firstName3 = "아무개", lastName3 = "홍"] = ["길동"];

console.log(firstName3);  // 배열에서 받아온 값
console.log(lastName3);  // 기본값