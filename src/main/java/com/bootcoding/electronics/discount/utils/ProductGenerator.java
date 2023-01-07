package com.bootcoding.electronics.discount.utils;

import java.util.Random;

public class ProductGenerator
{
    private static String[] product = {"Laptop", "Mobile","Tablet","Computers","Printers","Scanner"};

    public static String getProduct()
    {
        Random random = new Random();
        int randomIndex = random.nextInt(product.length);
        return product[randomIndex];
    }

    public static void main(String[] args)
    {
        ProductGenerator.getProduct();
    }
}
