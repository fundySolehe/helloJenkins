package test.jenkins.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloRestController {

	@GetMapping(value = "/sayHello")
	public String sayHello() {
		return "HELLO TESTING";
	}
}
