package com.example.solidprinciples.Liskov;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.bridge.MessageUtil;
@Slf4j
public class PaymentService {
    public void makePayment(CreditCarDto creditCarDto,Double amount){
     changeCard(creditCarDto,amount);
     printReceipt(creditCarDto,amount);
    }

    private void changeCard(CreditCarDto creditCarDto,Double amount){
        log.info("Changed customer");
    }

    private void printReceipt(CreditCarDto creditCarDto,Double amount){
        log.info("Print receipt ... ");
    }
}
