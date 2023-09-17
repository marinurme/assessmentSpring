package com.example.assessmentSpring.business.order;

import com.example.assessmentSpring.domain.order.Order;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface OrderMapper {
    @Mapping(source = "id", target = "orderId")
    @Mapping(source = "customer.id", target = "customerId")
    @Mapping(source = "dos", target = "dateOfSubmission")
    OrderDto toOrderDto(Order order);

    List<OrderDto>toOrderDtos(List<Order> orders);

}