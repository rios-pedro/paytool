package com.pedrodev.paytool.repositories;

import com.pedrodev.paytool.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{

}
