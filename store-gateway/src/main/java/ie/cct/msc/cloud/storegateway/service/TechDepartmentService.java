package ie.cct.msc.cloud.storegateway.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;

import ie.cct.msc.cloud.storegateway.domain.Product;
import reactor.core.publisher.Flux;

public class TechDepartmentService {
	
	public List<Product> getAllProducts() {
		ResponseSpec retrieve = WebClient.builder().baseUrl("http://localhost:8081/api/products").build().get().retrieve(); // execute
		Flux<Product> bodyToFlux = retrieve.bodyToFlux(Product.class);
		ArrayList<Product> products = (ArrayList<Product>) bodyToFlux.collectList().block();
		
		return products;
	}
}
