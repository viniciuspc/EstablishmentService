package com.ubiwhere.EstablishmentService.service;

import static org.mockito.Mockito.when;

import java.util.Collections;
import java.util.concurrent.ExecutionException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.ubiwhere.EstablishmentService.model.FHRS.Establishment;

/**
 * Unit test for EstablishmentReviewService
 * @author vinicius
 *
 */
@RunWith(SpringRunner.class)
public class EstablishmentReviewFHRSServiceTest {
	
	@TestConfiguration
	static class EstablishmentFHRSServiceTestContextConfiguration{
		@Bean
		public EstablishmentFHRSService establishmentReviewService(RestTemplate restTemplate) {
			return new EstablishmentFHRSService(restTemplate);
		}
	}
	
	@Autowired
	EstablishmentFHRSService service;
	
	@MockBean
	RestTemplate restTemplate;
	
	/**
	 * Verify if the service call the establishment-review-service with the right parameters.
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	@Test
	public void getEstablishmentReviewTest() throws InterruptedException, ExecutionException {
		long id = 1l;
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentLength(1461);
		headers.set("x-api-version", "2");
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<Establishment> requestEntity = new HttpEntity<Establishment>(new Establishment(), headers);
		
		Establishment establishment = new Establishment();
		establishment.setfHRSID(id);
		establishment.setBusinessName("Test");
		
		when(restTemplate.exchange(EstablishmentFHRSService.URL+id, 
				HttpMethod.GET, 
				requestEntity, 
				Establishment.class
				)).thenReturn(new ResponseEntity<Establishment>(establishment, HttpStatus.OK));
		
		
		
		Assert.assertEquals(establishment, service.getEstablishment(id).get());
		
	}
	
	/**
	 * Verify if the service return a empty object when the establishment-review-service api returns not found.
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	@Test
	public void getEstablishmentReviewNotFoundTest() throws InterruptedException, ExecutionException {
		long id = 1l;
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentLength(1461);
		headers.set("x-api-version", "2");
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		
		HttpHeaders headersA = new HttpHeaders();
		headersA.setContentLength(1461);
		headersA.set("x-api-version", "2");
		headersA.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headersA.setContentType(MediaType.APPLICATION_JSON);
		
		Assert.assertEquals(headers, headersA);
		
		HttpEntity<Establishment> requestEntity = new HttpEntity<Establishment>(new Establishment(), headers);
		
		Assert.assertEquals(requestEntity, new HttpEntity<Establishment>(new Establishment(), headers));
		
		when(restTemplate.exchange(EstablishmentFHRSService.URL+id, 
				HttpMethod.GET, 
				requestEntity, 
				Establishment.class
				)).thenThrow(new HttpClientErrorException(HttpStatus.NOT_FOUND));
		
		Assert.assertEquals(new Establishment(), service.getEstablishment(id).get());
		
	}
	
}
