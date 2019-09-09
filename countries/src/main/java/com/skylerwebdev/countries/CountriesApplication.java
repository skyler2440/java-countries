package com.skylerwebdev.countries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class CountriesApplication
{
    public static void main(String[] args)
    {
        CountryList myCountryList = new CountryList();
        SpringApplication.run(CountriesApplication.class, args);
    }

}
