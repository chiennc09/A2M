package com.example.demo_thymeleaf.service;


import com.example.demo_thymeleaf.dto.request.AuthenticationRequest;
import com.example.demo_thymeleaf.dto.response.UserResponse;
import com.example.demo_thymeleaf.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    //private final UserRepository userRepository;

    public UserResponse login(AuthenticationRequest request){

        User user = User.builder()
                .id("abc10101")
                .username("chien")
                .password("123456")
                .birthDate(LocalDate.parse("2003-12-13")) // <-- định dạng ISO yyyy-MM-dd
                .address("Hai Phong")
                .phoneNumber("0971289082")
                .build();

        boolean authenticated = request.getPassword().equals(user.getPassword());
        if(!authenticated)
            throw new RuntimeException("username or password incorrect!!");
        return UserResponse.fromUser(user);
    }
}
