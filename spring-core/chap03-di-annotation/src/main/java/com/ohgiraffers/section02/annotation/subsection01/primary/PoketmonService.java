package com.ohgiraffers.section02.annotation.subsection01.primary;

import com.ohgiraffers.section02.common.Poketmon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("poketmonServicePrimary")
public class PoketmonService {

    private Poketmon poketmon;


    @Autowired  // 생성자가 하나일 떄는 @Autowired 생략가능
    public PoketmonService(Poketmon poketmon) {
        this.poketmon = poketmon;
    }

    public void poketmonAttack() {
        poketmon.attack();
    }
}
