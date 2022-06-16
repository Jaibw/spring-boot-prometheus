package com.example.monitorFinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MonitorFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitorFinalApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "App") String name)
	{
		return String.format("Hello %s!", name);
	}

	@GetMapping("/")
	public String home()
	{
		return String.format("Hello World");
	}

}
