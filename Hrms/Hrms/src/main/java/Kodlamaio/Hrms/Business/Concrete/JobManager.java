package Kodlamaio.Hrms.Business.Concrete;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Kodlamaio.Hrms.Business.Abstract.JobService;
import Kodlamaio.Hrms.Core.Utilities.Results.ErrorResult;
import Kodlamaio.Hrms.Core.Utilities.Results.Result;
import Kodlamaio.Hrms.DataAccess.Abstract.JobDao;
import Kodlamaio.Hrms.Entites.Concrete.Job;

@Service //Bu Class Service görevi görecek.
public class JobManager implements JobService {
	private JobDao jobDao;
	
	@Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}

	@Override
	public List<Job> getAll() {
		return this.jobDao.findAll();
	}

	@Override
	public Result Add(Job job) {
		if(!CheckJobTitle(job.getTitle())){
			return new ErrorResult("Meslek İsmi Tekrar Edilemez");
		}
		return null;
	}
	public boolean CheckJobTitle(String title) {
		if(this.jobDao.getByTitle(title)==null) {
			return true;
		}
		return false;
	}
}
