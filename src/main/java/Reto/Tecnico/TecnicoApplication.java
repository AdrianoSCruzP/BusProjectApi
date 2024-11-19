package Reto.Tecnico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TecnicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TecnicoApplication.class, args);
	}

}
