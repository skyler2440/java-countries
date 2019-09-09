package com.skylerwebdev.countries;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/names")
public class NamesController
{
    //localhost:8080/names/all
    @GetMapping(value = "/all",
                produces = {"application/json"})
    public ResponseEntity<?> getAllCountries()
    {
        return new ResponseEntity<>(CountriesApplication.myCountryList.countryList, HttpStatus.OK);
    }

    //localhost:8080/names/start/{letter}
    @GetMapping(value = "/start/{letter}",
            produces = {"application/json"})
    public ResponseEntity<?> getCountriesByLetter(@PathVariable char letter)
    {
        ArrayList<Country> rtnCntry = CountriesApplication.myCountryList.
                findCountries(c -> c.getCountryName().toUpperCase().charAt(0) == Character.toUpperCase(letter));
        rtnCntry.sort((c1, c2) -> c1.getCountryName().compareToIgnoreCase(c2.getCountryName()));
        return new ResponseEntity<>(rtnCntry, HttpStatus.OK);
    }


    //localhost:8080/names/size/{number}
    @GetMapping(value = "/size/{number}",
            produces = {"application/json"})
    public ResponseEntity<?> getPopEquals(@PathVariable int number)
    {
        ArrayList<Country> rtnCntry = (CountriesApplication.myCountryList.
                findCountries(c -> c.getCountryName().length() >= number ));
        ArrayList<Country> sortArrayList = new ArrayList<>(rtnCntry);
       sortArrayList.sort((c1, c2) -> c1.getCountryName().compareToIgnoreCase(c2.getCountryName()));

        return new ResponseEntity<>(sortArrayList, HttpStatus.OK);
    }
}
