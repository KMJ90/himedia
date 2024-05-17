// 화살표 함수(arrow-function)

// ES6에서 도입된 화살표 함수는 function 키워드 대신 화살표를 사용해 
// 좀 더 간략하게 함수를 선언할 수 있다
// 화살표 함수는 항상 익명 함수로 정의하며, 본문이 한 줄인 함수를 작성할 때 유용하다

var message;

// 기존 function 정의
message = function() {
    return "HELLO JavaScript World";
}
console.log(message());

// function 키워드 생략 가능
message = () => {
    return "HELLO JavaScript World (Arrow Function)";
}
console.log(message());

// 명령문이 하나만 있는 경우 중괄호 생략 가능
// 이떄, 함수 몸체 내부의 실행문이 값으로 평가될 수 있는 표현식이라면
// 암묵적으로 return 되므로 return 키워드 생략 가능
message = () => "HELLO JavaScript World";
console.log(message);

// 매개변수가 2개 이상이면 소괄호() 생략 불가능
message = (val1, val2) => "Arrow" + val1 + val2;
console.log(message('Function', 'nice!!'));

// 매개변수가 하나인 경우, 매개변수 작성되는 소괄호()를 생략 가능
// 단, 매개변수가 없거나 여러 개일 경우 소괄호() 생략 불가
message = val1 => "Arrow" + val1;
console.log(message("Function Good!!!"));