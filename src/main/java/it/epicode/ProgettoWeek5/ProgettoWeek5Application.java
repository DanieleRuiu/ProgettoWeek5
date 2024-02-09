package it.epicode.ProgettoWeek5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@SpringBootApplication
public class ProgettoWeek5Application implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Server running");
	}


	public static void main(String[] args) {
		SpringApplication.run(ProgettoWeek5Application.class, args);
	}

}
