package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);
	@GetMapping("demo")
	String demo() {
		System.out.println("Logging the details tracing");
		
		String value = "Hello";
		
		for(int i=0;i<10000;i++) {
			LOGGER.trace("Demo1 needed more information - {}", value);
		    LOGGER.debug("Demo1 needed to debug - {}", value);
		    LOGGER.info("Demo1 took input - {}", value);
		    LOGGER.warn("Demo1 needed to warn - {}", value);
		    LOGGER.error("Demo1 encountered an error with value - {}", value);
		    
		    LOGGER.trace("From logger debugging");
		}
	    
	    LOGGER.trace("From logger debugging");
		return "This is demo";
	}

}
