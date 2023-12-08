package com.unilins.avaliacaoP2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unilins.avaliacaoP2.entities.OrderItem;
import com.unilins.avaliacaoP2.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
