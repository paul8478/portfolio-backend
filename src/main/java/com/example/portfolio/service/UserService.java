package com.example.portfolio.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.portfolio.dto.UserDto;
import com.example.portfolio.entity.User;
import com.example.portfolio.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userrepository;

    public List<UserDto> getdata() {
        List<User> users = userrepository.findAll();

        return users.stream()
                .map(user -> new UserDto(user.getName(), user.getEmail(), user.getAge()))
                .collect(Collectors.toList());
    }

    public User createUser(User user) {
        return userrepository.save(user);
    }

    public User updatUser(Long id, User udata) {
        User user = userrepository.findById(id).orElse(null);
        if (user != null) {
            user.setName(udata.getName());
            user.setAge(udata.getAge());
            user.setAddress(udata.getAddress());
            user.setCity(udata.getCity());
            user.setCountry(udata.getCountry());
            user.setEmail(udata.getEmail());
            user.setPhno(udata.getPhno());
            user.setPincode(udata.getPincode());
            user.setState(udata.getState());
            return userrepository.save(user);
        }
        return null;
    }

    public void deleteuser(Long id) {
        userrepository.deleteById(id);
    }
}