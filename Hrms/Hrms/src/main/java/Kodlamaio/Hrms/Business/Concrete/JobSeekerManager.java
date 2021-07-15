package Kodlamaio.Hrms.Business.Concrete;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Kodlamaio.Hrms.Business.Abstract.JobSeekerService;
import Kodlamaio.Hrms.Core.Utilities.Results.DataResult;
import Kodlamaio.Hrms.Core.Utilities.Results.ErrorResult;
import Kodlamaio.Hrms.Core.Utilities.Results.Result;
import Kodlamaio.Hrms.Core.Utilities.Results.SuccessDataResult;
import Kodlamaio.Hrms.Core.Utilities.Results.SuccessResult;
import Kodlamaio.Hrms.Core.Verification.Abstract.EmailCheckService;
import Kodlamaio.Hrms.Core.Verification.Abstract.MernisCheckService;
import Kodlamaio.Hrms.DataAccess.Abstract.JobSeekerDao;
import Kodlamaio.Hrms.Entites.Concrete.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService{
	@Autowired
	private JobSeekerDao jobSeekerDao;
	private MernisCheckService mernisCheckService;
	private EmailCheckService emailCheckService;
	
	public JobSeekerManager (JobSeekerDao jobSeekerDao, MernisCheckService mernisCheckService, EmailCheckService emailCheckService ) {
		super();
		this.jobSeekerDao=jobSeekerDao;
		this.mernisCheckService=mernisCheckService;
		this.emailCheckService=emailCheckService;
	}
	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result Add(JobSeeker jobSeeker) {
		if(	jobSeeker.getName() == null || jobSeeker.getEmail() == null || jobSeeker.getNationalityID() == null || 
			jobSeeker.getPassword() == null || jobSeeker.getSurname() == null || jobSeeker.getBirthYear()==0) 
		{
			System.out.println("Bir yada birden fazla bilgi eksik!");
			
		}
		
		else if(!this.mernisCheckService.mernisVerify(jobSeeker)){
			System.out.println("Mernis Doğrulaması Başarısız Oldu!");
		}
		
		else if(!this.emailCheckService.emailVerify(jobSeeker)) {
			System.out.println("E-Posta Doğrulaması Başarısız!");
		}
		
		else if(!checkEmail(jobSeeker.getEmail())) {
			return new ErrorResult("Bu E-posta Daha önce kullanılmış");
		}
		else if(!checkID(jobSeeker.getId())) {
			return new ErrorResult("Kayıtlı TC Kimlik No!");
		}
		
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("Kullanıcı Eklendi");
	}
	
	@Override
	public boolean checkEmail(String email) {
		if(this.jobSeekerDao.getByEmail(email)==null) {
			return true;
		}
		return false;
	}
	
	@Override
	public boolean checkID(int id) {
		if(this.jobSeekerDao.getByID(id)==null) {
			return true;
		}
		return false;
	}
}
