package com.appsdeveloperblog.app.ws.ui.model.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UpdateUserDetailsRequestModel {
	@NotNull(message="First name cannot be null")
	@NotEmpty
	private String firstname;
	
	@NotNull(message="Last name cannot be null")
	@NotEmpty
	private String lastname;

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
}
