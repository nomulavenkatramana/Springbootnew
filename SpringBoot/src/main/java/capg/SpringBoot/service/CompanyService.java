package capg.SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import capg.SpringBoot.entity.Company;
import capg.SpringBoot.repository.CompanyRepository;

@Service
public class CompanyService {
	@Autowired
	private CompanyRepository repo;
	
	public void insertCompany() {
		Company com=new Company();
		com.setId(200);
		com.setName("Capgemini");
		com.setAddress("Mumbai");
		
		repo.save(com);
	}
}
