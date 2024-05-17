package com.ohgiraffers.jpql.section03.projection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "EmbeddedMenu")
@Table(name = "tbl_menu")
public class EmbeddedMenu {

    @Id
    private int menuCode;

    @Embedded
    private MenuInfo menuInfo;

    private int categoryCode;

    private String orderableStatus;

    public EmbeddedMenu() {}


}
