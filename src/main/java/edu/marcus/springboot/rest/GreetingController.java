package edu.marcus.springboot.rest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.marcus.springboot.model.Greeting;

@RestController
public class GreetingController {
	
	private static final String TEMPLATE = "Hello, %s!";
    private final AtomicLong COUNTER = new AtomicLong();

    @RequestMapping("/greeting") //RequestMethod.GET is default value for method attribute
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(COUNTER.incrementAndGet(), String.format(TEMPLATE, name));
    }

}
