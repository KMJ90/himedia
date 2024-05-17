package com.ohgiraffers.cookie;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;


import java.io.IOException;

@WebServlet({"/cookie"})
public class CookieHandlerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        System.out.println("firstName : " + firstName);
        System.out.println("lasttName : " + lastName);

//        response.sendRedirect("redirect");

        // [ 쿠키 사용 절차 ]
        // 1. 쿠키를 생성한다
        // 2. 생성한 쿠키의 만료 시간을 설정한다
        // 3. 응답 헤더에 쿠키를 담는다
        // 4. 응답을 보낸다

        // [ 쿠키 제약 사항 ]
        // 이름은 ascii 문자만을 사용 해야 하며 한 번 설정한 이름은 변경 불가
        // 이름에 공백 문자와 일부 특수 문자 ([ ] ( ) = , " \ ? @ : ;) 사용 불가

        // 1. 쿠키를 생성한다
        Cookie firstNameCookie = new Cookie("firstName", firstName);
        Cookie lastNameCookie = new Cookie("lastName", lastName);

        // 2. 생성한 쿠키의 만료 시간을 설정한다
        firstNameCookie.setMaxAge(60 * 60 * 24);  // 초 단위 설정 (하루를 만료로 설정함)
        lastNameCookie.setMaxAge(60 * 60 * 24);

        // 3. 응답 헤더에 쿠키를 담는다
        response.addCookie(firstNameCookie);
        response.addCookie(lastNameCookie);

        // 4. 응답을 보낸다
        response.sendRedirect("redirect");
    }
}
