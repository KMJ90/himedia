package com.greedy.level02.normal.student.run;

import com.greedy.level02.normal.book.model.vo.BookVO.BookVO;
import com.greedy.level02.normal.student.model.vo.StudentVO.java.StudentVO;

public class Application {
    public static void main(String[] args) {


        StudentVO student2 = new StudentVO(1, 2, "홍길동", 175.5, '남');
        student2.printInformation();


    }
}
