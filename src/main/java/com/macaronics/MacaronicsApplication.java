package com.macaronics;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.modelmapper.config.Configuration;
@SpringBootApplication
public class MacaronicsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MacaronicsApplication.class, args);
	}

	
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper=new ModelMapper();

		//setter 아닌  필드로 주입
		modelMapper.getConfiguration()
				.setFieldAccessLevel(Configuration.AccessLevel.PRIVATE)
				.setFieldMatchingEnabled(true)
				.setSkipNullEnabled(true);
		return modelMapper;
	}
}
