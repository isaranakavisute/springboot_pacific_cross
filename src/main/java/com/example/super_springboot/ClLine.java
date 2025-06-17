package com.example.super_springboot;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "CL_LINE")
public class ClLine {
    @Id
    @Column(name = "CLLI_OID", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "CLAM_OID", nullable = false)
    private Long clamOid;

    @Column(name = "INCUR_DATE_FROM")
    private LocalDate incurDateFrom;

    @Column(name = "INCUR_DATE_TO")
    private LocalDate incurDateTo;

    @NotNull
    @Column(name = "SCMA_OID_CL_TYPE", nullable = false)
    private String scmaOidClType;

    @Column(name = "SCMA_OID_BED_TYPE")
    private String scmaOidBedType;

    @Column(name = "PRES_AMT", precision = 15, scale = 4)
    private BigDecimal presAmt;

    @Column(name = "APP_AMT", precision = 15, scale = 4)
    private BigDecimal appAmt;

    @Column(name = "PRIOR_PAID", precision = 15, scale = 4)
    private BigDecimal priorPaid;

    @Column(name = "SCMA_OID_CL_LINE_STATUS")
    private String scmaOidClLineStatus;

    @Column(name = "PAY_DATE")
    private LocalDate payDate;

    @Column(name = "PAY_AMT", precision = 15, scale = 4)
    private BigDecimal payAmt;

    @Column(name = "LINE_NO")
    private int lineNo;

    @Column(name = "PAYEE")
    private String payee;

}