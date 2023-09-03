package com.sparta.springlevel4.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * 클라이언트에게 로그인 상태를 알려주는 DTO
 * statusCode: 200 - 로그인 성공
 * statusCode: 400 - 로그인 실패
 * message: 로그인 성공/실패 메시지
 */
@Getter
@Setter
public class LoginStatusDto {
    private String statusCode;
    private String message;
    public LoginStatusDto(String statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

}
