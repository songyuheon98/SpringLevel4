package com.sparta.springlevel4.controller;

import com.sparta.springlevel4.dto.LoginStatusDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 로그인 상태를 알려주는 컨트롤러
 * 로그인 성공 시 200 OK
 * 로그인 실패 시 400 Bad Request
 * message: 로그인 성공/실패 메시지
 */
@RestController
public class StatusController {

    @GetMapping("/login/success")
    public LoginStatusDto loginSuccess() {
        return new LoginStatusDto("200", "로그인 성공");
    }
}
