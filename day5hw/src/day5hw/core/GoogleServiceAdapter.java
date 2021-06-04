package day5hw.core;

import day5hw.entities.User;
import day5hw.google.GoogleLogService;

public class GoogleServiceAdapter implements GoogleService{

	@Override
	public void register(User user) {
		GoogleLogService googleLogService = new GoogleLogService();
		googleLogService.register(user);
	}
}


