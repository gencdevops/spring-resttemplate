package com.example.postalcodeservice.geonamesdto;

import java.util.ArrayList;
import java.util.List;

public class PostalCodeInfo {
    private final List<PostalCode> postalCodes = new ArrayList<>();

    public List<PostalCode> getPostalCodes() {
        return postalCodes;
    }

}
