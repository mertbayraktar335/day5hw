package day5hw.core;

import day5hw.entities.User;

public class LogManager implements LogService{

	@Override
	public void sendVerificationMail(String _eMail, User user) {
		System.out.println("Verification code sending...");		
	}

/*	@Override
	public boolean isVerified(String confirm, User user) {
		
		String alphaNumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		int length = 6;
		for(int i =0; i<length; i++) {
			int index = random.nextInt(alphaNumeric.length());
			char randomChar = alphaNumeric.charAt(index);
		}
		
		String randomString = sb.toString();
		System.out.println(randomString);
		Scanner info = new Scanner(System.in);
		System.out.println("Code: ");
		confirm = (info.next());
		
		if (confirm.equals(randomString)) {
			System.out.println("Your email address has been verified");
			return true;
		}
		System.out.println("Your e-mail address could not be verified");
		return false;
	}*/

}