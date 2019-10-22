package com.example.demo;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class WindowsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WindowsServiceApplication.class, args);
	}
	
	@Scheduled(fixedRate = 5000)
	public void runMessage() {
		System.out.println("The Time is " + LocalDateTime.now());
	}
	

}
