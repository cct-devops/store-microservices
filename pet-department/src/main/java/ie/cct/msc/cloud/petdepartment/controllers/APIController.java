package ie.cct.msc.cloud.petdepartment.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ie.cct.msc.cloud.petdepartment.domain.Product;

@RestController
public class APIController {
	
	private List<Product> products;
	
	public APIController() {
		products = new ArrayList<>();
		products.add(new Product(1,"Food", "Food for my dogs or they will eat me alive", 10000));
		products.add(new Product(1,"Perfume", "Perfume for my dogs", 2500));
		products.add(new Product(1,"De-worming tablets", "to kill worms", 3500));
	}
	
	@GetMapping("/api/products")
	public List<Product> listProducts() {
		return products;
	}
}
