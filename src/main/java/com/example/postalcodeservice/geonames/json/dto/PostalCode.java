package com.example.postalcodeservice.geonames.json.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostalCode {
    public String adminName1;
    public String adminCode1;
    public String placeName;
    //@JsonProperty("lat")
    public double lat;
    //@JsonProperty("lnge")
    public double lng;


    @Override
    public String toString() {
        return String.format("%s, %s, %s, %f, %f", adminCode1, adminName1, placeName, lat, lng);
    }
}
