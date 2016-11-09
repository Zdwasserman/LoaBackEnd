package com.loa2;

import com.mysql.jdbc.Connection;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:9000")
@SpringBootApplication
public class Loa2Application {

	public static void main(String[] args) {

		SpringApplication.run(Loa2Application.class, args);
	}
}
