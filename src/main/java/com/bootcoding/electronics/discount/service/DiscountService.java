package com.bootcoding.electronics.discount.service;

import com.bootcoding.electronics.discount.model.Customer;
import com.bootcoding.electronics.discount.model.ProductDiscount;
import com.bootcoding.electronics.discount.utils.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DiscountService
{
    @Autowired
    CustomerService customerService;

    public List<ProductDiscount> getAllProductDiscount()
    {
        List<ProductDiscount> productDiscounts=new ArrayList<>();
        List<Customer>customers=customerService.getAllCustomer();
        for (int i=0; i<customers.size();i++)
        {
            Customer customer=customers.get(i);
            ProductDiscount productDiscount=calculateProductDiscount(customer);
            productDiscounts.add(productDiscount);
        }
        return productDiscounts;
    }

    private ProductDiscount calculateProductDiscount(Customer customer)
    {
        ProductDiscount productDiscount = new ProductDiscount();
        productDiscount.setName(NameGenerator.getName());
        productDiscount.setValidity(DiscountValidityGenerator.getValidity(RandomDateGenerator.getRandomDate()));
        productDiscount.setDiscount(DiscountCalculator.getDiscount(customer));
        productDiscount.setRemainingdays(RemainingDaysCalculator.getRemainingDays(productDiscount.getValidity()));
        return productDiscount;
    }
}
