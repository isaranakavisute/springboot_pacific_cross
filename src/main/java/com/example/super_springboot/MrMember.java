package com.example.super_springboot;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "MR_MEMBER")
public class MrMember {
    @Id
    @Column(name = "MEMB_OID", nullable = false)
    private Long memb_oid;

    @Column(name = "POHO_OID")
    private Long pohoOid;

    @Column(name = "MBR_NO", nullable = false, length = 9)
    private String mbrNo;

    @Column(name = "MBR_LAST_NAME")
    private String mbr_last_name;

    @Column(name = "MBR_FIRST_NAME")
    private String mbr_first_name;

    @Column(name = "DOB")
    private String DOB;

    @Column(name = "CL_PAY_ACCT_NO")
    private String CL_PAY_ACCT_NO;

    @Column(name = "EFF_DATE")
    private String EFF_DATE;

    @Column(name = "SCMA_OID_MBR_TYPE")
    private String SCMA_OID_MBR_TYPE;

    @Column(name = "SCMA_OID_CIVIL_STATUS")
    private String SCMA_OID_CIVIL_STATUS;

    @Column(name = "SCMA_OID_SEX")
    private String SCMA_OID_SEX;

    @Column(name = "ID_CARD_NO")
    private String ID_CARD_NO;

    @Column(name = "CUSM_REF_NO")
    private String CUSM_REF_NO;





}