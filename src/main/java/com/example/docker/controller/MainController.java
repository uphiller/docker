package com.example.docker.controller;

import com.example.docker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public ResponseEntity<?> getBuoy(){
        return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }
}
