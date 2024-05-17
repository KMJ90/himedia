package com.ohgiraffers.section02.sessionlistener;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.*;

@WebListener
public class SessionListenerTest implements HttpSessionListener, HttpSessionAttributeListener {


    public SessionListenerTest() {

        System.out.println("session listener 인스턴스 생성");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {

        System.out.println("session 생성");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {

        System.out.println("session 소멸");
    }


    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {

        System.out.println("session attribute 추가");
        System.out.println("session 에 추가된 attribute : " + event.getName() + ", " + event.getValue());

    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {

        System.out.println("session attribute 삭제");
        System.out.println("session 에 삭제된 attribute : " + event.getName() + ", " + event.getValue());

    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {

        System.out.println("session attribute 수정");
        System.out.println("session 에 수정된 attribute : " + event.getName() + ", " + event.getValue());

    }
}
