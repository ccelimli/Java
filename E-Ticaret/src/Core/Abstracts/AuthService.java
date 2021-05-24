package Core.Abstracts;

import Entities.Concretes.User;

public interface AuthService {
	void Register(User user);
	void Login(User user); 
}
