package com.ohgiraffers.restapi.section05.swagger;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.Date;

// @Schema(description =" " 으로 설정한것 http://localhost:8080/swagger-ui.html의 Schemas 에서 확인 가능
@AllArgsConstructor
@Getter
@Setter
@ToString
@Schema(description = "회원정보 DTO")
public class UserDTO {

    @Schema(description = "회원정보(PK)")
    private int no;

    @Schema(description = "회원ID")
    private String id;

    @Schema(description = "회원비밀번호")
    private String pwd;

    @Schema(description = "회원이름")
    private String name;

    @Schema(description = "회원등록일")
    private Date enrollDate;

}
