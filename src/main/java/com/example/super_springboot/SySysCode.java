package com.example.super_springboot;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "SY_SYS_CODE")
public class SySysCode {
    @Id
    @Column(name = "SCMA_OID", nullable = false, length = 20)
    private String scmaOid;

    @Column(name = "SYS_TYPE", nullable = false, length = 20)
    private String sysType;

    @Column(name = "SYS_CODE", nullable = false, length = 20)
    private String sysCode;

    @Column(name = "SEQ")
    private Short seq;

    @Column(name = "FLAG", length = 10)
    private String flag;

    @Column(name = "CRT_USER", length = 10)
    private String crtUser;

    @Column(name = "CRT_DATE")
    private LocalDate crtDate;

    @Column(name = "UPD_USER", length = 10)
    private String updUser;

    @Column(name = "UPD_DATE")
    private LocalDate updDate;

}