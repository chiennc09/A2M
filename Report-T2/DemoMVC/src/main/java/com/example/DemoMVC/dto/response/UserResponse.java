package com.example.DemoMVC.dto.response;

import com.example.DemoMVC.entity.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponse {
    private String id;
    private String username;
    private String address;
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("birth_date")
    private LocalDate birthDate;

    public static UserResponse fromUser(User user){
        UserResponse userResponse = UserResponse.builder()
                .id(user.getId())
                .username(user.getUsername())
                .address(user.getAddress())
                .phoneNumber(user.getPhoneNumber())
                .birthDate(user.getBirthDate())
                .build();

        return userResponse;
    }
}
