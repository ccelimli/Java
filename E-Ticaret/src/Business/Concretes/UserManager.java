package Business.Concretes;

import Business.Abstracts.UserService;
import Core.Abstracts.AuthService;
import DataAccess.Abstracts.UserDao;
import Entities.Concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserService{
	private UserDao userDao;
	private AuthService authService;
	
	public UserManager(UserDao userDao, AuthService authService) {
		super();
		this.userDao = userDao;
		this.authService = authService;
	}

	@Override
	public void Register(User user) {
		if(user.getPassword().length()<6 && user.getFirstName().length()<2 && user.getLastName().length()<2) {
			System.out.println("Kullanıcı Bilgileri Şartları Sağlamıyor!");
			System.out.println("Parola En Az 6 Karakterden Oluşmalıdır.");
			System.out.println("Kullanıcı Ad ve Soyadı En Az 2 Karakterden Oluşmalıdır.");
		}
		
		//Regex
		final String emailPattern="^[A-Za-z0-9+_.-]+@(.+)$";
		final Pattern pattern= Pattern.compile(emailPattern);
		Matcher matcher = pattern.matcher(user.getEmail());
		
		if(!matcher.matches()){
			System.out.println("Geçersiz E-Posta!");
		}
		
		//Kayıtlı E-Posta Sorunu
		
	}

	@Override
	public void Login(User user) {
		if(user.isVerified()==true) {
			userDao.Login(user);
			System.out.println("Giriş Başarılı");
		}
		else {
			System.out.println("E-Posta yada Parola yanlış! Yeniden deneyiniz.");
		}
	}

	@Override
	public void Confirm(User user) {
		if (user.isVerified()==true){
			userDao.Confirm(user);
			System.out.println("E-Posta Doğrulandı.");
		}
		else {
			System.out.println("Geçersiz E-Posta!");
		}		
	}

	@Override
	public void RegisterWithAccount(User user) {
		user.setVerified(true);
		this.authService.Register(user);
	}

	@Override
	public void LoginWithAccount(User user) {
		if (user.isVerified()==true){
			this.authService.Login(user);
		}
		else {
			System.out.println("Geçersiz Kayıt");
		}
	}		
}
