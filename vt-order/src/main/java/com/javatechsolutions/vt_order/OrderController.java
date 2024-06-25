package com.javatechsolutions.vt_order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class OrderController {
	
	private final static Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	private final RestClient restClient;
	
	public OrderController(RestClient.Builder builder) {
		this.restClient = builder.baseUrl("http://localhost:8081").build();
	}
	
	@GetMapping("/getPaymentDetails")
	public String getOrderDetails() {
		String result = restClient.get().uri("/getPayment")
		.retrieve()
		.toEntity(String.class)
		.getBody();
		
		logger.info("{} on {}", result, Thread.currentThread());
		return result;
	}

}
