package com.ohgiraffers.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class StopwatchInterceptor implements HandlerInterceptor {

    private final MenuService menuService;

    //  생성자가 하나 일 때는 @Autowired 생략되고 있음
    public StopwatchInterceptor(MenuService menuService) {
        this.menuService = menuService;
    }

    // 전처리 메소드
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("preHandler 호출함");

        Long startTime = System.currentTimeMillis();

        request.setAttribute("startTime", startTime);

        // true 를 반환하면 컨트롤러 메소드의 호출로 이어지고, false 로 반환하면 호출하지 않음
        return true;
    }

    // 후처리 메소드
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

        System.out.println("postHandler 호출함");

        Long startTime = (Long) request.getAttribute("startTime");
        Long endTime = System.currentTimeMillis();

        modelAndView.addObject("interval", endTime - startTime);
    }

    // 뷰가 렌더링 된 이후 동작하는 메소드
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        System.out.println("afterCompletion 호출함");

        menuService.method();
    }
}
