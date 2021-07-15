package Kodlamaio.Hrms.Core.Verification.Concrete;

import Kodlamaio.Hrms.Core.Verification.Abstract.EmailCheckService;
import Kodlamaio.Hrms.Entites.Concrete.User;

public class EmailCheckManager implements EmailCheckService {

	@Override
	public boolean emailVerify(User user) {
		System.out.println("E-Posta Doğrulama Başarılı!");
		return true;
	}

}
