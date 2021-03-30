package com.demo.customtask.sytemlogging;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@EnableTask
@SpringBootApplication
public class DemoSytemLoggingApplication {
	
	@Bean
	public MySytemLog mySytemLog() {
		return new MySytemLog();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoSytemLoggingApplication.class, args);
	}
	

	public static class MySytemLog implements ApplicationRunner{
		@Override
		public void run(ApplicationArguments args) throws Exception {
			System.out.println(String.format("Olá, execultando a task Sytem Logging!!"));
			
		}		
	}

}
