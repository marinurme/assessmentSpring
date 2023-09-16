package com.example.assessmentSpring.business.product;

import com.example.assessmentSpring.domain.product.Product;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link Product}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto implements Serializable {
    @Size(max = 255)
    private String name;
    private String skuCode;
    private Integer unitPrice;
}