// 02. 문자열 타입

var string;
string = 'JavaScript';  // 작은 따옴표 (')
string = "JavaScript";  // 큰 따옴표 (")
string = `JavaScript`;  // 백틱 (`)

string = '작은 따옴표로 감싼 문자열 내의 "큰 따옴표"는 문자열로 인식';
string = "큰 따옴표로 감싼 문자열 내의 '작은 따옴표'는 문자열로 인식";

console.log(string);

// [ 템플릿 리터럴 ]
// ES6부터 도입된 백틱을 사용한 표현식으로
// 멀티라인 문자열, 표현식 삽입 등
// 편리한 문자열 처리 기능을 제공하는 문자열 표기법이다

// 일반 문자열 내에서는 줄바꿈이 허용되지 않는다
// var str = '안녕하세요,
// 판다입니다:)';

// 이스케이프 시퀀스(\n)를 사용해야 한다
var str = '안녕하세요, \n판다입니다:)';
console.log(str);

// 백틱을 사용하면 줄바꿈이 허용된다
var multiline = `안녕하세요, 
판다입니다:)`;
console.log(multiline);

var lastName = '다';
var firstName = '람쥐';

// 문자열은 문자열 연산자 + 를 사용해 연결할 수 있다
console.log('안녕하시오,' + lastName + '가 ' + firstName + '이올시다.');

// 템플릿 리터럴을 통해 표현식 삽입을 이용하면
// 문자열 연산자보다 가독성 좋고 간편하게 문자열을 조합할 수 있다
console.log(`안녕하시오, ${lastName}가 ${firstName} 이올시다.`); 

// 표현식 삽입은 반드시 백틱 내에서 사용해야 한다
// 일반 문자열에서의 표현식 삽입은 문자열로 취급한다
console.log('안녕하시오, ${lastName}가 ${firstName} 이올시다.');