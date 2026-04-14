package com.pedrodev.paytool.repositories;


import com.pedrodev.paytool.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order, Long>{

}
