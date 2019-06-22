package com.ubiwhere.EstablishmentService;

import java.util.concurrent.Executor;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient 		// Enable eureka client.
@EnableAsync				//Enable async methods to run
public class EstablishmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstablishmentServiceApplication.class, args);
	}
	
	public Executor taskExecutator() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2);
        executor.setMaxPoolSize(2);
        executor.setQueueCapacity(500);
        executor.setThreadNamePrefix("EstablishmentAPIRequests-");
        executor.initialize();
		return executor;
	}

}

@Configuration
class RestTemplateConfig{
	// Create a bean for restTemplate to call services inside eureka
	@Bean
	@LoadBalanced		// Load balance between service instances running at different ports.
	@Qualifier("withEureka")
	public RestTemplate loadBalancedEureka() {
		return new RestTemplate();
	}
	
	// Create a bean for restTemplate to call external REST APIs
	@Primary
	@Bean
	@Qualifier("withoutEureka")
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
}