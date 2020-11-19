package ie.cct.msc.cloud.technologydepartment.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ie.cct.msc.cloud.technologydepartment.domain.Product;

@RestController
public class APIController {
	
	private List<Product> products;
	
	public APIController() {
		products = new ArrayList<>();
		products.add(new Product(1,"PS5", "So... a PS5", 100000));
		products.add(new Product(1,"Apple Watch", "A fancy watch", 45000));
	}
	
	@GetMapping("/api/products")
	public List<Product> listProducts() {
		return products;
	}
}
