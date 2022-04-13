package capg.SpringBoot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import capg.SpringBoot.entity.User;
import capg.SpringBoot.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService service;
	
	@GetMapping("/user")
	  public String userForm(Model model) {
	    model.addAttribute("user", new User());
	    return "user";
	  }

	  @PostMapping("/user")
	  public String userSubmit(@ModelAttribute User user, Model model) {
		  service.insertUserData(user);
	    model.addAttribute("user", user);
	    return "result";
	  }
}
