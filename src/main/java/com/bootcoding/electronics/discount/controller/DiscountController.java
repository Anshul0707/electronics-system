package com.bootcoding.electronics.discount.controller;

import com.bootcoding.electronics.discount.model.ProductDiscount;
import com.bootcoding.electronics.discount.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiscountController
{
    @Autowired
    DiscountService discountService;

    @GetMapping("/customer/discount")
    public List<ProductDiscount> getAllCustomersDiscount()
    {
        return discountService.getAllProductDiscount();
    }
}
