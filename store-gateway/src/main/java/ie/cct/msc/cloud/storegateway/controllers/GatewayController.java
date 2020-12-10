package ie.cct.msc.cloud.storegateway.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ie.cct.msc.cloud.storegateway.domain.Product;
import ie.cct.msc.cloud.storegateway.service.PetDepartmentService;
import ie.cct.msc.cloud.storegateway.service.TechDepartmentService;
import ie.cct.msc.cloud.storegateway.service.VipCheckerService;

@RestController
public class GatewayController {
	
	private PetDepartmentService petDepartmentService;
	
	private TechDepartmentService techDepartmentService;
	
	private VipCheckerService vipCheckerService;
	
	public GatewayController() {
		petDepartmentService = new PetDepartmentService();
		techDepartmentService = new TechDepartmentService();
		vipCheckerService = new VipCheckerService();
	}
	
	@GetMapping("/api/all-products")
	public List<Product> getAllProducts(@RequestParam(name = "vipcode", required = true) String vipCode) {
		System.out.println("request received");
		if(vipCheckerService.isVipCode(vipCode)) {
			List<Product> petProducts = new ArrayList<>();
			List<Product> techProducts = new ArrayList<>();
			
			try {
				petProducts = petDepartmentService.getAllProducts();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				techProducts = techDepartmentService.getAllProducts();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			List<Product> allProducts = new ArrayList<>();
			allProducts.addAll(petProducts);
			allProducts.addAll(techProducts);
			
			return allProducts;
		} else {
			return new ArrayList<>();
		}
		
	}
	
}
