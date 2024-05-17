package com.ohgiraffers.section01.conditional;

public class Application {
    public static void main(String[] args) {

        A_if a = new A_if();
//        a.simpleIfStatment();
//        a.nestedIfStatment();

        B_ifElse b = new B_ifElse();
//        b.simpleIfElsestatment();
//        b.nestedIfElseStatment();

        C_ifElseif c = new C_ifElseif();
//        c.simpleIfElseIfStatment();
//        c.nestedIfElseIfStatment();

        D_switch d = new D_switch();
//        d.simpleSwitchStatment();
        d.switchVendingMachine();
    }
}
