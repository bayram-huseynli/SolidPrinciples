package com.example.solidprinciples.openclosedprinciple;

public interface AbstractValidator {
    boolean isValid(DriverLicenseDto dto);
}
