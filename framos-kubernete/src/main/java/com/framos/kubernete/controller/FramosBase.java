package com.framos.kubernete.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FramosBase {
	
	@Value("${server.port}")
	private Integer port;

	@GetMapping("/")
	public String inicio() {
		return "FRANCISCO NORBERTO RAMOS MARQUEZ     :-->>   "+(new Date());
	}
	@GetMapping("/mensaje")
	public String mensaje() {
		return "mensaje test// DESDE PUERTO:  "+port;
	}
}
