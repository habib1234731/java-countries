package com.lambdaschool.countries;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/population")
public class PopulationController {
    @RequestMapping("/size")
    public ArrayList<Country> getWithPopulation (@RequestParam(value = "people") long population) {
        return CountriesApplication.countryList.findCountries(e -> e.getPopulation() >= population);
    }
}
