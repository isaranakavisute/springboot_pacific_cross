package com.example.super_springboot;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@RestController
public class MyController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;



    @GetMapping("/")
    public String home() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/mycontroller")
    public String isara() {
        return "Greetings from mycontroller";
    }

    /*
    @GetMapping(path="/all1")
    public List<username_password> getAllUsers1() {
        return userService.findAll();
    }
     */

    @GetMapping(path="/checkdb")
    public List<username_password> getAllUsers2() {
        return (List<username_password>) userRepository.findAll();
    }

    @PostMapping(path="/mock")
    public ResponseEntity<MockReturn> getMock() {
        NestedData justdata= new NestedData(getAllUsers2(),getAllUsers2());
        MockReturn mock = new MockReturn(16,"test", 5, justdata );
        return ResponseEntity.status(HttpStatus.CREATED).contentType(MediaType.APPLICATION_JSON).body(mock);
    }


}







