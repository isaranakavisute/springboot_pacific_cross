package com.example.super_springboot;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "CL_CLAIM")
public class ClClaim {
    @Id
    @Column(name = "CLAM_OID", nullable = false)
    private Long id;

    @Size(max = 10)
    @NotNull
    @Column(name = "CL_NO", nullable = false, length = 10)
    private String clNo;

    @NotNull
    @Column(name = "SCMA_OID_CL_STATUS", nullable = false)
    private String scmaOidClStatus;

    @Size(max = 2000)
    @Column(name = "REMARK", length = 2000)
    private String remark;
}