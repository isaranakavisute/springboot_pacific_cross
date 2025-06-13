package com.example.super_springboot;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.annotations.Immutable;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "MR_POLICY")
public class MrPolicy  {
    @Id
    @Column(name = "POCY_OID", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "POHO_OID", nullable = false)
    private Long pohoOid;

    @Size(max = 14)
    @NotNull
    @Column(name = "POCY_NO", nullable = false, length = 14)
    private String pocyNo;

    @Column(name = "LMG_NO", nullable = false, length = 14)
    private String LMG_NO;

}