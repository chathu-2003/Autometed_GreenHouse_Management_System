package lk.ijse.gdse72.zoneservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@lk.ijse.gdse72.zoneservice.EnableEurekaClient
public class ZoneServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZoneServiceApplication.class, args);
	}
}