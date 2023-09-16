package com.example.assessmentSpring.domain.customer;

import com.example.assessmentSpring.business.customer.CustomerDto;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface CustomerMapper {

    CustomerDto toCustomerDto(CustomerDto customer);

}