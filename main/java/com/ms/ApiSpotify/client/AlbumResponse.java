package com.ms.ApiSpotify.client;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AlbumResponse {
	
	private AlbumWrapper albums;
	
	
	
	public AlbumResponse() {
	}

	//CONTRUCTOR
	public AlbumResponse(AlbumWrapper albums) {
		super();
		this.albums = albums;
	}

	//GETTERS E SETTERS
	public AlbumWrapper getAlbums() {
		return albums;
	}

	public void setAlbums(AlbumWrapper albums) {
		this.albums = albums;
	}
	
	
}
