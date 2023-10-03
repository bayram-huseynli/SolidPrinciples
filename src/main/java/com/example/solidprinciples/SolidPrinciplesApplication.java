package com.example.solidprinciples;

import ch.qos.logback.core.joran.action.PreconditionValidator;
import com.example.solidprinciples.openclosedprinciple.DriverLicenseDto;
import com.example.solidprinciples.openclosedprinciple.DriverLicenseValidator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
@Slf4j
@RequiredArgsConstructor
public class SolidPrinciplesApplication implements CommandLineRunner {
    private final DriverLicenseValidator driverLicenseValidator;

    public static void main(String[] args) {
        SpringApplication.run(SolidPrinciplesApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        log.info("Started");
        DriverLicenseDto dto=new DriverLicenseDto();
        dto.setId(1861080L);
        dto.setExpiredDate(new Date());
        dto.setCountry("Russia");
        dto.setCategory("B");
        System.out.println(driverLicenseValidator.isValid(dto));

        DriverLicenseDto dto1=new DriverLicenseDto();
        dto1.setId(1861070L);
        dto.setExpiredDate(new Date());
        dto.setCountry("Azerbaijan");
        dto.setCategory("C");
        System.out.println(driverLicenseValidator.isValid(dto));
    }
}
