package org.redlion.jacoss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class JacossApplication {

	public static void main(String[] args) {
		SpringApplication.run(JacossApplication.class, args);
	}
}
