package com.demobank.cards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.demobank.cards.dto.CardsContactInfoDto;

@SpringBootApplication
@EnableConfigurationProperties(value = {CardsContactInfoDto.class})
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

}
