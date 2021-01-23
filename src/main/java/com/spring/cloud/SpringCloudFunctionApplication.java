package com.spring.cloud;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringCloudFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFunctionApplication.class, args);
	}
	
	@Bean
	public Function<String, String> function(){
		return input->"Hello "+input;
	}
	
	@Bean
	public Consumer<String> consume(){
		return input->{
			System.out.println("Hello consumer "+input);
		};
	}
	
	@Bean
	public Supplier<String> supplier(){
		return ()->"Hello Supplier";
	}

}
