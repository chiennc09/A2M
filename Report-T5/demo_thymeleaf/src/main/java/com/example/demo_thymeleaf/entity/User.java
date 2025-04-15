package com.example.demo_thymeleaf.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {


    private String id;

    private String username;
    private String password;
    private String address;
    private String phoneNumber;
    private LocalDate birthDate;
}
