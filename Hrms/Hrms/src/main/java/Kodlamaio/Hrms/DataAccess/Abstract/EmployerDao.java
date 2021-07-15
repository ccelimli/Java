package Kodlamaio.Hrms.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlamaio.Hrms.Entites.Concrete.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
	Employer getByEmail(String email);
	Employer getByHRMS(int id);
}
