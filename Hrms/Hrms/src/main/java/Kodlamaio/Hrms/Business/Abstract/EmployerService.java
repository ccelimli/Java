package Kodlamaio.Hrms.Business.Abstract;

import java.util.List;

import Kodlamaio.Hrms.Core.Utilities.Results.DataResult;
import Kodlamaio.Hrms.Core.Utilities.Results.Result;
import Kodlamaio.Hrms.Entites.Concrete.Employer;

public interface EmployerService {
	DataResult<List<Employer>> getAll();
	Result Add(Employer employer);
	boolean checkEmail(String Email);
}
