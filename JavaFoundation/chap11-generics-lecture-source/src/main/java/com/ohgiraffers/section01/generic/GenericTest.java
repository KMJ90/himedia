package com.ohgiraffers.section01.generic;

public class GenericTest<T> {  // <T, A, C> 등 컴마로 여러개 가능

    private T value;
    public void setValue(T value) {
        this.value = value;
    }
    public T getValue() {
        return this.value;
    }
}
