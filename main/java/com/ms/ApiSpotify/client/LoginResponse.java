package com.ms.ApiSpotify.client;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class LoginResponse {
	
	private String accessToken;
	
	
	
	public LoginResponse() {
	}

	//CONSTRUCTOR
	public LoginResponse(String accessToken) {
		this.accessToken = accessToken;
	}
	
	//GETTERS AND SETTERS
	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	
	
}
