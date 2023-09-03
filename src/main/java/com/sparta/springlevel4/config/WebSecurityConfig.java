package com.sparta.springlevel4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Spring Security 설정
 * - CSRF 설정
 * - 로그인 사용
 * - resources 폴더에 있는 파일들에 대한 접근 허용
 * - 그 외 모든 요청에 대해 인증 처리
 * @Configuration: 스프링 설정 파일
 * - @Bean: 스프링이 관리하는 객체
 * - SecurityFilterChain: Spring Security 설정
 * - HttpSecurity: HTTP 요청에 대한 웹 기반 보안을 구성하는 데 사용
 * - csrf: Cross Site Request Forgery
 * - PathRequest: Spring Security에서 제공하는 정적 자원에 대한 요청을 허용하는 클래스
 * @EnableWebSecurity: Spring Security 지원을 가능하게 함
 */
@Configuration
@EnableWebSecurity // Spring Security 지원을 가능하게 함
public class WebSecurityConfig {
    /**
     * Spring Security 설정
     * @param http HttpSecurity 객체
     * @return SecurityFilterChain
     * @throws Exception
     */

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // CSRF 설정
        http.csrf((csrf) -> csrf.disable());

        http.authorizeHttpRequests((authorizeHttpRequests) ->
                authorizeHttpRequests
                        .requestMatchers("/api/user/**").permitAll() // 메모 관련 API 접근 허용 설정
                        .requestMatchers(HttpMethod.GET).permitAll() // GET 메소드 요청 허용 설정
                        .anyRequest().authenticated() // 그 외 모든 요청 인증처리
        );

        // 로그인 사용
        // 로그인 사용
        http.formLogin((formLogin) ->
                formLogin
                        // 로그인 처리 (POST /api/user/login)
                        .loginProcessingUrl("/api/user/login")
                        // 로그인 처리 후 성공 시 URL
                        .defaultSuccessUrl("/login/success", true)
                        // 로그인 처리 후 실패 시 URL
                        .failureUrl("/api/user/login-page?error")
                        .permitAll()
        );
        return http.build();



    }

}
