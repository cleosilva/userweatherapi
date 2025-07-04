package com.cleosilva.userweatherapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class ProjetoUserwheatherapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoUserwheatherapiApplication.class, args);
	}

}
