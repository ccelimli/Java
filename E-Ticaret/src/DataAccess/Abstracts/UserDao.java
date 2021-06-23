package DataAccess.Abstracts;

import java.util.List;

import Entities.Concretes.User;

public interface UserDao {
	void Register(User user);
	void Login(User user);
	void Confirm(User user);
	List<User> getAll();
}
