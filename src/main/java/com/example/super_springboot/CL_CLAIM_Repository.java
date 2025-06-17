package com.example.super_springboot;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface CL_CLAIM_Repository extends JpaRepository<ClClaim, Integer> {

    @Query(value = "SELECT CLAM_OID,CL_NO,SCMA_OID_CL_STATUS,REMARK FROM CL_CLAIM where CL_NO=:CL_NO", nativeQuery = true)
    Collection<ClClaim> get_CL_CLaim(String CL_NO);

}

