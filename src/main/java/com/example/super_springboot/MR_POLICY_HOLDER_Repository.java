package com.example.super_springboot;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Collection;

public interface MR_POLICY_HOLDER_Repository extends JpaRepository<MrPolicyholder, Integer> {

    @Query(value = "SELECT POHO_OID,POHO_NAME_1,POHO_NAME_2,CUSTOMER_BRANCH,SCMA_OID_POHO_TYPE FROM MR_POLICYHOLDER where POHO_OID=:POHO_OID", nativeQuery = true)
    Collection<MrPolicyholder> get_poho_name(Long POHO_OID);


}
