package com.example.super_springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.Collection;


public interface UserRepository extends JpaRepository<ADODB_LOGSQL, Integer> {

    @Query(value = "SELECT TIMER, SQL0, SQL1 FROM ADODB_LOGSQL", nativeQuery = true)
    Collection<ADODB_LOGSQL> Get_SQL0_SQL1();
}
