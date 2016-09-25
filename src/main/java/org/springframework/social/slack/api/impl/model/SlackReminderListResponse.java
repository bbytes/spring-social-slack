package org.springframework.social.slack.api.impl.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackReminderListResponse extends SlackResponse {

	@JsonProperty("reminders")
	private List<SlackReminder> reminders;

	public List<SlackReminder> getReminders() {
		return reminders;
	}

	public void setReminders(List<SlackReminder> reminders) {
		this.reminders = reminders;
	}
}
