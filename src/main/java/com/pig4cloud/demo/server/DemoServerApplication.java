package com.pig4cloud.demo.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoServerApplication {

	@GetMapping
	public String index(){
		return  "最小镜像挑战赛 </br> © 2020 pig4cloud.com" ;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoServerApplication.class, args);
	}

}
