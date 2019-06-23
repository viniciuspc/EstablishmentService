package com.ubiwhere.web;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ubiwhere.exception.ResourceNotFoundException;
import com.ubiwhere.model.EstablishmentReviewEntity;
import com.ubiwhere.service.EstablishmentReviewService;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Is.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Unit test for the controller.
 * @author vinicius
 */
@RunWith(SpringRunner.class)
@WebMvcTest(EstablishmentReviewController.class)
public class EstablishmentReviewControllerTest {
	
	@Autowired
    private MockMvc mvc;
	
	@Autowired
	private ObjectMapper mapper;
 
    @MockBean
    private EstablishmentReviewService service;
    
    /**
     * Verify if the controller return the reviews list in a json.
     * @throws Exception
     */
    @Test
    public void retriveAllEstablishmentReviewTest() throws Exception {
    	EstablishmentReviewEntity establishmentReview = new EstablishmentReviewEntity(1, 10.5, 100);
    	
    	List<EstablishmentReviewEntity> allReviews = Arrays.asList(establishmentReview);
    	
    	Mockito.when(service.getEstablishmentReviews()).thenReturn(allReviews);
    	mvc.perform(get("/review")
    			.contentType(MediaType.APPLICATION_JSON))
    			.andExpect(status().isOk())
    		    .andExpect(jsonPath("$", hasSize(1)))
    		    .andExpect(jsonPath("$[0].id", is(1)))
    		    .andExpect(jsonPath("$[0].averageReviewScore", is(10.5)))
    		    .andExpect(jsonPath("$[0].numberofReviews", is(100)));
    	
    }
    
    /**
     * Verify if the controller calls the save method of the service with the right review information.
     * @throws Exception
     */
    @Test
    public void saveEstablishmentReviewTest() throws Exception {
    	EstablishmentReviewEntity establishmentReview = new EstablishmentReviewEntity(1, 10.5, 100);
    	
    	
    	mvc.perform(post("/review")
    			.contentType(MediaType.APPLICATION_JSON)
    			.content(mapper.writeValueAsString(establishmentReview)))
    			.andExpect(status().isCreated())
    		    .andExpect(jsonPath("id", is(1)))
    		    .andExpect(jsonPath("averageReviewScore", is(10.5)))
    		    .andExpect(jsonPath("numberofReviews", is(100)));
    	
    	verify(service).saveEstablishmentReview(establishmentReview);
    	
    }
    
    /**
     * Verify if the controller returns the review that came from the service.
     * @throws Exception
     */
    @Test
    public void getEstablishmentreviewTest() throws Exception {
    	EstablishmentReviewEntity establishmentReview = new EstablishmentReviewEntity(1, 10.5, 100);
    	
    	when(service.getEstablishmentReview(1)).thenReturn(establishmentReview);
    	
    	mvc.perform(get("/review/1")
    			.contentType(MediaType.APPLICATION_JSON))
    			.andExpect(status().isOk())
    		    .andExpect(jsonPath("id", is(1)))
    		    .andExpect(jsonPath("averageReviewScore", is(10.5)))
    		    .andExpect(jsonPath("numberofReviews", is(100)));
    	
    }
    
    /**
     * Verify if the controller returns not found when the service not found the review.
     * @throws Exception
     */
    @Test
    public void getEstablishmentreviewNotFoundTest() throws Exception {
    	
    	when(service.getEstablishmentReview(1)).thenThrow(new ResourceNotFoundException(1));
    	
    	mvc.perform(get("/review/1")
    			.contentType(MediaType.APPLICATION_JSON))
    			.andExpect(status().isNotFound());
    	
    }
    
    /**
     * Verify if the controller calls the delete method of the service.
     * @throws Exception
     */
    @Test
    public void deleteEstablishmentreviewTest() throws Exception {
    	
    	mvc.perform(delete("/review/1")
    			.contentType(MediaType.APPLICATION_JSON))
    			.andExpect(status().isOk());
    	
    	verify(service).deleteEstablishmentReviewEntity(1);
    	
    }
    
    /**
     * Verify if the controller calls the update method of the service with the right review information.
     * @throws Exception
     */
    @Test
    public void updateEstablishmentReviewTest() throws Exception {
    	EstablishmentReviewEntity establishmentReview = new EstablishmentReviewEntity(1, 10.5, 100);
    	
    	when(service.updateEstablishmentReviewEntity(establishmentReview)).thenReturn(establishmentReview);
    	
    	mvc.perform(put("/review/1")
    			.contentType(MediaType.APPLICATION_JSON)
    			.content(mapper.writeValueAsString(establishmentReview)))
    			.andExpect(status().isOk())
    		    .andExpect(jsonPath("id", is(1)))
    		    .andExpect(jsonPath("averageReviewScore", is(10.5)))
    		    .andExpect(jsonPath("numberofReviews", is(100)));
    	
    	verify(service).updateEstablishmentReviewEntity(establishmentReview);
    	
    }
    
    /**
     * Verify if the controller returns not found when the service not found a review to update.
     * @throws Exception
     */
    @Test
    public void updateEstablishmentReviewFoundTest() throws Exception {
    	EstablishmentReviewEntity establishmentReview = new EstablishmentReviewEntity(1, 10.5, 100);
    	
    	when(service.updateEstablishmentReviewEntity(establishmentReview)).thenThrow(new ResourceNotFoundException(1));
    	
    	mvc.perform(put("/review/1")
    			.contentType(MediaType.APPLICATION_JSON)
    			.content(mapper.writeValueAsString(establishmentReview)))
    			.andExpect(status().isNotFound());
    	
    }

}
