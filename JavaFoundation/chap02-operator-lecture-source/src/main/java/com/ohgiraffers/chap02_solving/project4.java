package com.ohgiraffers.chap02_solving;

public class project4 {
    public static void main(String[] args) {

        double dnum = 76.0;
        int inum = (int) dnum;
// String result3 = (num3 > 0)? "양수야!" : (num3 == 0)? "0이다" : "음수야!";
        String score = (inum >= 90)? "A" : (inum >= 80)? "B" : (inum >= 70)? "C" : (inum >= 60)? "D":"F";
        System.out.println(score);



    }
}

