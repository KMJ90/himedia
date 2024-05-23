// 스프레드 문법
// 하나로 뭉쳐져 있는 여러 값들의 집합을 전개해서(펼쳐져서) 개별적인 값들의 목록으로 만든다 (배열, 객체)


let arr = [2, 5, 15]

// 배열의 변수명을 바로 넣으면 출력안됨
console.log(`가장 큰 값 : ${ Math.max(arr)}`);  // 가장 큰 값 : NaN

// arr 배열의 값을 일일히 넣어줘도 된다
console.log(`가장 큰 값 : ${ Math.max(2, 5, 15)}`);  // 가장 큰 값 : 15

// 함수를 호출할 때 ...arr 을 사용하면 arr 이 인수 목록으로 확장 된다
console.log(`가장 큰 값 : ${ Math.max(...arr)}`);  // 가장 큰 값 : 15

let arr1 = [5, 8, 22];
let arr2 = [34, 55, 97];

// 배열 객체 여러 개 전달 가능
console.log(`가장 작은 값 : ${ Math.min(...arr1, ...arr2)}`);

// 일반 값과 혼합해서 사용 가능
console.log(`가장 작은 값 : ${ Math.min(1, ...arr1, 3, ...arr2, 7)}`);

// 배열 병합에도 사용 가능 (concat 보다 간결하게 사용 가능)
let merged = [0, ...arr1, 2, ...arr2]
console.log(merged);

// 문자열을 배열로 변환
let str = "JavaScript";
console.log([...str]);  /* [
                                'J', 'a', 'v', 'a',
                                'S', 'c', 'r', 'i',
                                'p', 't'
                            ] */