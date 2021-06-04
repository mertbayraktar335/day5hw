package day5hw.entities;

import day5hw.abstracts.Entitiy;

public class User implements Entitiy{

	
		private int id;
			private String firstName;
			private String lastName;
			private String eMail;
			private String password;
			private boolean isVerify = true;
			private boolean mailValidation = true;
			
			public boolean isMailValidation() {
				return mailValidation;
			}


			public void setMailValidation(boolean mailValidation) {
				this.mailValidation = mailValidation;
			}


			public User() {};
			
			
			public User(int id, String firstName, String lastName, String eMail, String password, boolean isVerify, boolean mailValidation) {
				super();
				this.id = id;
				this.firstName = firstName;
				this.lastName = lastName;
				this.eMail = eMail;
				this.password = password;
			}
			public int getId() {
				return id;
			}
			private void setId(int id) {
				this.id = id;	
			}
			public String getFirstName() {
				return firstName;
			}
			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}
			public String getLastName() {
				return lastName;
			}
			public void setLastName(String lastName) {
				this.lastName = lastName;
			}
			public String getEmail() {
				return eMail;
			}
			public void setEmail(String email) {
				this.eMail = email;
			}
			public String getPasword() {
				return password;
			}
			public void setPasword(String pasword) {
				this.password = pasword;
			}
			public boolean isVerify() {
				return isVerify;
			}
			public boolean setVerify(boolean isVerify) {
				return this.isVerify = isVerify;
			}


			

			

		}

	


