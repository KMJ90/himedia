package com.ohgiraffers.section01.contextlistener;

import jakarta.servlet.ServletContextAttributeEvent;
import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ContextListenerTest implements ServletContextListener, ServletContextAttributeListener {

    // 1. context : 톰켓 컨테이너 자체에 리스너 연결
    // - ServletContextListener : 웹 애플리케이션의 시작/종료에 대한 이벤트 리스너
    // - ServletContextAttributeListener : context 에 attribute 추가/수정/삭제에 대한 이벤트 리스너

    public ContextListenerTest() {

        System.out.println("context listener 인스턴스 생성");

    }
    @Override
    public void contextInitialized(ServletContextEvent sce) {

        System.out.println("context init !!!!!!");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        System.out.println("context destroy !!!!!!");  // 종료할때 사용
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {

        System.out.println("context attribute 추가~ ");
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {

        System.out.println("context attribute 제거~ ");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {

        System.out.println("context attribute 수정~ ");
    }
}
