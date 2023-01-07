package com.bootcoding.electronics.discount.service;

import com.bootcoding.electronics.discount.model.Customer;
import com.bootcoding.electronics.discount.utils.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService
{
    private static final int MAX_LIMIT=13;

    public List<Customer> getAllCustomer() {
        List<Customer> customers=new ArrayList<>();
        for (int i=0; i<MAX_LIMIT;i++)
        {
            Customer customer=buildRandomCostomer();
            customers.add(customer);
        }
        return customers;
    }

    private Customer buildRandomCostomer()
    {
        Customer customer = new Customer();
        customer.setName(NameGenerator.getName());
        customer.setProduct(ProductGenerator.getProduct());
        customer.setPrice(PriceGenerator.getPrice());
        customer.setPhone(PhoneNumberGenerator.getPhoneNumber());
        customer.setOrderCount(OrderCountGenerator.getOrderCount());
        customer.setVisitCount(VisitCountGenerator.getVisitCount());
        return customer;
    }
}
