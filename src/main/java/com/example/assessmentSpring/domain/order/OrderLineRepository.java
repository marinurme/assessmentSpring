package com.example.assessmentSpring.domain.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface OrderLineRepository extends JpaRepository<OrderLine, Integer> {
    @Query("select o from OrderLine o where o.product.id = ?1")
    List<OrderLine> findOrdersBy(Integer productId);

    @Query("select o from OrderLine o where o.order.customer.id = ?1")
    List<OrderLine> findCustomerOrders(Integer customerId);

    @Transactional
    @Modifying
    @Query("update OrderLine o set o.quantity = ?1 where o.id = ?2")
    void updateQuantityById(Integer quantity, Integer id);

}