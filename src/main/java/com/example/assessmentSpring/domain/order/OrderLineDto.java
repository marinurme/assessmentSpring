package com.example.assessmentSpring.domain.order;

import com.example.assessmentSpring.domain.customer.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link OrderLine}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineDto implements Serializable {
    private Integer orderId;
    private Integer customerId;
    private String dos;
    private Integer quantity;
    private Integer productId;


}