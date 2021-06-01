package Kodlamaio.Hrms.Business.Concrete;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Kodlamaio.Hrms.Business.Abstract.JobService;
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
}
