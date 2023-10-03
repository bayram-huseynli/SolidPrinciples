package com.example.solidprinciples.openclosedprinciple;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BlackListValidator implements AbstractValidator{
    private List blacklist=List.of(1861070L,1861080L,198233L);

    @Override
    public boolean isValid(DriverLicenseDto dto) {
        boolean contains=blacklist.contains(dto.getId());
        if (contains)
            return false;
        return true;
    }
}
