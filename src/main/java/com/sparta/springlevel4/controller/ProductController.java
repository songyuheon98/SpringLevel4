package com.sparta.springlevel4.controller;

import com.sparta.springlevel4.entity.User;
import com.sparta.springlevel4.security.UserDetailsImpl;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class ProductController {
    @GetMapping("/products")
    public String getProducts(@AuthenticationPrincipal UserDetailsImpl userDetails){
        User user = userDetails.getUser();
        System.out.println(user.getUsername());

        return "products";
    }
}
