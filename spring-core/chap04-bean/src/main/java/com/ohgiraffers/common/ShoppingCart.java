package com.ohgiraffers.common;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Product> items;

    // 기본적으로 생성자가 호출될 때 ArrayList 가 만들어질 수 있도록 해준다
    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Product item) {
        items.add(item);
    }

    public List<Product> getItem() {
        return items;
    }
}
