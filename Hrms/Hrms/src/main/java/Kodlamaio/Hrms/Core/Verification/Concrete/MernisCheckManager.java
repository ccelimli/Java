package Kodlamaio.Hrms.Core.Verification.Concrete;


import Kodlamaio.Hrms.Core.Verification.Abstract.MernisCheckService;
import Kodlamaio.Hrms.Entites.Concrete.User;

public class MernisCheckManager implements MernisCheckService  {

	@Override
	public boolean mernisVerify(User user) {
		System.out.println("Mernis Doğrulama Başarılı!");
		return true;
	}
}
