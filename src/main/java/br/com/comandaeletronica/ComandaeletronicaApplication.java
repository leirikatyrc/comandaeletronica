package br.com.comandaeletronica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.comandaeletronica.util.AppContext;

@SpringBootApplication
public class ComandaeletronicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppContext.class, args);
	}
}
