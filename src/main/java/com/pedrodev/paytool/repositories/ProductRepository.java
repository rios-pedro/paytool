package com.pedrodev.paytool.repositories;


import com.pedrodev.paytool.entities.Category;
import com.pedrodev.paytool.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface ProductRepository extends JpaRepository <Product, Long>{

}
