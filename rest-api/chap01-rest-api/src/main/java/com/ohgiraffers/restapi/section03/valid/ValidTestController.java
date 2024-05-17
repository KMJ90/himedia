package com.ohgiraffers.restapi.section03.valid;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;


@RestController
@RequestMapping("/valid")
public class ValidTestController {

    @GetMapping("/users/{userNo}")
    public ResponseEntity<Void> findUserByNo() throws UserNotFoundException {

        boolean check = true;
        if (check) {
            throw new UserNotFoundException("회원 정보를 찾을 수 없습니다.");
        }
        return ResponseEntity.ok().build();
    }

    // 유저 등록 상황
    @PostMapping("/users")
    public ResponseEntity<Void> registUser(@Valid @RequestBody UserDTO user) { // @Valid : 파라미터로 넘어온 값을 validation 검사함

        return ResponseEntity
                .created(URI.create("/valid/users/1"))
                .build();
    }
}
