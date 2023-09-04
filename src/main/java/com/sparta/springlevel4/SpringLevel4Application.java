package com.sparta.springlevel4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // 이거 달아야 시간 기능 구현 가능
@SpringBootApplication
public class SpringLevel4Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringLevel4Application.class, args);
    }

}
