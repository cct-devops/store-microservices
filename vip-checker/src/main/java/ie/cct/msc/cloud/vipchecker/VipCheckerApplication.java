package ie.cct.msc.cloud.vipchecker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ie.cct.msc.cloud.vipchecker.*")
public class VipCheckerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VipCheckerApplication.class, args);
	}

}
