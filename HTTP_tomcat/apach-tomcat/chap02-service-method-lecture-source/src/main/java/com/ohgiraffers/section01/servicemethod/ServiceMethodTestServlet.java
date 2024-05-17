package com.ohgiraffers.section01.servicemethod;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;


import java.io.IOException;

@WebServlet("/request-service")
public class ServiceMethodTestServlet extends HttpServlet {

    // 나중에 HTTP 를 대체할 프로토콜이 존재한다면 HTTPServletRequest 는 다른 클래스로 대체 되어야 한다
    // 따라서 ServletRequest 라는 추상화 된 타입으로 사용하고 실제 인스턴스는 HTTPServletRequest 로 사용하여
    // 나중에 Service method 의 인자 타입은 변경하지 않고 다른 프로토콜을 사용하는 Request 로 변경이 가능하다(다형성)
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        // 현재 사용되는 프로토콜은 HTTP 프로토콜로, HTTPServletRequest 타입이다
        // HTTPServletRequest 는 ServletRequest 를 상속 받아 구현했으며, HTTP 프로토콜의 정보를 담고 있으므로
        // 실제 사용 시에는 다운 캐스팅해서 사용해야 한다
        HttpServletRequest httpServletRequest = (HttpServletRequest)  req;  // 요청 정보
        HttpServletResponse httpServletResponse = (HttpServletResponse) res;  // 응답 정보

        // 요청받은 HTTP 메소드가 어떤 메소드인지 판단한다
        String httpMethod = httpServletRequest.getMethod();
        // 요청 내용 출력
        System.out.println("httpMethod : " + httpMethod);

        if("GET".equals(httpMethod)) {
            // GET 요청을 처리할 메소드로 요청과 응답 정보를 전달한다
            doGet(httpServletRequest, httpServletResponse);
        } else  {
            // post 요청을 처리할 메소드로 요청과 응답 정보를 전달한다
            doPost(httpServletRequest, httpServletResponse);
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GET 요청을 처리할 메소드 호출");
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("POST 요청을 처리할 메소드 호출");
    }
}
