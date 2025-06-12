package com.example.super_springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {
    @Autowired
    private UserService userService;

    @Autowired
    private ADODB_LOGSQLRepository ADODB_LOGSQLRepository;

    @GetMapping("/")
    public String home() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/mycontroller")
    public String isara() {
        return "Greetings from mycontroller";
    }

    @GetMapping(path="/checkdb")
    public List<SQL1> getAllUsers2() {

        List<SQL1> retval = new ArrayList<>();
        SQL1 sql_obj = new SQL1();
        List<ADODB_LOGSQL> list_obj = (List<ADODB_LOGSQL>) ADODB_LOGSQLRepository.Get_SQL0_SQL1();

        for (int i = 0 ; i < list_obj.size() ; i++) {
            sql_obj.setSQL1(list_obj.get(i).getSQL1());
            retval.add(sql_obj);
        }

     return retval;
    }
}







