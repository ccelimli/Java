package DataAccess.Concretes;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

public class InMemoryUserDao implements UserDao{
	List<User> users= new ArrayList<User>(); 
	
	@Override
	public void Register(User user){
		System.out.println("Kay�t Tamamland�!");
		users.add(user);
	}

	@Override
	public void Login(User user){
		System.out.println("Giri� Ba�ar�l�.");	
	}

	@Override
	public void Confirm(User user){
		System.out.println("E-Posta onayland�.");
		user.setVerified(true);
	}

	@Override
	public List<User> getAll(){
		// TODO Auto-generated method stub
		return this.users;
	}
}
