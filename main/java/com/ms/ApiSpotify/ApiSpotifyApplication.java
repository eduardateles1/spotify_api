package com.ms.ApiSpotify;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiSpotifyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiSpotifyApplication.class, args);
	}

}
