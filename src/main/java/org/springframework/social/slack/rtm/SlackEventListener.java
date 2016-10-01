package org.springframework.social.slack.rtm;

public interface SlackEventListener {
	
	public void handleMessage(String message);
	
}
