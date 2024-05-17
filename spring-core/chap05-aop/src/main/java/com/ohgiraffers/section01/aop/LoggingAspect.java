package com.ohgiraffers.section01.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // @Pointcut : 여러 조인 포인트를 매치하기 위해 지정한 표현식
    @Pointcut("execution(* com.ohgiraffers.section01.aop.*Service.*(..))")
    public void LogPointcut() {}

    // JoinPoint : 포인트컷으로 패치한 실행 시점
    // 이렇게 매치된 조인포인트에서 해야 할 일이 어드바이스이다
    // 매개변수로 전달한 JoinPoint 객체는 현재 조인 포인트의 메소드명, 인수값 등의 자세한 정보를 엑세스 할 수 있다
    @Before("LoggingAspect.LogPointcut()")
    public void LogBefore(JoinPoint joinPoint) {
        System.out.println("Before joinPoint.getTarget() : " + joinPoint.getTarget());
        System.out.println("Before joinPoint.getSignature() : " + joinPoint.getSignature());
        if (joinPoint.getArgs().length > 0) {
            System.out.println("Before joinPoint.getArgs()[0] : " + joinPoint.getArgs()[0]);
        }
    }

    // 포인트 것을 동일한 클래스 내에서 사용하는 것이면 클래스명은 생략 가능하다
    // 단, 패키지가 다르면 패키지를 포함한 클래스명을 기술해야 한다
    @After("LogPointcut()")
    public void LogAfter(JoinPoint joinPoint) {
        System.out.println("After joinPoint.getTarget() : " + joinPoint.getTarget());
        System.out.println("After joinPoint.getSignature() : " + joinPoint.getSignature());
        if (joinPoint.getArgs().length > 0) {
            System.out.println("After joinPoint.getArgs()[0] : " + joinPoint.getArgs()[0]);
        }
    }
}
