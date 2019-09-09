package com.skylerwebdev.countries;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.*;

@RestController
@RequestMapping("/population")
public class PopulationController
{

    //localhost:8080/population/size/{people} pop => given number
    @GetMapping(value = "/size/{people}",
            produces = {"application/json"})
    public ResponseEntity<?> getPopEquals(@PathVariable int people)
    {
        ArrayList<Country> rtnCntry = CountriesApplication.myCountryList.
                findCountries(c -> c.getPopulation() >= people );
        return new ResponseEntity<>(rtnCntry, HttpStatus.OK);
    }

    //localhost:8080/population/min
    @GetMapping(value = "/size/min",
            produces = {"application/json"})
    public ResponseEntity<?> getMinPop()
    {
            ArrayList<Country> rntCntry = new ArrayList<>(CountriesApplication.myCountryList.countryList);
            rntCntry.sort((c1, c2) -> (int)(c1.getPopulation() - c2.getPopulation()));
            return new ResponseEntity<>(rntCntry.get(0), HttpStatus.OK);
    }

    //localhost:8080/population/max
    @GetMapping(value = "/size/max",
            produces = {"application/json"})
    public ResponseEntity<?> getMaxPop()
    {
        ArrayList<Country> rntCntry = new ArrayList<>(CountriesApplication.myCountryList.countryList);
                rntCntry.sort((c1, c2) -> (int)(c2.getPopulation() - c1.getPopulation()));
                return new ResponseEntity<>(rntCntry.get(0), HttpStatus.OK);
    }
    //STRETCH localhost:8080/population/median
//    @GetMapping(value = "/size/median",
//            produces = {"application/json"})
}
