package com.renato.spring_scheduler;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SendMessage {

	@Scheduled(fixedRate = 6000) // A cada 1 minuto
	public void sendRequestToSelf() {
	    RestTemplate restTemplate = new RestTemplate();
	    String url = "http://localhost:8080/api/test-endpoint"; // URL do endpoint da mesma API
	    ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
	    System.out.println("Response from request: " + response.getBody());
	}
}
