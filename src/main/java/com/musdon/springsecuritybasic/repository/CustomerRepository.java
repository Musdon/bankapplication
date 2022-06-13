package com.musdon.springsecuritybasic.repository;

import com.musdon.springsecuritybasic.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByEmail(String email);
}
