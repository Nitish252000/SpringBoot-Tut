package com.coding.nitish.internalWorkingOfSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternalWorkingOfSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InternalWorkingOfSpringBootApplication.class, args);
	}

	//	private RazorpayPaymentService paymentService = new RazorpayPaymentService();

	// Field Injection: Use Autowired Annotation
	@Autowired
	private RazorpayPaymentService paymentService;

	// Create a dependency to use bean : Create a constructor; to inject dependency that is called Constructor dependency injector;
	//	public InternalWorkingOfSpringBootApplication(RazorpayPaymentService paymentService) {
	//		this.paymentService = paymentService;
	//	}

	@Override
	public void run(String... args) throws Exception{
		String payment = paymentService.pay();
		System.out.println("Payment done: "+payment);
	}
}
