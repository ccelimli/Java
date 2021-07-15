package Kodlamaio.Hrms.Core.Verification.Abstract;

import Kodlamaio.Hrms.Entites.Concrete.User;

public interface EmailCheckService {
	boolean emailVerify(User user);
}
