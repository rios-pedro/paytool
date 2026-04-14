package com.pedrodev.paytool.repositories;


import com.pedrodev.paytool.entities.Category;
import com.pedrodev.paytool.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository <Category, Long>{

}
