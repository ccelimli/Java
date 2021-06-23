package DataAccess.Concretes;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

public class InMemoryUserDao implements UserDao{
	List<User> users= new ArrayList<User>(); 
	
	@Override
	public void Register(User user){
		System.out.println("Kayýt Tamamlandý!");
		users.add(user);
	}

	@Override
	public void Login(User user){
		System.out.println("Giriþ Baþarýlý.");	
	}

	@Override
	public void Confirm(User user){
		System.out.println("E-Posta onaylandý.");
		user.setVerified(true);
	}

	@Override
	public List<User> getAll(){
		// TODO Auto-generated method stub
		return this.users;
	}
}
