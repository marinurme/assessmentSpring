package com.example.assessmentSpring.domain.product;

import com.example.assessmentSpring.business.product.ProductDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductMapper {

    ProductDto toCustomerDto(ProductDto product);
}