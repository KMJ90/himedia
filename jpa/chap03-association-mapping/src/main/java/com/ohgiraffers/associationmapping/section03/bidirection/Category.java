package com.ohgiraffers.associationmapping.section03.bidirection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

// 양방향으로 참조하는
@Entity(name = "bidirection_category")
@Table(name = "tbl_category")
public class Category {

    // 진짜 연관관계(FK 를 가진쪽 / Menu 쪽) / 가짜 연관관계 (FK 를 가지지 않은쪽)

    @Id
    private int categoryCode;

    private String categoryName;

    private Integer refCategoryCode;

    @OneToMany(mappedBy = "category")  // category : 진짜 연관관계(FK)의 필드명
    private List<Menu> menuList;

    protected Category() {}

    public Category(int categoryCode, String categoryName, Integer refCategoryCode, List<Menu> menuList) {
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
        this.refCategoryCode = refCategoryCode;
        this.menuList = menuList;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getRefCategoryCode() {
        return refCategoryCode;
    }

    public void setRefCategoryCode(Integer refCategoryCode) {
        this.refCategoryCode = refCategoryCode;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryCode=" + categoryCode +
                ", categoryName='" + categoryName + '\'' +
                ", refCategoryCode=" + refCategoryCode +
                '}';
    }
}
