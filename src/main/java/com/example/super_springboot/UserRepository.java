package com.example.super_springboot;

import com.example.super_springboot.username_password;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.example.super_springboot.UserRepository;


import java.util.Optional;


public interface UserRepository extends JpaRepository<username_password, Integer> {


}
