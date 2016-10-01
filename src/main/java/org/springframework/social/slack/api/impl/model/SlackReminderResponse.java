package org.springframework.social.slack.api.impl.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackReminderResponse extends SlackResponse{

	@JsonProperty("reminder")
	private SlackReminder reminder;

	public SlackReminder getReminder() {
		return reminder;
	}

	public void setReminder(SlackReminder reminder) {
		this.reminder = reminder;
	}
}
