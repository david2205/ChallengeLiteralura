package com.robf3d.Desafio_literalura;
import com.robf3d.Desafio_literalura.Runn.Run;
import com.robf3d.Desafio_literalura.repository.AutorRepository;
import com.robf3d.Desafio_literalura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeLiteralura implements CommandLineRunner {

	@Autowired
	private LibroRepository libroRepository;
	@Autowired
	private AutorRepository autorRepository;
	public static void main(String[] args) {
		SpringApplication.run(ChallengeLiteralura.class, args);
	}

	public void inicio(){

	}

	@Override
	public void run(String... args) throws Exception {
		Run principal = new Run(libroRepository,autorRepository);
		principal.request();
	}
}
