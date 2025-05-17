package AulaDio.LabGofApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabGofApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabGofApiApplication.class, args);
	}

}
