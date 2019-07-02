package com.supriya.cms.service;

import com.supriya.cms.dao.CustomerDAO;
import com.supriya.cms.exception.CustomerNotFoundException;
import com.supriya.cms.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

@Component
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;
    public Customer addCustomer(Customer customer){
        return customerDAO.save(customer);
    }
    public List<Customer> getCustomerList(){
        return customerDAO.findAll();
    }
    public Customer getCustomer(int customerId){
        Optional<Customer> optionalCustomer = customerDAO.findById(customerId);
        if(!optionalCustomer.isPresent())
            throw new CustomerNotFoundException("Customer Record is not available.");
        return optionalCustomer.get();
    }
    public Customer updateCustomer(int customerId,Customer customer){
        customer.setCustomerId(customerId);
        return customerDAO.save(customer);
    }
    public void deleteCustomer(int customerId){
        customerDAO.deleteById(customerId);
    }
}
