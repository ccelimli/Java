package Kodlamaio.Hrms.Business.Abstract;

import java.util.List;

import Kodlamaio.Hrms.Core.Utilities.Results.Result;
import Kodlamaio.Hrms.Entites.Concrete.Job;

public interface JobService {
	Result Add(Job job);
	List<Job> getAll();
}
