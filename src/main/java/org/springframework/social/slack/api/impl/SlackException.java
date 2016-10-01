package org.springframework.social.slack.api.impl;

import java.io.IOException;

public class SlackException  extends RuntimeException {

	private static final long serialVersionUID = 3266422101399261863L;

	public SlackException() {
		super();
	}

	public SlackException(String message) {
		super(message);
	}
	
	public SlackException(IOException ex) {
		super(ex);
	}
	
	public SlackException(Exception ex) {
		super(ex);
	}
	
	public SlackException(Throwable t) {
		super(t);
	}

	
	
	public SlackException(String message, Throwable cause) {
		super(message, cause);
	}
}
