package com.example.DemoMVC.service;

import com.example.DemoMVC.dto.request.AuthenticationRequest;
import com.example.DemoMVC.dto.response.UserResponse;
import com.example.DemoMVC.entity.User;
import com.example.DemoMVC.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository userRepository;

    public UserResponse login(AuthenticationRequest request){
        User user = userRepository.findByUsername(request.getUsername()).orElseThrow(() -> new RuntimeException("user khong ton tai"));
        boolean authenticated = request.getPassword().equals(user.getPassword());
        if(!authenticated)
            throw new RuntimeException("username or password incorrect!!");
        return UserResponse.fromUser(user);
    }
}
