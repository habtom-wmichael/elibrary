package edu.miu.cs.cs425.semowebapps.eLibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

	
	@GetMapping({"/","/helibrary","/helibrary/home"})
	public String displayHomePage() {
		
		return"home/index";
	}

}
