package com.ssm.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2		//	swagger启动
public class SsmCarreyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsmCarreyApplication.class, args);
	}
}
