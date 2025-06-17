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
@Table(name = "PD_PLAN_BENEFIT")
public class PdPlanBenefit {
    @Id
    @Column(name = "PLBE_OID", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "PLLI_OID", nullable = false)
    private Long plliOid;

    @NotNull
    @Column(name = "BEHD_OID", nullable = false)
    private Long behdOid;

}