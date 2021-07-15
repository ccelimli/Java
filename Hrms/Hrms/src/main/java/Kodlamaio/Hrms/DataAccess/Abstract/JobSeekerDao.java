package Kodlamaio.Hrms.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import Kodlamaio.Hrms.Entites.Concrete.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer>{
	JobSeeker getByEmail(String email);
	JobSeeker getByID(int id);
}
