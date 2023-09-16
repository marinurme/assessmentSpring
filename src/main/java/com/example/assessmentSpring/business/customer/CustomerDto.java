package com.example.assessmentSpring.business.customer;

import com.example.assessmentSpring.domain.customer.Customer;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link Customer}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto implements Serializable {
    @NotNull
    @Size(max = 255)
    private String fullName;
    @NotNull
    @Size(max = 255)
    private String email;
    @NotNull
    @Size(max = 255)
    private String telephone;
}