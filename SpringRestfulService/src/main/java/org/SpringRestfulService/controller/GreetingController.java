package org.SpringRestfulService.controller;

import java.util.Date;

import org.SpringRestfulService.reply.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	private static final String templateGreeting = "Hello, %s!";
	private final Date date = new Date();
	
	@RequestMapping("/getGreeting")
	public Greeting getGreeting(@RequestParam(value="name",defaultValue="everyone")String name){
		return new Greeting(date.toString(), String.format(templateGreeting, name));
	}

}
