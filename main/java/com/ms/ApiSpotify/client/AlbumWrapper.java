package com.ms.ApiSpotify.client;

import java.util.List;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AlbumWrapper {
	
	private List<Album> items;
	
	//CONSTRUCTOR
	public AlbumWrapper(List<Album> items) {
		super();
		this.items = items;
	}

	public AlbumWrapper() {
	}
	
	//GETTERS E SETTERS
	public List<Album> getItems() {
		return items;
	}

	public void setItems(List<Album> items) {
		this.items = items;
	}
	
}
