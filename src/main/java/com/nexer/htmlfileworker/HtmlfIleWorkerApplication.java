package com.nexer.htmlfileworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@EnableKafka
@ComponentScan
@SpringBootApplication
@EnableAutoConfiguration
public class HtmlfIleWorkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HtmlfIleWorkerApplication.class, args);
	}

}
