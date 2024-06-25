package com.javatechsolutions.vt.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class PaymentController {
	
	@GetMapping("/getPayment")
	public String getPaymentDetails() throws InterruptedException {
		Thread.sleep(2000);
		log.info("Sleep for {} seconds ", 2000);
		return "Success";
	}

}
