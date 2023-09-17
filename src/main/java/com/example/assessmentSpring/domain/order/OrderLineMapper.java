package com.example.assessmentSpring.domain.order;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface OrderLineMapper {

    @Mapping(source = "product.id", target = "productId")
    @Mapping(source = "order.id", target = "orderId")
    @Mapping(source = "order.customer.id", target = "customerId")
    @Mapping(source = "order.dos", target = "dos")
    OrderLineDto toOrderLineDto(OrderLine orderLine);

    List<OrderLineDto> toOrderLineDtos(List<OrderLine> orderLines);
}