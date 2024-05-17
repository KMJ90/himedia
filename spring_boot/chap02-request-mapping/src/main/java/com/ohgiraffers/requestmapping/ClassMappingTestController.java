package com.ohgiraffers.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/order/*")
public class ClassMappingTestController {

    // class 레벨 매핑
    @GetMapping("/regist")  // class 레벨 매핑일 때 앞에 order 생략가능
    public String registOrder(Model model) {

        model.addAttribute("message", "GET 방식의 주문 등록용 핸들러 메소드 호출");

        return "mappingResult";
    }

    // @PathVariable 어노테이션을 이용해 요청 path 로부터 변수를 받아올 수 있다
    // path variable 로 전달 되는 {변수형} 값은 반드시 매개변수명과 동일해야 한다
    // 동일하지 않으면 @PathVariable("이름")을 설정해주어야 한다
    @GetMapping("/detail/{orderNo}")
    public String selectOrderDetail(Model model, @PathVariable("orderNo") int orderNo) {

        model.addAttribute("message", orderNo + "번 주문 상세 내용 조회용 핸들러 메소드 호출");

        return "mappingResult";
    }

    @RequestMapping(value = {"modify", "delete"}, method = RequestMethod.POST)
    public String modifyAndDelete(Model model) {

        // parsing 불가능한 pathVariable 이 전달되면 400번 에러 발생
        // pathVariable 이 없으면 해당 핸들러 메소드를 찾기 못한다
        model.addAttribute("message", "POST 방식의 주문 수정, 삭제 공통 핸들러 메소드 호출");

        return "mappingResult";
    }

    // 아무런 URL 을 설정하지 않으면 요청 처리에 대한 핸들러 메소드가 준비되지 않았을 때 해당 메소드를 호출
    @RequestMapping
    public String otherRequest(Model model) {

        model.addAttribute("message", "order 요청이긴 하지만 다른 기능은 준비중...");

        return "mappingResult";
    }


}
