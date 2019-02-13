package com.lambdaschool.countries;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/names")
public class NameController {
    @RequestMapping("/all")
    public ArrayList<Country> getAllCountries() {
        CountriesApplication.countryList.countryList.sort((e1, e2) ->
                e1.getName().compareToIgnoreCase(e2.getName()));
        return CountriesApplication.countryList.countryList;
    }

    @RequestMapping("/begin")
    public ArrayList<Country> getWithLetter(@RequestParam(value = "letter") char ch) {
        ArrayList<Country> temp = CountriesApplication.countryList.findCountries(e -> e.getName().toLowerCase().startsWith(Character.toString(ch)));
        System.out.println(temp);
        temp.sort((e1, e2) ->
                e1.getName().compareToIgnoreCase(e2.getName()));
//        System.out.println(CountriesApplication.countryList);
//        CountriesApplication.countryList.sort((e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName()));
//        CountriesApplication.countryList.countryList.sort((e1, e2) ->
//             e1.getName().compareToIgnoreCase(e2.getName()));
        return temp;
    }

    @RequestMapping("/size")
    public ArrayList<Country> getWithSize(@RequestParam(value = "length") long length) {
        ArrayList<Country> temp = CountriesApplication.countryList.findCountries(e -> e.getName().length() >= length);
        temp.sort((e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName()));
        return temp;
    }
}