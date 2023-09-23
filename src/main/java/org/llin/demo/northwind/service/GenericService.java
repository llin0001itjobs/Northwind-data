package org.llin.demo.northwind.service;

import org.llin.demo.northwind.entity._Entity;
import org.llin.demo.northwind.service.util.AssembleRestCallUtil;
import org.llin.demo.northwind.util.ClassUtil;
import org.llin.demo.northwind.util.CustomSSLContext;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.security.NoSuchAlgorithmException;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

@Component
abstract class GenericService<T extends _Entity> {

	private String hostName;

	String getEntity(String entityClass) {
		
		CustomSSLContext CustomSSLContext = new CustomSSLContext();
		ResponseEntity<String> response = null;
		try {
		// Create a CloseableHttpClient with custom SSL context
		CloseableHttpClient httpClient;
		
			httpClient = HttpClients.custom().setSSLContext(CustomSSLContext.getSSLContext()).build();
			// Create an HttpComponentsClientHttpRequestFactory with the custom HttpClient
			HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory(httpClient);

			// Create a RestTemplate with the custom request factory
			RestTemplate restTemplate = new RestTemplate(factory);

			hostName = "localhost:8443";
			AssembleRestCallUtil util = new AssembleRestCallUtil();

			// Consume the API endpoint
			response = restTemplate.exchange(util.assembleApiUrl(hostName, entityClass),
					HttpMethod.GET, null, ClassUtil.getClassWithType(String.class));			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		System.out.println(response);
		return response.getBody();
	}

}
