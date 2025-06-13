package com.example.super_springboot;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface MR_POLICY_PLAN_Repository extends JpaRepository<MrPolicyPlan, Integer> {

    @Query(value = "SELECT POPL_OID,POCY_OID,PLAN_OID FROM MR_POLICY_PLAN where POPL_OID=:POPL_OID", nativeQuery = true)
    Collection<MrPolicyPlan> get_POCY_OID(Long POPL_OID);
}

