package com.bootcoding.electronics.discount.utils;

import java.util.Random;

public class PriceGenerator
{
    private static int[] price = {40000,62000,92000,31000,203000,92000,104000};

    public static int getPrice()
    {
        Random random = new Random();
        int randomIndex = random.nextInt(price.length);
        return price[randomIndex];
    }

    public static void main(String[] args)
    {
        PriceGenerator.getPrice();
    }
}
