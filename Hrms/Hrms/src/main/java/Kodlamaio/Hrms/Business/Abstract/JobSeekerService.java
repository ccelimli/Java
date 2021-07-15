package Kodlamaio.Hrms.Business.Abstract;

import java.util.List;

import Kodlamaio.Hrms.Core.Utilities.Results.DataResult;
import Kodlamaio.Hrms.Core.Utilities.Results.Result;
import Kodlamaio.Hrms.Entites.Concrete.JobSeeker;

public interface JobSeekerService {
	DataResult<List<JobSeeker>> getAll();
	Result Add(JobSeeker jobSeeker);
	boolean checkEmail(String email);
	boolean checkID(int id);
}
