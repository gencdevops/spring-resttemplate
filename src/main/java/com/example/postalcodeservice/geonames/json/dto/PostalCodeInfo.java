package com.example.postalcodeservice.geonames.json.dto;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class PostalCodeInfo {
    @JsonProperty("postalcodes")
    public final List<PostalCode> postalCodes = new ArrayList<>();

    public Status status;



}
