package com.ead.model;

import java.util.List;

public class CountryDetails {

    private Country country;
    private List<Area> areaList;

    public CountryDetails() {
    }

    public CountryDetails(Country country, List<Area> areaList) {
        this.country = country;
        this.areaList = areaList;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public List<Area> getAreaList() {
        return areaList;
    }

    public void setAreaList(List<Area> areaList) {
        this.areaList = areaList;
    }
}