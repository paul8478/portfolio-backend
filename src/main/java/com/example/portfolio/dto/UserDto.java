package com.example.portfolio.dto;

import lombok.Data;

@Data
public class UserDto {
    private String name;
    private String email;
    private String age;

    public UserDto(String name, String email, String age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
}
