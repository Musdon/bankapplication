package com.musdon.springsecuritybasic.config;

import com.musdon.springsecuritybasic.model.Customer;
import com.musdon.springsecuritybasic.model.CustomerSecurity;
import com.musdon.springsecuritybasic.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusdonBankUserDetails implements UserDetailsService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<Customer> customer = customerRepository.findByEmail(username);
        if (customer.size()==0){
            throw new UsernameNotFoundException("User details not found for user with email: " + username);
        }
        return new CustomerSecurity(customer.get(0));
    }
}
