package com.ohgiraffers.section02.encapsulation.solution1;

public class Application {
    public static void main(String[] args) {

        Monster monstar1 = new Monster();
        monstar1.setInfo("드라큘라");
        monstar1.setHp(100);

        Monster monstar2 = new Monster();
        monstar2.setInfo("프랑켄슈타인");
        monstar2.setHp(200);

        Monster monstar3 = new Monster();
        monstar3.setInfo("늑대인간");
        monstar3.setHp(-100);

        Monster monstar4 = new Monster();
        monstar4.setInfo("미이라");
        monstar4.setHp(400);

        System.out.println(monstar1.getInfo());
        System.out.println(monstar2.getInfo());
        System.out.println(monstar3.getInfo());
        System.out.println(monstar4.getInfo());
    }
}
