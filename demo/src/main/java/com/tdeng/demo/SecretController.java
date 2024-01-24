package com.tdeng.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class SecretController {
    // TBD 
	// @Value("${mysecret}")
	// String mysecret;

	// @GetMapping("/secret")
    // public String secret() {    
    //     return "mysecret from config server is: " + mysecret;
    // }
}