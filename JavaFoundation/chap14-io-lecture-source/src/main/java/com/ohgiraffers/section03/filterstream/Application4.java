package com.ohgiraffers.section03.filterstream;

import com.ohgiraffers.section03.filterstream.dto.MemberDTO;

import javax.imageio.IIOException;
import java.io.*;

public class Application4 {
    public static void main(String[] args) {

        // ObjectInputStream / ObjectOutputStream
        // 객체 단위로 입출력 하도록 하는 보조 스트림

        MemberDTO[] outputMembers = {
                new MemberDTO("user01", "pass01", "홍깅동", "kst9063888@naver.com", 25, '남', 1250.7),
                new MemberDTO("user02", "pass02", "유관순", "kkk9063888@naver.com", 55, '여', 1233.8),
                new MemberDTO("user03", "pass03", "허준", "mmm9063888@naver.com", 30, '여', 1123.4)

        };

        ObjectOutputStream objOut = null;

        try {
            objOut = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("src/main/java/com/ohgiraffers/section03/filterStream/score.txt")));

            for (int i = 0; i < outputMembers.length; i++) {
                objOut.writeObject(outputMembers[i]);
            }
            objOut.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (objOut != null) {
                try {
                    objOut.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // NotSerializableException 이란?
        // 직렬화 처리를 해주지 않아서 발생하는 에러이다

        // 직렬화란?
        // 자바 시스템 내부에서 사용되는 객체 또는 데이터를 외부애서도 사용할 수 있도록 byte 형태로 변환하는 기술
        // ( 반대로 byte 로 변환된 데이터를 다시 객체로 변환하는 기술을 역직렬화라고 한다

        MemberDTO[] inputMembers = new MemberDTO[3];
        ObjectInputStream objIn = null;

        try {
            objIn = new ObjectInputStream(new BufferedInputStream(new FileInputStream("src/main/java/com/ohgiraffers/section03/filterStream/score.txt")));
            while (true) {
                System.out.println(objIn.readObject());
            }
        } catch (EOFException e) {
            System.out.println("끝!!");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (objOut != null) {
                try {
                    objOut.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
