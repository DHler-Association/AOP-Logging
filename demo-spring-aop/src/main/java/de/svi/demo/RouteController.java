package de.svi.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RouteController {

	//Simple Hello World Route
    @RequestMapping(
            method = RequestMethod.GET,
            path = "/"
    )
    public ResponseEntity<?> getHelloWorld() {
        return ResponseEntity.ok("Hello World");
    }
    
    //add Route with parameters
    @RequestMapping(
            method = RequestMethod.GET,
            path = "/add"
    )
    @LogExecutionTimeAnnotation
    public ResponseEntity<?> add(
            @RequestParam("n1") int number1,
            @RequestParam("n2") int number2
    ) throws InterruptedException {
    	int result = number1 + number2;
        
    	Thread.sleep(500);
    	
    	return ResponseEntity.ok(number1 + " + " + number2 + " = " + result);
    }
	
}