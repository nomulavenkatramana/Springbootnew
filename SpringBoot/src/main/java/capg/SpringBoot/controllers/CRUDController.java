package capg.SpringBoot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import capg.SpringBoot.service.CompanyService;

@RestController
@RequestMapping(("/company"))
public class CRUDController {
	@Autowired
	private CompanyService service;
	
	@GetMapping("/insert")
	public String insertData() {
		service.insertCompany();
		return "Success";
	}
}
