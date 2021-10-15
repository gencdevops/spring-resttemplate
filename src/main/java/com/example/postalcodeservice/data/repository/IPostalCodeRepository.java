package com.example.postalcodeservice.data.repository;


import com.example.postalcodeservice.data.entity.PostalCodes;
import org.springframework.data.repository.CrudRepository;

public interface IPostalCodeRepository extends CrudRepository<PostalCodes, Integer> {
}
