package com.example.DemoMVC.controller;

import com.example.DemoMVC.dto.request.AuthenticationRequest;
import com.example.DemoMVC.dto.response.UserResponse;
import com.example.DemoMVC.service.AuthenticationService;
//import com.example.DemoMVC.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:5173")
@RequiredArgsConstructor
public class UserController {
//    private final UserService userService;
    private final AuthenticationService authenticationService;

    @PostMapping("/login")
    ResponseEntity<?> authenticate (@RequestBody AuthenticationRequest request){
        try{
            UserResponse userResponse = authenticationService.login(request);
            return ResponseEntity.ok(userResponse);
        }
        catch (RuntimeException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
