package capg.SpringBoot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import capg.SpringBoot.entity.Greeting;

@Controller
public class GreetingController {
	 @GetMapping("/greeting")
	  public String greetingForm(Model model) {
	    model.addAttribute("greeting", new Greeting());
	    return "greeting";
	  }

	  @PostMapping("/greeting")
	  public String greetingSubmit(@ModelAttribute Greeting greeting, Model model) {
	    model.addAttribute("greeting", greeting);
//	    service.insertUserData(greeting);
	    return "gresult";
	}
}
