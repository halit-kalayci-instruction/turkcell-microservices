package com.turkcell.notificationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class NotificationserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationserviceApplication.class, args);
	}

	@KafkaListener(topics = "notificationTopic", groupId = "notificationId")
	public void handleNotificationEvent(String message)
	{
		System.out.println("Topicte bir mesaj yakalandı: " + message);
	}
}
