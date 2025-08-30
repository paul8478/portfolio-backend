package com.example.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.portfolio.dto.UserDto;
import com.example.portfolio.entity.User;
import com.example.portfolio.service.UserService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RestController
@RequestMapping("portfolio")
@CrossOrigin(origins = "https://spaul.vercel.app/")

public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDto> getData() {
        return userService.getdata();
    }

    @PostMapping("/add")
    public User createuser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/{id}")
    public User updateuser(@PathVariable Long id, @RequestBody User user) {
        return userService.updatUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteuser(@PathVariable Long id) {
        userService.deleteuser(id);
    }

}
