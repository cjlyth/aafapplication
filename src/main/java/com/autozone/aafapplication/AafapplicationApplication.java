package com.autozone.aafapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.session.data.mongo.config.annotation.web.http.EnableMongoHttpSession;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableMongoHttpSession
public class AafapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AafapplicationApplication.class, args);
	}
}
