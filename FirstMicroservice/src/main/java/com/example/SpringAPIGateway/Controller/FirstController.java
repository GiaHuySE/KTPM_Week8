package com.example.SpringAPIGateway.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class FirstController {

	@GetMapping("/message")
	public String test() {
		return "Hello JavaInUse Called in First Service";
	}
}
