package com.skylerwebdev.countries;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/age")
public class AgeController
{
    //localhost:8080/age/age/{age} => than given age
//    @GetMapping(value = "/age/{age}",
//                produces = {"application/json"})

    //localhost:8080/age/min smallest median age
//    @GetMapping(value = "/min",
//            produces = {"application/json"})

    //localhost:8080/age/max greatest median age
//    @GetMapping(value = "/max",
//            produces = {"application/json"})

    //STRETCH localhost:8080/age/median  country with median age
//    @GetMapping(value = "/median",
//            produces = {"application/json"})
}
