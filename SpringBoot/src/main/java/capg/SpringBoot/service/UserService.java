package capg.SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import capg.SpringBoot.entity.User;
import capg.SpringBoot.repository.UserInterface;

@Service
public class UserService {
	@Autowired
	private UserInterface userRepo;
	
	public void insertUserData(User user) {
		userRepo.save(user);
	}
}
