package ie.cct.msc.cloud.petdepartment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ie.cct.msc.cloud.*")
public class PetDepartmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetDepartmentApplication.class, args);
	}

}
