package com.example.assessmentSpring.domain.product;

import com.example.assessmentSpring.domain.order.Orderline;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "orderline_id", nullable = false)
    private Orderline orderline;

    @Size(max = 255)
    @NotNull
    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @Column(name = "sku_code", nullable = false)
    private Integer skuCode;

    @NotNull
    @Column(name = "unit_price", nullable = false)
    private Integer unitPrice;

}