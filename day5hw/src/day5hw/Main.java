package day5hw;

import java.util.Scanner;

import day5hw.business.abstracts.UserService;
import day5hw.business.concretes.UserManager;
import day5hw.core.GoogleServiceAdapter;
import day5hw.core.LogManager;
import day5hw.core.LogService;
import day5hw.dataAccess.concretes.UserRepository;
import day5hw.entities.User;

public class Main {

	
		public static void main(String[] args) {
			
			UserRepository repository = new UserRepository();
			GoogleServiceAdapter googleLogServiceAdapter = new GoogleServiceAdapter();
			LogManager logManager = new LogManager();
			LogService logService = new LogManager();
			
			UserService userService = new UserManager(repository, googleLogServiceAdapter, logManager);

			
			User user1 = new User();
			User user2 = new User();
			System.out.println("**** WELCOME TO E-COMMERCE SYSTEM ****\n");


			System.out.println("\n**** REGISTER****");
			
			System.out.println("How would you like to register?\n"
					+"1 for Manuel - 2 for with Google Account");
			
			Scanner info = new Scanner(System.in);
			int choose = info.nextInt();
		
		
			switch(choose) {
			case 1:
				userService.register(user1);
				break;
			case 2:
				userService.registerWithGoogle(user1);
				//logService.isVerified(user1.getEmail(),user1);
			}
			
			System.out.println("\n**** REGISTER****");
			userService.register(user2);
			

			System.out.println("\n**** LOG IN ****");
			userService.login(user1);
			
			System.out.println("\n**** UPDATE ****");
			userService.update(user1);
			
			System.out.println("\n**** DELETE ****");
			userService.delete(user1);
			
			
			
		
			
			
			
			

		}
	}

	

