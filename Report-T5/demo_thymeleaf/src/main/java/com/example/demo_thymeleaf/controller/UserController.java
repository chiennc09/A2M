package com.example.demo_thymeleaf.controller;

import com.example.demo_thymeleaf.dto.request.AuthenticationRequest;
import com.example.demo_thymeleaf.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final AuthenticationService authenticationService;

    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("request", new AuthenticationRequest());
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("request") AuthenticationRequest request, Model model) {
        try {
            var user = authenticationService.login(request);
            model.addAttribute("user", user);
            return "welcome"; // Trang sau khi login thành công
        } catch (RuntimeException e) {
            model.addAttribute("error", e.getMessage());
            return "login"; // Quay lại login nếu lỗi
        }
    }
}
