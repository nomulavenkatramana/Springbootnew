package capg.SpringBoot.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import capg.SpringBoot.model.Customer;

@RestController
@RequestMapping("/rest")
public class FirstRestController {
	@RequestMapping("/display")
	public String display() {
		return "First REST";
	}
	@RequestMapping(value = "/customer")
	public Customer getCustomer() {
		Customer cu = new Customer();
		cu.setId(100);
		cu.setName("Pavan");
		return cu;
	}
	
	@RequestMapping("/customers")
	public List<Customer> getCustomers(){
		Customer cu = new Customer();
		cu.setId(100);
		cu.setName("Pavan");
		Customer cu2 = new Customer();
		cu2.setId(102);
		cu2.setName("Chiru");
		List<Customer> l = new ArrayList<Customer>();
		l.add(cu2);
		l.add(cu);
		return l;
	}
}
