package com.example.solidprinciples.openclosedprinciple;

import org.springframework.stereotype.Component;

@Component
public class CountryValidator implements DriverLicenseValidator {


    @Override
    public boolean isValid(DriverLicenseDto dto) {
       if(dto.getCountry().equals("Russia")){
           return false;
       }
       return true;

    }
}
