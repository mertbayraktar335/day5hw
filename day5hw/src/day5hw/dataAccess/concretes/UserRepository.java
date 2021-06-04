package day5hw.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import day5hw.dataAccess.abstracts.UserDao;
import day5hw.entities.User;

public class UserRepository  implements UserDao{

	public static ArrayList<User> userDb = new ArrayList<User>();
    public static ArrayList<String> mail = new ArrayList<String>();
    
   
   public boolean existUser(User user) {
   	
   	for (String mails : mail) {
   		if(mails == user.getEmail())
   			user.setMailValidation(false);
		        return false;
   		
   	}
			 
   	return true;
			}
	
	
	@Override
	public void register(User user) {
   	 if (user.isVerify()==true && user.isMailValidation()==true) {
			 mail.add(user.getEmail());
   		 userDb.add(user);
			System.out.println("You have successfully registered- " + user.getFirstName() + " " + user.getLastName());
			
		}else {
			
			System.out.println("Could not register- " + user.getFirstName() + " " + user.getLastName());
		}

	}

	@Override
	public void login(User user) {
		
		if(UserRepository.userDb.contains(user)){
			System.out.println("You have successfully logged in- " + user.getFirstName() + " " + user.getLastName()); return;
       }
		else if(!UserRepository.userDb.contains(user)){
           System.out.println("To login, you must first register"); return;
       }else {
       System.out.println("Wrong email or password");
       }
	}

	@Override
	public void update(User user) {
		User updateUser = getUser(user.getEmail());
		updateUser.setFirstName(user.getFirstName());
		updateUser.setLastName(user.getLastName());
		updateUser.setPasword(user.getPasword());
		System.out.println("You have successfully updated- " + user.getFirstName() + " " + user.getLastName());
	}

	@Override
	public void deleted(User user) {
		UserRepository.userDb.remove(user);
		System.out.println("You have successfully deleted- " + user.getFirstName() + " " + user.getLastName());
	}

	@Override
	public User getUser(String _eMail) {
		for (User user : userDb) {
			
			if (user.getEmail().equals(_eMail)) {
				return user;
			}
		}
		return null;
	
	}
	
	@Override
	public List<User> getAll() {
		return UserRepository.userDb;
	}
	

}
		



