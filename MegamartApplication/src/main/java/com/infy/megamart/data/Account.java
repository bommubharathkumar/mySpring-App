package com.infy.megamart.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "account")
public class Account {
	

		private @Id String  username;
	    private @NotBlank String password;
	    private @NotBlank String confirmPassword;
	    private @NotBlank String email;

	    
	    
	    @Override
	public String toString() {
		return "Account [username=" + username + ", password=" + password + ", confirmPassword=" + confirmPassword
				+ ", email=" + email + "]";
	    }



		public String getUsername() {
			return username;
		}



		public void setUsername(String username) {
			this.username = username;
		}



		public String getPassword() {
			return password;
		}



		public void setPassword(String password) {
			this.password = password;
		}



		public String getConfirmPassword() {
			return confirmPassword;
		}



		public void setConfirmPassword(String confirmPassword) {
			this.confirmPassword = confirmPassword;
		}



		public String getEmail() {
			return email;
		}



		public void setEmail(String email) {
			this.email = email;
		}
	

}
