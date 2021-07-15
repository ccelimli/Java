package Kodlamaio.Hrms.Api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.Hrms.Business.Abstract.JobService;
import Kodlamaio.Hrms.Entites.Concrete.Job;

@RestController
@RequestMapping("/api/job")
public class JobsControllers {
	private JobService jobService;
	
	@Autowired
	public JobsControllers(JobService jobService) {
		super();
		this.jobService = jobService;
	}
	@GetMapping("/getall")
	public List<Job> getAll(){
		return this.jobService.getAll();
	}

}
