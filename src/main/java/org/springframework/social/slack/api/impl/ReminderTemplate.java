package org.springframework.social.slack.api.impl;

import org.springframework.social.slack.api.ReminderOperations;
import org.springframework.social.slack.api.impl.model.SlackReminderListResponse;
import org.springframework.social.slack.api.impl.model.SlackReminderResponse;
import org.springframework.social.slack.api.impl.model.SlackResponse;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;

public class ReminderTemplate extends AbstractTemplate implements ReminderOperations {

	public ReminderTemplate(RestOperations restOperations) {
		super(restOperations);
	}

	@Override
	public SlackResponse addReminder(String text, String time) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("text", text);
		paramMap.add("time", time);
		SlackResponse slackResponse = get("/reminders.add", paramMap, SlackResponse.class);
		return slackResponse;

	}

	@Override
	public SlackResponse addReminder(String text, long time) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("text", text);
		paramMap.add("time", new Long(time).toString());
		SlackResponse slackResponse = get("/reminders.add", paramMap, SlackResponse.class);
		return slackResponse;
	}
	
	@Override
	public SlackResponse addReminder(String text, String userId, String time) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("text", text);
		paramMap.add("time", time);
		paramMap.add("user", userId);
		SlackResponse slackResponse = get("/reminders.add", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackResponse completeReminder(String reminderId) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("reminderId", reminderId);
		SlackResponse slackResponse = get("/reminders.complete", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackResponse deleteReminder(String reminderId) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("reminderId", reminderId);
		SlackResponse slackResponse = get("/reminders.delete", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackReminderResponse getReminderInfo(String reminderId) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("reminderId", reminderId);
		SlackReminderResponse slackResponse = get("/reminders.info", paramMap, SlackReminderResponse.class);
		return slackResponse;
	}

	@Override
	public SlackReminderListResponse getReminderList() {
		SlackReminderListResponse slackResponse = get("/reminders.list", SlackReminderListResponse.class);
		return slackResponse;
	}



}
