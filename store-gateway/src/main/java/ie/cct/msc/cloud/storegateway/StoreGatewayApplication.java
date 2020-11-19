package ie.cct.msc.cloud.storegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ie.cct.msc.cloud.*")
public class StoreGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreGatewayApplication.class, args);
	}
}
