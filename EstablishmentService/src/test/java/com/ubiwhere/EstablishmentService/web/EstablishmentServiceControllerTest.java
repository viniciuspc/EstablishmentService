package com.ubiwhere.EstablishmentService.web;

import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.concurrent.CompletableFuture;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.ubiwhere.EstablishmentService.model.EstablishmentReview;
import com.ubiwhere.EstablishmentService.model.FHRS.Establishment;
import com.ubiwhere.EstablishmentService.service.EstablishmentFHRSService;
import com.ubiwhere.EstablishmentService.service.EstablishmentReviewService;

/**
 * Unit test for the EstablishmentServiceController
 * @author vinicius
 *
 */
@RunWith(SpringRunner.class)
@WebMvcTest(EstablishmentServiceController.class)
public class EstablishmentServiceControllerTest {
	
	@Autowired
    private MockMvc mvc;
 
    @MockBean
    private EstablishmentReviewService serviceReview;
    
    @MockBean
    private EstablishmentFHRSService serviceFHRS;
    
    @Test
    public void getEstablishmentAggregationTest() throws Exception {
    	int id = 1;
		EstablishmentReview establishmentReview = new EstablishmentReview(id, 10.5, 100);
    	
    	Establishment establishment = new Establishment();
    	establishment.setfHRSID(id);
    	establishment.setBusinessName("BusinessTest");
    	
    	
    	when(serviceReview.getEstablishmentReview(id)).thenReturn(CompletableFuture.completedFuture(establishmentReview));
    	when(serviceFHRS.getEstablishment(id)).thenReturn(CompletableFuture.completedFuture(establishment));
    	
    	mvc.perform(get("/establishment/"+id)
    			.content(MediaType.APPLICATION_JSON_VALUE))
    			.andExpect(status().isOk())
    			.andExpect(jsonPath("establishment.FHRSID", is(1)))
    			.andExpect(jsonPath("establishment.BusinessName", is("BusinessTest")))
    			.andExpect(jsonPath("establishmentReview.id", is(1)))
    			.andExpect(jsonPath("establishmentReview.averageReviewScore", is(10.5)))
    			.andExpect(jsonPath("establishmentReview.numberofReviews", is(100)));
    	
    }

}
