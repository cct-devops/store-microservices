package ie.cct.msc.cloud.storegateway.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;

import ie.cct.msc.cloud.storegateway.domain.IsVip;
import ie.cct.msc.cloud.storegateway.domain.Product;
import reactor.core.publisher.Mono;

public class VipCheckerService {
	
	public boolean isVipCode(String code) {
		ResponseSpec retrieve = WebClient.builder().baseUrl("http://localhost:8082/user/" + code).build().get().retrieve(); // execute
		Mono<IsVip> bodyToMono = retrieve.bodyToMono(IsVip.class);
		return bodyToMono.block().isVip();
	}
}
