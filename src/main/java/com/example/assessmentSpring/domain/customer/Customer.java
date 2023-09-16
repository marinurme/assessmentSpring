package com.example.assessmentSpring.domain.customer;

import com.example.assessmentSpring.domain.order.Order;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customers_id_gen")
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "registration_code", nullable = false)
    private Integer registrationCode;

    @Size(max = 255)
    @NotNull
    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Size(max = 255)
    @NotNull
    @Column(name = "email", nullable = false)
    private String email;

    @Size(max = 255)
    @NotNull
    @Column(name = "telephone", nullable = false)
    private String telephone;

    @OneToMany(mappedBy = "customer")
    private Set<Order> orders = new LinkedHashSet<>();

}