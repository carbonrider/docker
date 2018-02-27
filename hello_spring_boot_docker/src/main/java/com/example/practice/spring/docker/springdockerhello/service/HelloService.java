/**
 * 
 */
package com.example.practice.spring.docker.springdockerhello.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yogesh Jadhav
 *
 */
@RestController
public class HelloService {

	@RequestMapping("/hello")
	public Message sayHello() {
		Message msg = new Message();
		msg.setGreeting("Spring boot rocks!!!");
		return msg;
	}

	class Message {
		private String greeting;

		public String getGreeting() {
			return greeting;
		}

		public void setGreeting(String greeting) {
			this.greeting = greeting;
		}
	}
}
