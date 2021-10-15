package com.example.postalcodeservice.runner;

import com.example.postalcodeservice.geonamesdto.PostalCodeInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class GeonamesRestRunner implements ApplicationRunner {
   private final RestTemplate restTemplate;

   @Value("${geonames.uri}")
   private String uri;

    public GeonamesRestRunner(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String uriStr = String.format(uri, 34387);
        restTemplate.getForObject(uriStr, PostalCodeInfo.class).getPostalCodes()
                .forEach(System.out::println);
    }
}
