package com.ead.controller;

import com.ead.model.AreaList;
import com.ead.model.Country;
import com.ead.model.CountryDetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryServiceController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private static List<Country> countryList;

    static {
        countryList = new ArrayList<>();

        countryList.add(new Country("LK", "Sri Lanka", 21, "Colombo"));
        countryList.add(new Country("FI", "Finland", 5.5, "Helsinki"));
        countryList.add(new Country("SE", "Sweden", 9.9, "Stockholm"));
    }

    @GetMapping("/welcome2")
    public String getWelcomeMessage() {
        return "Welcome to springboot2...";
    }

    @GetMapping("/all")
    public List<Country> getAllCountries() {
        return countryList;
    }

    @GetMapping("/{countryId}")
    public CountryDetails getCountry(@PathVariable("countryId") String countryId) {

        Country cnt = null;

        for (Country country : countryList) {
            if (country.getCountryId().equals(countryId)) {
                cnt = country;
                break;
            }
        }

        String url = "http://CLIENT-APP-ONE/areas/";

        AreaList areaList = restTemplate.getForObject(url + countryId, AreaList.class);

        CountryDetails countryDetails = new CountryDetails(cnt, areaList.getAreas());

        return countryDetails;
    }
}