package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.example.demo.REST.RatingRest;

@SpringBootApplication
@EnableJpaAuditing
public class MovieRatingApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(MovieRatingApplication.class, args);
		
		RatingRest rr=ctx.getBean(RatingRest.class);
	}

}
