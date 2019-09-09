package com.skylerwebdev.countries;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/age")
public class AgeController
{
    //localhost:8080/age/age/{age} => than given age
    @GetMapping(value = "/age/{age}",
                produces = {"application/json"})
    public ResponseEntity<?> getPopEquals(@PathVariable int age)
    {
        ArrayList<Country> rtnCntry = CountriesApplication.myCountryList.
                findCountries(c -> c.getMedianAge() >= age );
        return new ResponseEntity<>(rtnCntry, HttpStatus.OK);
    }

    //localhost:8080/age/min smallest median age
    @GetMapping(value = "/min",
            produces = {"application/json"})
    public ResponseEntity<?> getMinAge()
    {
        ArrayList<Country> rntCntry = new ArrayList<>(CountriesApplication.myCountryList.countryList);
        rntCntry.sort((c1, c2) -> (int)(c1.getMedianAge() - c2.getMedianAge()));
        return new ResponseEntity<>(rntCntry.get(0), HttpStatus.OK);
    }

    //localhost:8080/age/max greatest median age
    @GetMapping(value = "/max",
            produces = {"application/json"})
    public ResponseEntity<?> getMaxAge()
    {
        ArrayList<Country> rntCntry = new ArrayList<>(CountriesApplication.myCountryList.countryList);
        rntCntry.sort((c1, c2) -> (int)(c2.getMedianAge() - c2.getMedianAge()));
        return new ResponseEntity<>(rntCntry.get(0), HttpStatus.OK);
    }
    //STRETCH localhost:8080/age/median  country with median age
//    @GetMapping(value = "/median",
//            produces = {"application/json"})
}
