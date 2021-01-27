package com.protocol.protocol.service;

import com.protocol.protocol.model.UserModel;
import com.protocol.protocol.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserModel> userList(){
        return this.userRepository.findAll();
    }

    public UserModel saveUser(@RequestBody UserModel user) {
        return this.userRepository.save(user);
    }

}
