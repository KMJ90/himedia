package com.ohgiraffers.section02.delete;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;


import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/delete")
public class DeleteSessionDataServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        System.out.println("redirect session id : " + session.getId());

        Enumeration<String> sessionNames = session.getAttributeNames();
        while (sessionNames.hasMoreElements()) {
            System.out.println(sessionNames.nextElement());
        }

        // [ 세션 데이터를 지우는 방법 ]
        // 1. 설정한 만료 시간이 지나면 세션이 만료된다
        // 2. removeAttribute() 로 session 의 Attribute 를 지운다
        // 3. invalidate() 를 호출하면 세션의 모든 데이터가 삭제된다

        System.out.println("---------------------------------");
        session.removeAttribute("firstName");

        sessionNames = session.getAttributeNames();
        while (sessionNames.hasMoreElements()) {
            System.out.println(sessionNames.nextElement());
        }

        System.out.println("---------------------------------");
        session.invalidate();

        // invalidate 를 호출하면 세션 자체를 무효화 했기 때문에 이후 세션을 이용하는 것은 에러가 발생한다
        // 즉, 세션 내의 데이터를 지우는 것 뿐만 아니라 세션을 강제로 만료시켰다고 볼 수 있다
        sessionNames = session.getAttributeNames();
        while (sessionNames.hasMoreElements()) {
            System.out.println(sessionNames.nextElement());
        }
    }
}
