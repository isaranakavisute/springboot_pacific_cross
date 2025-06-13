package com.example.super_springboot;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface MR_MEMBER_PLAN_Repository extends JpaRepository<MrMemberPlan, Integer> {

    @Query(value = "SELECT MEPL_OID,MEMB_OID,POPL_OID,EFF_DATE,EXP_DATE FROM MR_MEMBER_PLAN where MEMB_OID=:MEMB_OID", nativeQuery = true)
    Collection<MrMemberPlan> get_POPL_OID(Long MEMB_OID);
}
