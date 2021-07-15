package Kodlamaio.Hrms.Core.Verification.Abstract;

import Kodlamaio.Hrms.Entites.Concrete.User;

public interface MernisCheckService {
	public boolean mernisVerify(User user);
}
