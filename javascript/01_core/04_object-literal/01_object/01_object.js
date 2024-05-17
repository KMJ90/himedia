// 1. object
// 객체 리터럴을 통해 객체 생성(중괄호 내 0개 이상의 프로퍼티 정의)

var teacher = {
    // 키 : 값 쌍으로 구성된 프로퍼티
    // 프로퍼티 : 객체의 상채를 나타내는 값(data)
    name : '다람쥐',
    age : 900,
    
    // 메소드(method) : 프로퍼티(상태 데이터)를 참조하고 조작할 수 있는 동작
    getInfo : function() {
        return `${this.name}은(는) ${this.age}세의 선생님입니다.`;
    }
};

console.log(typeof teacher);
console.log(teacher);

var teacher2 = {};
console.log(typeof teacher2);
console.log(teacher2);
