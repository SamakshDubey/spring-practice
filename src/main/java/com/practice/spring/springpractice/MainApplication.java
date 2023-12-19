package com.practice.spring.springpractice;

import org.example.retrofit.Retrofit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Retrofit("com.practice.spring.springpractice.retrofit")
@EnableJpaRepositories
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

}
