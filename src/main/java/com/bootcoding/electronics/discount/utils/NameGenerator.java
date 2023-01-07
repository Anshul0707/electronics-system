package com.bootcoding.electronics.discount.utils;

import java.util.Random;

public class NameGenerator
{
    private static String[] names = {"Anshul", "Nikhil", "Mohit", "Minal",
                    "Mahesh", "Milind", "Suvidhnya", "Harshal",
                    "Ritik", "Mayuri", "Rohini",
                    "Priyal", "Nikita", "Akshay", "Deepak", "Amol"};

    public static String getName()
    {
        Random random = new Random();
        int randomIndex = random.nextInt(names.length);
        return names[randomIndex];
    }

    public static void main(String[] args)
    {
        NameGenerator.getName();
    }
}
