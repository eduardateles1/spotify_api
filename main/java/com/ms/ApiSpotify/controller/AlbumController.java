package com.ms.ApiSpotify.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.ApiSpotify.client.Album;
import com.ms.ApiSpotify.client.AlbumSpotifyClient;
import com.ms.ApiSpotify.client.AuthSpotifyClient;
import com.ms.ApiSpotify.client.GoogleClient;
import com.ms.ApiSpotify.client.LoginRequest;

@RestController
@RequestMapping("/spotify/api")
public class AlbumController {

	private final AuthSpotifyClient authSpotifyClient;
	private final AlbumSpotifyClient albumSpotifyClient;

	public AlbumController(AuthSpotifyClient authSpotifyClient, 
			AlbumSpotifyClient albumSpotifyClient) {
		this.authSpotifyClient = authSpotifyClient;
		this.albumSpotifyClient = albumSpotifyClient;

	}

	@GetMapping("/albums")
	public ResponseEntity<List<Album>> helloWorld(){
		var request = new LoginRequest(
				"client_credentials",
				"5a3ffa5a6ee24a689ecf382e5e6433ac",
				"21172885a8bd4b21b6b10225b60691b2"
	);
	var token = authSpotifyClient.login(request).getAccessToken();
	
	var response = albumSpotifyClient.getRelease("Bearer " + token);
	
		return ResponseEntity.ok(response.getAlbums().getItems());
	}
}
