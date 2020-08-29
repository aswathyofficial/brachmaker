package com.PgJenkin_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
public class Controller {
	
	@GetMapping("/two")
	public Strings Display()
	{
		return "Hello Aswathy how are you";
	}

}
