package com.example.postalcodeservice.data.repository;

import com.example.postalcodeservice.data.entity.PostalCodeInfo;
import org.springframework.data.repository.CrudRepository;

public interface IPostalCodeInfoRepository extends CrudRepository<PostalCodeInfo, Long> {



}
