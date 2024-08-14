package com.homedecor.decorpalace.controller;

import com.homedecor.decorpalace.dto.UserDto;
import com.homedecor.decorpalace.entity.User;
import com.homedecor.decorpalace.entity.UserMapper;
import com.homedecor.decorpalace.response.AuthenticationResponse;
import com.homedecor.decorpalace.service.AuthenticationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loginregister")
public class AuthenticationController {

    @Autowired
    private AuthenticationService authenticationService;
    @Autowired
    private UserMapper userMapper;


    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody @Valid UserDto request) {
        User user = userMapper.toEntity(request);
        AuthenticationResponse response = authenticationService.register(user);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }


    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> login(@RequestBody @Valid UserDto request) {
        User user = userMapper.toEntity(request);
        AuthenticationResponse response = authenticationService.login(user);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    }

