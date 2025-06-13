package com.example.super_springboot;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Getter
@Setter
@Entity
@Table(name = "MR_POLICY_PLAN")
public class MrPolicyPlan {
    @Id
    @Column(name = "POPL_OID", nullable = false)
    private Long poplOid;

    @NotNull
    @Column(name = "POCY_OID", nullable = false)
    private Long pocyOid;

    @NotNull
    @Column(name = "PLAN_OID", nullable = false)
    private Long planOid;

}