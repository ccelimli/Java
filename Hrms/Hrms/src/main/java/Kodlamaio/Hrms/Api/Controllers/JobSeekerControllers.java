package Kodlamaio.Hrms.Api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.Hrms.Business.Abstract.JobSeekerService;
import Kodlamaio.Hrms.Core.Utilities.Results.DataResult;
import Kodlamaio.Hrms.Core.Utilities.Results.Result;
import Kodlamaio.Hrms.Entites.Concrete.JobSeeker;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/jobseeker")
public class JobSeekerControllers {
	private JobSeekerService jobSeekerService;
	
	@Autowired
	JobSeekerControllers(JobSeekerService jobSeekerService){
		super();
		this.jobSeekerService=jobSeekerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobSeeker>> getAll(){
		return this.jobSeekerService.getAll();	
	}
	
	@PostMapping("/add")
	public Result Add(@RequestBody JobSeeker jobSeeker) {
		return this.jobSeekerService.Add(jobSeeker);
	}
}
