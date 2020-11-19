package ie.cct.msc.cloud.technologydepartment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ie.cct.msc.cloud.*")
public class TechnologyDepartmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechnologyDepartmentApplication.class, args);
	}

}
