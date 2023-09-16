package com.example.assessmentSpring.domain.order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderlineRepository extends JpaRepository<Orderline, Integer> {
}