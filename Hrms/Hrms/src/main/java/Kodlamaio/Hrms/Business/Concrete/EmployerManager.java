package Kodlamaio.Hrms.Business.Concrete;

import java.util.List;
import Kodlamaio.Hrms.Business.Abstract.EmployerService;
import Kodlamaio.Hrms.Core.Utilities.Results.DataResult;
import Kodlamaio.Hrms.Core.Utilities.Results.Result;
import Kodlamaio.Hrms.Core.Utilities.Results.SuccessDataResult;
import Kodlamaio.Hrms.Core.Utilities.Results.SuccessResult;
import Kodlamaio.Hrms.Core.Verification.Abstract.EmailCheckService;
import Kodlamaio.Hrms.Core.Verification.Abstract.HrmsCheckService;
import Kodlamaio.Hrms.DataAccess.Abstract.EmployerDao;
import Kodlamaio.Hrms.Entites.Concrete.Employer;

public class EmployerManager implements EmployerService {
	private EmailCheckService emailCheckService;
	private HrmsCheckService hrmsCheckService;
	private EmployerDao employerDao;
	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result Add(Employer employer) {
		if(	employer.getCompany_name()==null || employer.getEmail()==null || 
			employer.getPassword()==null || employer.getPhoneNumber()==null || 
			employer.getWebsite()==null) 
		{
			System.out.println("Bilgiler Eksiksiz doldurulmalıdır!");
		}
		
		if (hrmsCheckService.hrmsVerify(employer)==false){
			System.out.println("Hrms Doğrulaması Başarısız!");
		}
		if(emailCheckService.emailVerify(employer)) {
			System.out.println("E-mail Doğrulaması Başarısız!");
		}			
		this.employerDao.save(employer);
		return new SuccessResult("Ekleme Başarılı!");
	}

	@Override
	public boolean checkEmail(String email) {
		if(this.employerDao.getByEmail(email)==null) {
			return true;
		}
		return false;
	}
}
