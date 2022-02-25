package com.educandoweb.workshop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.workshop.entities.Order;
import com.educandoweb.workshop.entities.User;


public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
