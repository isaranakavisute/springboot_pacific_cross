package com.example.super_springboot;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Collection;

public interface CL_LINE_Repository extends JpaRepository<ClLine, Integer> {

    @Query(value = "SELECT CLLI_OID,CLAM_OID,INCUR_DATE_FROM,INCUR_DATE_TO,SCMA_OID_CL_TYPE,SCMA_OID_BED_TYPE,PRES_AMT,APP_AMT,PRIOR_PAID,SCMA_OID_CL_LINE_STATUS,PAY_DATE,PAY_AMT,LINE_NO,PAYEE FROM CL_LINE where CLAM_OID=:CLAM_OID ORDER BY LINE_NO ASC", nativeQuery = true)
    Collection<ClLine> get_CL_Line(Long CLAM_OID);

}

