package com.ohgiraffers.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// HandlerInterceptor 메소드가 URL 어디에 사용될건지 명시하는 클래스
@Configuration
public class WebConfiguration implements WebMvcConfigurer {

    @Autowired
    private final StopwatchInterceptor stopwatchInterceptor;

    // 생성자 의존성 주입
    public WebConfiguration(StopwatchInterceptor stopwatchInterceptor) {
        this.stopwatchInterceptor = stopwatchInterceptor;
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(stopwatchInterceptor)
                // 어느 요청에 적용을 시킬건지
                .addPathPatterns("/stopwatch");
    }
}
