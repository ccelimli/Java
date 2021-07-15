package Kodlamaio.Hrms.Core.Verification.Concrete;

import Kodlamaio.Hrms.Core.Verification.Abstract.HrmsCheckService;
import Kodlamaio.Hrms.Entites.Concrete.User;

public class HrmsCheckManager implements HrmsCheckService{

	@Override
	public boolean hrmsVerify(User user) {
		System.out.println("Doğrulama Başarılı!");
		return true;
	}

}
