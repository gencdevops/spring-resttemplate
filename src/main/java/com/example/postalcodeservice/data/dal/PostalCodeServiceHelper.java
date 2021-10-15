package com.example.postalcodeservice.data.dal;

import com.example.postalcodeservice.data.repository.IPostalCodeInfoRepository;
import com.example.postalcodeservice.data.repository.IPostalCodeRepository;
import org.springframework.stereotype.Component;

@Component
public class PostalCodeServiceHelper {
    private final IPostalCodeInfoRepository postalCodeInfoRepository;
    private final IPostalCodeRepository postalCodeRepository;

    public PostalCodeServiceHelper(IPostalCodeInfoRepository postalCodeInfoRepository,
                                   IPostalCodeRepository postalCodeRepository) {
        this.postalCodeInfoRepository = postalCodeInfoRepository;
        this.postalCodeRepository = postalCodeRepository;
    }

    public boolean existPostalCodeById(int id) {

    }
}
