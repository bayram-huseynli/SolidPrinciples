package com.example.solidprinciples.openclosedprinciple;

import org.springframework.stereotype.Component;

@Component
public class CategoryValidator implements DriverLicenseValidator{

    @Override
    public boolean isValid(DriverLicenseDto dto) {
        if(dto.getCategory().equals("B")){
            return false;
        }
        return true;
    }
}
