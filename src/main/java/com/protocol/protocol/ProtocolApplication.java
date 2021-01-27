package com.protocol.protocol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "com.protocol.protocol.model")
@ComponentScan(basePackages = {"com.protocol.protocol.*"})
public class ProtocolApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProtocolApplication.class, args);
	}

}
