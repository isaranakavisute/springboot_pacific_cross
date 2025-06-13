package com.example.super_springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface PD_PLAN_Repository extends JpaRepository<PdPlan, Integer> {

    @Query(value = "SELECT PLAN_OID, PLAN_ID, PLAN_NO FROM PD_PLAN where PLAN_OID=:PLAN_OID", nativeQuery = true)
    Collection<PdPlan> get_PLAN_ID(Long PLAN_OID);
}

