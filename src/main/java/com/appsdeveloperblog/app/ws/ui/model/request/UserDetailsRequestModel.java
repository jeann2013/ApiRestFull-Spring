package com.appsdeveloperblog.app.ws.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDetailsRequestModel {
	
	@NotNull(message="First name cannot be null")
	@NotEmpty
	private String firstname;
	
	@NotNull(message="Last name cannot be null")
	@NotEmpty
	private String lastname;
	
	@NotNull(message="Email cannot be null")
	@Email
	@NotEmpty
	private String email;
	
	@NotNull(message="Password cannot be null")
	@Size(min=8,max=16, message="Password must be equal or great 8 characters and less 16 characters")
	@NotEmpty
	private String password;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
