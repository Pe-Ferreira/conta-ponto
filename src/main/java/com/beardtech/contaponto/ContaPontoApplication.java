package com.beardtech.contaponto;

import com.beardtech.contaponto.model.Amigo;
import com.beardtech.contaponto.repo.AmigoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContaPontoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContaPontoApplication.class, args);
	}

}
