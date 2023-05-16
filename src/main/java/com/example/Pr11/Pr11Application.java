package com.example.Pr11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Controller
@RequestMapping("message")
public class Pr11Application {
	@GetMapping
	@ResponseBody
	public String list(){
		return "index";
	}
	public static void main(String[] args) {
		SpringApplication.run(Pr11Application.class, args);
	}

}
