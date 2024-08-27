package bj.highfiveuniversity.hello_world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
// annotation qui dit à spring que ce code décrit un endpoint (url)
// devrait être rendu disponinle dans le navigateur
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

	// Route::get("hello"), [... Controller , hello]
	@GetMapping("/hello")
	public String hello(@RequesParam(defaultValue="world") String name){
		return String.format("Hello %s !", name);
	}

}
