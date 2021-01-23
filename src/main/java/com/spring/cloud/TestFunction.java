package com.spring.cloud;

import java.util.function.Function;

import org.springframework.stereotype.Component;

@Component
public class TestFunction implements Function<String, String> {

	@Override
	public String apply(String input) {
		return "Function is applied on "+input;
	}

}
