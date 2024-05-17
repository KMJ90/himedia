package com.hw1.model.dto;

public class CookBook {

    // 필드생성
    private boolean coupon;  // 요리학원쿠폰유무

    // setter
    public void setCoupon(boolean coupon) {
        this.coupon = coupon;
    }

    // getter
    public boolean isCoupon() {
        return coupon;
    }

    // 생성자
    public CookBook(boolean coupon) {
        this.coupon = coupon;
    }

    // 기본 생성자
    public CookBook() {
    }

    @Override
    public String toString() {
        return "CookBook{" +
                "coupon=" + coupon +
                '}';
    }
}
