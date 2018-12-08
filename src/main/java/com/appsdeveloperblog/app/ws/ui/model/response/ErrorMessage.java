package com.appsdeveloperblog.app.ws.ui.model.response;

import java.sql.Date;

public class ErrorMessage {

	private Date timestamp;
	private String message;
	
	public ErrorMessage() {}

	public ErrorMessage(Date timestamp, String localizedMessage) {
		this.timestamp = timestamp;
		this.message = localizedMessage;
	}

	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
