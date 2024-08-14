package com.salaocabeloepele.salao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SalaoTesteController {
	@GetMapping
	public String hello(){
		return "Hello World";
	}
}