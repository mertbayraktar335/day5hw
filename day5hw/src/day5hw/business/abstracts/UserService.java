package day5hw.business.abstracts;

import java.util.List;

import day5hw.entities.User;

public interface UserService {
	
		void register(User user);
		void login(User user);
		void update(User user);
		void delete(User user);
		void registerWithGoogle(User user);
		List<User> getAll();
		User getUser(String _eMail);

}
