class Book {

    // 클래스를 정의할 때 '프로퍼티 이름 = 값'을 써주면 클래스 필드를 만들 수 있다
    // 최신 브라우저(크롬 72 이상) 또는 최신 Node.js(버전 12 이상) 에서만 실행 가능하다
    name = "모던JavaScript";
    // this.price =35000;  // 문법 오류 : this. 은 생성자 내부 또는 메소드 내부에서 작성해야 한다

    introduce() {
        console.log(`${this.name}가 그렇게 재밌죠~~`);
    }
}

let book = new Book();
console.log(Book.prototype.name);  // undefined 출력 / Book.porototype이 아닌 개별 객체에만 클래스 필드가 설정
console.log(Book.prototype.introduce);  // [Function: introduce] 출력
console.log(book.name);  // 모던JavaScript
book.introduce();  // 모던JavaScript가 그렇게 재밌죠~~