// explicit-coercion (명시적 타입 변환)

// 3. boolean 타입으로 변환

// 3-1. boolean 생성자 함수를 new 연산자 없이 호출하는 방법
console.log(Boolean('JavaScript'));
console.log(Boolean(''));
console.log(Boolean(1));
console.log(Boolean(0));
console.log(Boolean(NaN));
console.log(Boolean(Infinity));
console.log(Boolean(null));
console.log(Boolean(undefined));
console.log(Boolean({}));
console.log(Boolean([]));

// 3-2. 논리 부정 연산자 ! 를 두 번 사용하는 방법
console.log(!!'JavaScript');
console.log(!!'');
console.log(!!1);
console.log(!!0);
console.log(!!NaN);
console.log(!!Infinity);
console.log(!!null);
console.log(!!undefined);
console.log(!!{});
console.log(!![]);