package Kodlamaio.Hrms.Api.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.Hrms.Business.Abstract.EmployerService;
import Kodlamaio.Hrms.Core.Utilities.Results.DataResult;
import Kodlamaio.Hrms.Core.Utilities.Results.Result;
import Kodlamaio.Hrms.Entites.Concrete.Employer;

@RestController
@RequestMapping("/api/employer")
public class EmployerControllers {
	private EmployerService employerService;
	
	public EmployerControllers(EmployerService employerService){
		super();
		this.employerService=employerService;
	}
	
	@GetMapping("/gelall")
	public DataResult<List<Employer>> getAll(){
		return this.employerService.getAll();
	}
	
	@PostMapping("/add")
	public Result Add(Employer employer) {
		return this.employerService.Add(employer);
	}

}
