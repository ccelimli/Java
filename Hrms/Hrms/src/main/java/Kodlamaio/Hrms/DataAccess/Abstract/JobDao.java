package Kodlamaio.Hrms.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlamaio.Hrms.Entites.Concrete.Job;

public interface JobDao extends JpaRepository<Job, Integer> {
	Job getByTitle(String title);
}
