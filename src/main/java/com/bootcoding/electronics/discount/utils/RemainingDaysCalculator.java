package com.bootcoding.electronics.discount.utils;

import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class RemainingDaysCalculator
{
    public static long getRemainingDays(Date validity)
    {
        LocalDate currentDate = LocalDate.now();

       // Date validity = DiscountValidityGenerator.getValidity(RandomDateGenerator.getRandomDate());
        LocalDate validitydate = validity.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        Duration diff = Duration.between(currentDate.atStartOfDay(), validitydate.atStartOfDay());
        long diffDays = diff.toDays();

        return diffDays;
    }
}
