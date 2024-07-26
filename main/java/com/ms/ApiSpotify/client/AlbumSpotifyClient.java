package com.ms.ApiSpotify.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(
		
	name = "AlbumSpotifyClient",
	url = "https://api.spotify.com"
)
public interface AlbumSpotifyClient {
	
	@GetMapping(value="v1/browse/new-releases")
	AlbumResponse getRelease(@RequestHeader("Authorization")String authorization);
}