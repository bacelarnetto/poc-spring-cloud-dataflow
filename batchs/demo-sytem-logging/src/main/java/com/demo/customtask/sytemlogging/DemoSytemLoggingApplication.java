package com.demo.customtask.sytemlogging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

@EnableTask
@SpringBootApplication
public class DemoSytemLoggingApplication {	

	public static void main(String[] args) {
		SpringApplication.run(DemoSytemLoggingApplication.class, args);
	}

}
