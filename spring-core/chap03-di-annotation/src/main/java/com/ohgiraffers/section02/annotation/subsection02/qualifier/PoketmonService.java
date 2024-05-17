package com.ohgiraffers.section02.annotation.subsection02.qualifier;

import com.ohgiraffers.section02.common.Poketmon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("poketmonServiceQualifier")
public class PoketmonService {

    // 필드 주입 방식
//    @Autowired
//    @Qualifier("pikachu")  // 어노테이션이 두개면 @Qualifier 우선 작동
    private Poketmon poketmon;

    // 생성자 주입 방식
    @Autowired
    public PoketmonService(@Qualifier("squirtle") Poketmon poketmon) {
        this.poketmon = poketmon;
    }
    public void poketmonAttack() {
        poketmon.attack();
    }
}
