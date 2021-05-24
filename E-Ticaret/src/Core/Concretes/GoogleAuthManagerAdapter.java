package Core.Concretes;

import Core.Abstracts.AuthService;
import Entities.Concretes.User;
import GoogleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {
	GoogleAuthManager googleAuthManager; 
	public GoogleAuthManagerAdapter(GoogleAuthManager googleAuthManager) {
		this.googleAuthManager= googleAuthManager;
	}

	@Override
	public void Register(User user) {
		googleAuthManager.Register(user);
		
	}

	@Override
	public void Login(User user) {
		googleAuthManager.Login(user);
		
	}
}
