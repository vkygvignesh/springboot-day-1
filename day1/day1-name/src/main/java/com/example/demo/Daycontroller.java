package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController


public class Daycontroller {
//	 @GetMapping("/name")
//	 public @ResponseBody String name(@RequestBody String name)
//	 {
//	 return "welcome " + name +" !";
//	 }//We access this using postman
	 
	 
	 @GetMapping("/{name}")
	 public String getName(@PathVariable String name) {
		 return "welcome " + name +" !";
	 }
}