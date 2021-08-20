package com.currencyconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudCurrencyConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudCurrencyConversionApplication.class, args);
	}

}
