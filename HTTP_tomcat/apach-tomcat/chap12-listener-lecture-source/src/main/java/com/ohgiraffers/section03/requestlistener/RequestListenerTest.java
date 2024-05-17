package com.ohgiraffers.section03.requestlistener;

import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.annotation.WebServlet;

@WebListener
public class RequestListenerTest implements ServletRequestListener, ServletRequestAttributeListener {

    public RequestListenerTest() {

        System.out.println("request listener 인스턴스 생성");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {

        System.out.println("request attribute 추가");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {

        System.out.println("request attribute 삭제");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {

        System.out.println("request attribute 수정");
        System.out.println(srae.getName() + " : " + srae.getValue());
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {

        // request 인스턴스 소멸 시 (응답 완료 후 요청 해제 시) 동작
        System.out.println("request attribute 소멸");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {

        System.out.println("request attribute 생성");
    }
}
