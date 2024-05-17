// 1. 매개변수와 인수(parameter and arguments)

function hello(name) {
    
    console.log(name);
    
    // 모든 인수는 암묵적으로 arguments 객체의 프로퍼티로 보관된다
    console.log(arguments);

    return `${name}님 안녕하세요~!`;
}

// 매개변수는 함수 몸체 내부에서만 참조할 수 있다
// console.log(name);  // ReferenceError: name is not defined

var result = hello('판다');
console.log(result);

// 매개변수보다 인수가 더 많은 경우, 초과된 인수는 무시된다
result = hello('판다','다람쥐','원숭이');
console.log(result);

// 매개변수는 전달하지 않을 경우 arguments에 저장되지 않고, undefined님 안녕하세요~!라고 출력됨 
result = hello();
console.log(result);

function hi(name = '홍길동') {
    // 인수를 전달하지 않은, undefined를 전달한 경우, ES6에서 도입된 매개변수 기본값을 사용할 수 있다

    // 적절한 인수가 전달되었는지 확인할 수 있다

    if(arguments.length !==1 || typeof name !== 'string' || name.length === 0) {
        throw new TypeError('인수는 1개의 문자열 값이여야 하며, 빈 문자욜은 허용되지 않는다')
    } 
    return `${name} 안녕~!`;
}

result = hi();
console.log(result);

// 아래의 경우 TypeError가 발생한다
// result = hi(''); // 빈 문자열은 허용하지 않음
// result = hi('다람쥐','원숭이','판다');  // arguments가 1개 이상이여서 에러
// result = hi(1);  // 문자열이여야 한다