package com.ohgiraffers.section01.session;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;


import java.io.IOException;

@WebServlet("/session")
public class SessionHandlerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        System.out.println("firstName : " + firstName);
        System.out.println("lastName : " + lastName);

        // HttpSession : 인터페이스
        // HttpSession 은 직접 생성할 수 없고 request 에 있는 getSession 메소드를 이용해 리턴 받는다
        HttpSession session = request.getSession();

        System.out.println("session id : " + session.getId());

        // 기본 유지 시간 30분
        System.out.println("session default 유지 시간 : " + session.getMaxInactiveInterval());

        session.setMaxInactiveInterval(60 * 10);  // 10분으로 변경
        System.out.println("변경 후 유지 시간 : " + session.getMaxInactiveInterval());

        session.setAttribute("firstName", firstName);
        session.setAttribute("lastName", lastName);

        response.sendRedirect("redirect");  // url 경로
    }
}
