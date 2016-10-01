package org.springframework.social.slack.api;

import org.springframework.social.slack.api.impl.model.SlackReminderListResponse;
import org.springframework.social.slack.api.impl.model.SlackReminderResponse;
import org.springframework.social.slack.api.impl.model.SlackResponse;

public interface ReminderOperations {

	public SlackResponse addReminder(String text, String time);
	
	public SlackResponse addReminder(String text, long time);
	
	public SlackResponse addReminder(String text, String userId, String time);
	
	public SlackResponse completeReminder(String reminderId);
	
	public SlackResponse deleteReminder(String reminderId);
	
	public SlackReminderResponse getReminderInfo(String reminderId);
	
	public SlackReminderListResponse getReminderList();
}
