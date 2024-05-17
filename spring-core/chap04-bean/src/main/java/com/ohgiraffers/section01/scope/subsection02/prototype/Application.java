package com.ohgiraffers.section01.scope.subsection02.prototype;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import com.ohgiraffers.section01.scope.subsection01.singleton.ContextConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println("beanName : " + beanName);
        }

        Product carpBread = context.getBean("carpBread", Bread.class);

        Product milk = context.getBean("milk", Beverage.class);

        Product water = context.getBean("water", Beverage.class);

        ShoppingCart cart1 = context.getBean("cart", ShoppingCart.class);

        cart1.addItem(carpBread);
        cart1.addItem(milk);

        System.out.println("cart1에 담긴 아이템 : " + cart1.getItem());

        ShoppingCart cart2 = context.getBean("cart", ShoppingCart.class);
        cart2.addItem(water);

        System.out.println("cart2에 담긴 아이템 : " + cart2.getItem());

        System.out.println("cart1의 hashcode : " + cart1.hashCode());
        System.out.println("cart2의 hashcode : " + cart2.hashCode());

        // Spring Framework 에서 bean 의 기본 스코프는 singleton 이다
        // singleton 스코프를 갖는 bean 은 어플리케이션 내에서 유일한 인스턴스를 갖는다
        // 컨테이너는 cart 라는 bean 을 딱 한개만 가지고 있기 때문에 둘은 같은 주소값을 가지고 있다
    }
}
