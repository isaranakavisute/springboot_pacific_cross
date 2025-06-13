package com.example.super_springboot;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "MR_POLICYHOLDER")
public class MrPolicyholder {
    @Id
    @Column(name = "POHO_OID", nullable = false)
    private Long poho_oid;

    @Column(name = "POHO_NAME_1", nullable = false)
    private String poho_name_1;

    @Column(name = "POHO_NAME_2", nullable = false)
    private String poho_name_2;

    @Column(name = "CUSTOMER_BRANCH")
    private String customer_branch;

    @Column(name = "SCMA_OID_POHO_TYPE")
    private String SCMA_OID_POHO_TYPE;




}