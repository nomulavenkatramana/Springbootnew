package capg.SpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import capg.SpringBoot.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer>{

}
