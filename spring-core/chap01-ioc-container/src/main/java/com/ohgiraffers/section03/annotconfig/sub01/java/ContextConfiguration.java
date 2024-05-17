package com.ohgiraffers.section03.annotconfig.sub01.java;

import org.springframework.context.annotation.ComponentScan;

// @ComponentScan ?
// base Package 로 설정 된 하위 경로에 특정 어노테이션을 가지고 있는 클래스를 bean 으로 등록하는 기능이다
// base Package 를 설정하지 않으면 기본적으로 설정 파일과 동일한 패키지에 있는 bean 만 탐색한다
// @Component 어노테이션이 작성 된 클래스를 인식하여 bean 으로 등록한다
@ComponentScan(basePackages = "com.ohgiraffers")
public class ContextConfiguration {
}
