package demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RouteController {

	//Hello Route
    @RequestMapping(
            method = RequestMethod.GET,
            path = "/hello"
    )
    public ResponseEntity<?> getHello(
            @RequestParam("name") String username
    ) {
        return ResponseEntity.ok("Hello, " + username);
    }
    
    
    
    
    
    //add Route
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
    	
    	Thread.sleep(50);
        
    	return ResponseEntity.ok(number1 + " + " + number2 + " = " + result);
    }

}