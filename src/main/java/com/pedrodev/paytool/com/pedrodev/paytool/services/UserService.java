package com.pedrodev.paytool.com.pedrodev.paytool.services;

import com.pedrodev.paytool.entities.User;
import com.pedrodev.paytool.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.get();
    }

    public User insert(User obj){
        repository.save(obj);
        return obj;
    }
}
