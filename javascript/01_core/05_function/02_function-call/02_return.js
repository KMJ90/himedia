// 2. 반환문

function hello(name) {
    console.log(name);

    return `${name}님 안녕하세요 :)`;

    // 반환문 이후의 실행구문은 무시된다
    console.log('나는 return 뒤에 나오지~~~~!');  // 무시되어서 출력 안됨
}

console.log(hello('판다'));

function func() {
    console.log('함수 호출');

    // 반환 값을 명시하지 않거나 반환문을 생략할 수 있다
    // 이런 경우 undefined가 반환된다
    return;
}

console.log(func());