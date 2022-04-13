package capg.SpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import capg.SpringBoot.entity.User;

@Repository
public interface UserInterface extends JpaRepository<User, Integer>{

}
