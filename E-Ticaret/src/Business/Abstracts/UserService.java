package Business.Abstracts;

import Entities.Concretes.User;

public interface UserService {
	void Register(User user);
	void Login(User user);
	void Confirm(User user);
	void RegisterWithAccount(User user);
	void LoginWithAccount(User user);
}
