package day5hw.core;

import day5hw.entities.User;

public interface LogService {
	void sendVerificationMail(String _eMail, User user);
	//boolean isVerified(String confirm, User user);
}


