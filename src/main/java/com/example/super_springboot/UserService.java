package com.example.super_springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private ADODB_LOGSQLRepository ADODB_LOGSQLRepository;
    public List<ADODB_LOGSQL> findAll()
    {
        return (List<ADODB_LOGSQL>) ADODB_LOGSQLRepository.findAll();
    }
    public List<ADODB_LOGSQL> Get_SQL0_SQL1() { return (List<ADODB_LOGSQL>) ADODB_LOGSQLRepository.Get_SQL0_SQL1(); }

}
