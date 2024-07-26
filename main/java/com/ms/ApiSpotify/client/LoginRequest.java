package com.ms.ApiSpotify.client;

import feign.form.FormProperty;

public final class LoginRequest {
	
	@FormProperty("grant_type")
	private String grantType;
	
	@FormProperty("client_id")
	private String clientId;
	
	@FormProperty("client_secret")
	private String clientSecret;
	
	
	public LoginRequest() {
	}

	//CONSTRUCTOR
	public LoginRequest(String grantType, String clientId, String clientSecret) {
		super();
		this.grantType = grantType;
		this.clientId = clientId;
		this.clientSecret = clientSecret;
	}
	
	//GETTERS E SETTERS
	public String getGrantType() {
		return grantType;
	}
	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getClientSecret() {
		return clientSecret;
	}
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}
	
	
}
