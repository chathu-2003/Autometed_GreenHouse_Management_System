package lk.ijse.gdse72.automation_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@lk.ijse.gdse72.automation_service.EnableEurekaClient
public class AutomationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutomationServiceApplication.class, args);
	}
}