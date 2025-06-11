package com.example.super_springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public List<ADODB_LOGSQL> findAll()
    {
        return (List<ADODB_LOGSQL>) userRepository.findAll();
    }
    public List<ADODB_LOGSQL> Get_SQL0_SQL1() { return (List<ADODB_LOGSQL>) userRepository.Get_SQL0_SQL1(); }

}
