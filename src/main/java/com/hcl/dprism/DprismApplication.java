package com.hcl.dprism;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
/**
 * Dprism Application
 * @author bikash.k
 *
 */
//@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@SpringBootApplication
@ComponentScan({"com.hcl.dprism.*"})
//@Component("com.hcl.dprism.*")
public class DprismApplication {
	
   	public static void main(String[] args) {
		SpringApplication.run(DprismApplication.class, args);
	}
}
