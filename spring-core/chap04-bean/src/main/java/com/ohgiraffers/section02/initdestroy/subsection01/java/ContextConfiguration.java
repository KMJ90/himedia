package com.ohgiraffers.section02.initdestroy.subsection01.java;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ContextConfiguration {

    @Bean
    public Product carpBread() {
        return new Bread("붕어빵", 1000, new java.util.Date());  // new java.util.Date() : 음식은 날짜
    }

    @Bean
    public Product milk() {
        return new Beverage("바나나우유", 1500, 500);  // capacity : 음료는 용량으로 표현
    }

    @Bean
    public Product water() {
        return new Beverage("지리산암반수", 3000, 500);  // capacity : 음료는 용량으로 표현
    }

    @Bean
    @Scope("prototype")
    public ShoppingCart cart() {
        return new ShoppingCart();
    }

    @Bean(initMethod = "openShop", destroyMethod = "closeShop")  // 생성 / 소멸 시에 이벤트를 발생시킴
    public Owner owner() {
        return new Owner();
    }

    // XML 파일에서 <bean> 태그를 이용할 경우
    // <bean id="cart" class="com.ohgiraffers.section01.xmlconfig.ShoppingCart" scope="prototype"/>
}
