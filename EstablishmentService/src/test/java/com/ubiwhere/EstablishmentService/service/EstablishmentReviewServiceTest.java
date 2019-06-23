package com.ubiwhere.EstablishmentService.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.ubiwhere.EstablishmentService.model.EstablishmentReview;

import static org.mockito.Mockito.*;

import java.util.concurrent.ExecutionException;

/**
 * Unit test for EstablishmentReviewService
 * @author vinicius
 *
 */
@RunWith(SpringRunner.class)
public class EstablishmentReviewServiceTest {
	
	@TestConfiguration
	static class EstablishmentReviewServiceTestContextConfiguration{
		@Bean
		public EstablishmentReviewService establishmentReviewService(RestTemplate restTemplate) {
			return new EstablishmentReviewService(restTemplate);
		}
	}
	
	@Autowired
	EstablishmentReviewService service;
	
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
		EstablishmentReview establishmentReview = new EstablishmentReview(id, 10.5, 100);
		
		when(restTemplate.getForObject(EstablishmentReviewService.URL+id, EstablishmentReview.class)).thenReturn(establishmentReview);
		
		Assert.assertEquals(establishmentReview, service.getEstablishmentReview(id).get());
		
	}
	
	/**
	 * Verify if the service return a empty object when the establishment-review-service api returns not found.
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	@Test
	public void getEstablishmentReviewNotFoundTest() throws InterruptedException, ExecutionException {
		long id = 1l;
		
		when(restTemplate.getForObject(EstablishmentReviewService.URL+id, EstablishmentReview.class)).thenThrow(new HttpClientErrorException(HttpStatus.NOT_FOUND));
		
		Assert.assertEquals(new EstablishmentReview(), service.getEstablishmentReview(id).get());
		
	}
	
}
