import Business.Abstracts.UserService;
import Business.Concretes.UserManager;
import Core.Concretes.GoogleAuthManagerAdapter;
import DataAccess.Concretes.InMemoryUserDao;
import Entities.Concretes.User;
import GoogleAuth.GoogleAuthManager;

public class Main {
	public static void main(String[] args) {
		
		UserService userService= new UserManager(new InMemoryUserDao(), new GoogleAuthManagerAdapter(new GoogleAuthManager()));
		User user= new User(1,"Çaðatay","Çelimli","c.celimli@live.co.uk","A123",true);
		userService.Register(user);
		userService.Login(user);
		userService.RegisterWithAccount(user);
		userService.LoginWithAccount(user);
		
	}
}