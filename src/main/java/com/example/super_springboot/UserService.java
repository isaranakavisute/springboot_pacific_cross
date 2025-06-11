package com.example.super_springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    //public UserService(UserRepository userRepository) { this.userRepository = userRepository; }

    public List<username_password> findAll()
    {
        return (List<username_password>) userRepository.findAll();
    }

}
