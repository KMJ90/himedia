
let theater = {
    store : "건대점",
    titles : ["어벤저스", "겨울왕국", "스파이더맨", "라이온킹", "알라딘"],

    // 1. 화살표 함수는 this를 가지지 않는다
    showMovieList() {
        this.titles.forEach(
            title => console.log(`${this.store} : ${title}`)
        )
         // 화살표 함수다 아닌 일반 함수 안에서의 this는 Global이라고 하는 전역 객체를 가르킴
        this.titles.forEach(function(title) {
        console.log(`${this.store} : ${title}`);
    });
    }

   
}
theater.showMovieList();

// this가 없기 때문에 생성자 함수로 사용할 수 없다
const arrowfunc = () => {};
// new arrowfunc();
// 화살표 함수는 인스턴스를 생성할 수 없으므로 prototype 프로퍼티가 없고 프로토타입도 생성하지 않는다
console.log(arrowfunc.hasOwnProperty('prototype'));

//==============================================================

class Animal {

    constructor(name, weight) {
        this.name = name;
        this.weight = weight;
    }

    move(lostWeight) {
        if (this.weight > lostWeight)
            this.weight -= lostWeight;
        console.log(`${this.name}(은)는 움직임으로 인해 ${lostWeight}kg 감량되어 ${this.weight}kg이 되었습니다`);
    }
}

class Tiger extends Animal {

    move(lostWeight) {
        setTimeout(() => super.move(lostWeight), 3000);  // 2000 : 2초
        // setTimeout(function() {
        //     super.move(lostWeight) }, 2000)
            console.log('먹이를 찾아 산기슭을 어슬렁');
        }
        
}

let tiger = new Tiger("백두산 호랭이", 90);
tiger.move(1);

// 화살표 함수는 arguments를 지원하지 않는다 
(function() {
    const arrowfunc = () => console.log(arguments);
    arrowfunc(3, 4);
} (1, 2));
