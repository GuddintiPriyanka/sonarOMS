package com.team4.ordermanagement.order.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.team4.ordermanagement.order.entity.OrderDetails;


@Repository
public interface OrderRepository extends JpaRepository<OrderDetails, Integer>{

	
}

