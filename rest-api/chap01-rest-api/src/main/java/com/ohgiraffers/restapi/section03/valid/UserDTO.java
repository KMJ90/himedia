package com.ohgiraffers.restapi.section03.valid;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.validator.constraints.Length;
import java.util.Date;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class UserDTO {

    private int no;

    @NotNull(message = "아이디는 반드시 입력되어야 합니다.")
    @NotBlank(message = "아이디는 공백일 수 없습니다.") // 공백일 수 없다
    private String id;

    @NotNull(message = "아이디는 반드시 입력되어야 합니다.")  // null 값일 수 없다
    @NotBlank(message = "아이디는 공백일 수 없습니다.") // 공백일 수 없다
    @Length(max = 10, message = "비밀번호는 길이 10을 초과할 수 없습니다.")
    private String pwd;

    @NotNull(message = "아이디는 반드시 입력되어야 합니다.")  // null 값일 수 없다
    @NotBlank(message = "아이디는 공백일 수 없습니다.") // 공백일 수 없다
    @Size(max = 10, message = "이름은 길이 10을 초과할 수 없습니다.")
    private String name;

    @Past(message = "가입일은 현재보다 과거 날짜가 입력되어야 합니다.") // 여기에 넘어오는 값이 반드시 과거여야 한다
    // @Future  // 여기에 넘어오는 값이 반드시 미래여야 한다
    private Date enrollDate;

}
