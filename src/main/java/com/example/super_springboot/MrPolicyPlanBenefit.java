package com.example.super_springboot;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "MR_POLICY_PLAN_BENEFIT")
public class MrPolicyPlanBenefit {
    @Id
    @Column(name = "POBE_OID", nullable = false)
    private Long id;

    @Column(name = "PLBE_OID", nullable = false)
    private Long PLBE_OID;

}