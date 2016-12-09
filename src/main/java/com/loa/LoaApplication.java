package com.loa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:9000")
@SpringBootApplication
public class LoaApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(LoaApplication.class, args);
	}
}
