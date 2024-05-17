package com.ohgiraffers.section02.annotation.subsection03.collection;

import com.ohgiraffers.section02.common.Poketmon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("poketmonServiceCollection")
public class PoketmonService {

//    // List 타입으로 주입
//    private List<Poketmon> poketmonList;
//
//    @Autowired
//    public PoketmonService(List<Poketmon> poketmonList) {
//        this.poketmonList = poketmonList;
//    }
//
//    public void poketmonAttack() {
//        poketmonList.forEach(Poketmon::attack);
//    }

    // Map 타입으로 주입
    private Map<String, Poketmon> poketmonMap;

    public PoketmonService(Map<String, Poketmon> poketmonMap) {
        this.poketmonMap = poketmonMap;
    }
    public void poketmonAttack() {
        poketmonMap.forEach((k, v) -> {
            System.out.println("key : " + k);
            System.out.print("공격 : ");
            v.attack();
        });
    }
}
