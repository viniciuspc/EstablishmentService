package com.ubiwhere.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.ubiwhere.exception.ResourceNotFoundException;
import com.ubiwhere.model.EstablishmentReviewEntity;
import com.ubiwhere.repository.EstablishmentReviewRepository;

/**
 * Unit test for the class EstablishmentReviewService
 * @author vinicius
 *
 */
@RunWith(SpringRunner.class)
public class EstablishmentReviewServiceTest {
	
	@TestConfiguration
	static class EstablishmentReviewServiceTestContextConfiguration{
		
		@Bean
		public EstablishmentReviewService establishmentReviewService() {
			return new EstablishmentReviewService();
		}
	}
	
	@Autowired
	private EstablishmentReviewService establishmentReviewService;
	
	@MockBean
	private EstablishmentReviewRepository establishmentReviewRepository;
	
	//Classes for mock
	EstablishmentReviewEntity establishmentReview1 = new EstablishmentReviewEntity(1, 10.5, 100);
	EstablishmentReviewEntity establishmentReview2 = new EstablishmentReviewEntity(2, 20.5, 200);
	EstablishmentReviewEntity establishmentReview3 = new EstablishmentReviewEntity(3, 30.5, 300);
	
	List<EstablishmentReviewEntity> allEstablishmentReviews = Arrays.asList(establishmentReview1,establishmentReview2,establishmentReview3);
	
	@Before
	public void setup() {
		
		
		Mockito.when(establishmentReviewRepository.findAll()).thenReturn(allEstablishmentReviews);
		
		Mockito.when(establishmentReviewRepository.findById(1L)).thenReturn(Optional.of(establishmentReview1));
		Mockito.when(establishmentReviewRepository.findById(2L)).thenReturn(Optional.of(establishmentReview2));
		Mockito.when(establishmentReviewRepository.findById(3L)).thenReturn(Optional.of(establishmentReview3));
		
	}
	
	/**
	 * Tests if all the EstablishmentReview are returned by the list method.
	 */
	@Test
	public void getEstablishmentReviewsTest() {
		List<EstablishmentReviewEntity> listreturned = new ArrayList<EstablishmentReviewEntity>();
		
		Iterable<EstablishmentReviewEntity> establishmentReviewsreturned = establishmentReviewService.getEstablishmentReviews();
		
		for (EstablishmentReviewEntity establishmentReviewEntity : establishmentReviewsreturned) {
			listreturned.add(establishmentReviewEntity);
		}
		
		Assert.assertEquals(allEstablishmentReviews.size(),listreturned.size());
		
		Assert.assertTrue(allEstablishmentReviews.containsAll(listreturned));
	}
	
	/**
	 * Tests if the right EstablishmentReview are returned by the getById method
	 * @throws ResourceNotFoundException
	 */
	@Test
	public void getEstablishmentReviewbyIdTest() throws ResourceNotFoundException {
		
		EstablishmentReviewEntity establishmentReviewReturned = establishmentReviewService.getEstablishmentReview(1L);
		Assert.assertEquals(establishmentReviewReturned, establishmentReview1);
		
	}
	
	/**
	 * Tests if a ResourceNotFoundException is thrown when try to get an ResourceNotFoundException that does not exists.
	 * @throws ResourceNotFoundException
	 */
	@Test(expected = ResourceNotFoundException.class)
	public void getEstablishmentReviewbyIdThrowExceptionTest() throws ResourceNotFoundException {
		
		establishmentReviewService.getEstablishmentReview(4L);
		
		
	}
	
	/**
	 * Test if the establishmentReviewService calls the save method of establishmentReviewRepository with the right parameter.
	 */
	@Test
	public void saveEstablishmentReviewTest() {
		establishmentReviewService.saveEstablishmentReview(establishmentReview1);
		Mockito.verify(establishmentReviewRepository).save(establishmentReview1);		
	}
	
	/**
	 * Test if the establishmentReviewService calls the deleteById method of establishmentReviewRepository with the right id.
	 * @throws ResourceNotFoundException
	 */
	@Test
	public void deleteEstablishmentReviewEntityTest() throws ResourceNotFoundException {
		establishmentReviewService.deleteEstablishmentReviewEntity(1L);
		Mockito.verify(establishmentReviewRepository).deleteById(1L);
		
	}
	
	
	/**
	 * Tests if the right EstablishmentReview are returned by the update method, and it calls the save method from the repository.
	 * @throws ResourceNotFoundException
	 */
	@Test
	public void updateEstablishmentReviewbyIdTest() throws ResourceNotFoundException {
		
		EstablishmentReviewEntity establishmentReviewReturned = establishmentReviewService.updateEstablishmentReviewEntity(establishmentReview1);
		
		Assert.assertEquals(establishmentReviewReturned, establishmentReview1);
		
		Mockito.verify(establishmentReviewRepository).save(establishmentReview1);
		
	}
	
	/**
	 * Tests if a ResourceNotFoundException is thrown when try to get an ResourceNotFoundException that does not exists.
	 * @throws ResourceNotFoundException
	 */
	@Test(expected = ResourceNotFoundException.class)
	public void updateEstablishmentReviewbyIdThrowExceptionTest() throws ResourceNotFoundException {
		
		establishmentReviewService.updateEstablishmentReviewEntity(new EstablishmentReviewEntity(4, 40.5, 400));
		
		
	}

}
