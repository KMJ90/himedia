package com.ohgiraffers.restapi.section01.response;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@RestController  // 응답의 값이 ResponseBody 에 들어감
@RequestMapping("/response")
public class ResponseRestController {

    /* 1. 문자열 응답 */
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";  // 뷰가 아니라 데이터를 반환
    }

    /* 2. 기본 자료형 응답 */
    @GetMapping("/random")
    public int getRandomNumber() {
        return (int)(Math.random() * 10) + 1;
    }

    /* 3. Object 응답 */
    @GetMapping("/message")
    public Message getMessage() {
        return new Message(200, "메세지를 응답합니다.");
    }

    /* 4. List 응답 */
    @GetMapping("/list")
    public List<String> getList() {
        return List.of(new String[]{"사과", "바나나", "복숭아"});
    }

    /* 5. map 응답 */
    @GetMapping("/map")
    public Map<Integer, String> getMap() {
        List<Message> messageList = new ArrayList<>();
        messageList.add(new Message(200, "정상 응답"));
        messageList.add(new Message(404, "페이지를 찾을 수 없습니다"));
        messageList.add(new Message(500, "개발자의 잘못입니다"));

        return messageList.stream().collect(Collectors.toMap(Message::getHttpStatusCode, Message::getMessage));
    }

    /* 6. 파일 응답 */
    @GetMapping(value = "/image", produces = MediaType.IMAGE_PNG_VALUE)
    public byte[] getImage() throws IOException {
        return getClass().getResourceAsStream("/images/spring.png").readAllBytes();  // readAllBytes : 모든 byte 를 읽어옴
    }

    /* 7. ResponseEntity 응답 */
    @GetMapping("/entity")
    public ResponseEntity<Message> getEntity() {
        return ResponseEntity.ok(new Message(123, "hello world"));  // .ok : httpStatusCode 가 200이 되도록 함
                                    // .ok 뒤에 괄호는 body 에 들어갈 내용
    }

}
