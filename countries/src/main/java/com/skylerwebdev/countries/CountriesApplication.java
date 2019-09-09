package com.skylerwebdev.countries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class CountriesApplication
{
    public static CountryList myCountryList;
    public static void main(String[] args)
    {
        myCountryList = new CountryList();
        SpringApplication.run(CountriesApplication.class, args);
    }

}
