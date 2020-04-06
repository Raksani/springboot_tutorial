package com.example.demo;

import com.example.demo.Customers;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customers, Integer>{
    

}