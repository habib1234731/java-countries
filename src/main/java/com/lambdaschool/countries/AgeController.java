package com.lambdaschool.countries;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/age")
public class AgeController {
    @RequestMapping("/age")
    public ArrayList<Country> getWithAge (@RequestParam(value = "age") long age) {
        return CountriesApplication.countryList.findCountries(e -> e.getMedianAge() >= age);
    }

    @RequestMapping("/min")
    public Country getMinAge () {
        return CountriesApplication.countryList.minAge();
    }

    @RequestMapping("/max")
    public Country getMaxAge () {
        return CountriesApplication.countryList.maxAge();
    }
}
