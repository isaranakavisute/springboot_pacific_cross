package com.example.super_springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface MR_MEMBER_PLAN_BENEFIT_Repository extends JpaRepository<MrMemberPlanBenefit, Integer> {

    @Query(value = "SELECT MEBE_OID,MEPL_OID,POBE_OID FROM MR_MEMBER_PLAN_BENEFIT where MEPL_OID=:MEPL_OID", nativeQuery = true)
    Collection<MrMemberPlanBenefit> get_POBE_OID(Long MEPL_OID);
}
