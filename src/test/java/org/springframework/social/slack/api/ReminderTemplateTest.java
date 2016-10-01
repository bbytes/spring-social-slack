package org.springframework.social.slack.api;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;
import org.springframework.social.slack.api.impl.SlackException;
import org.springframework.social.slack.api.impl.model.SlackReminderListResponse;
import org.springframework.social.slack.api.impl.model.SlackResponse;
import org.springframework.util.Assert;

public class ReminderTemplateTest extends AbstractSlackApiTest {

	@Test
	public void testAddReminder() throws SlackException {
		long ONE_MINUTE_IN_MILLIS = 60000;// millisecs
		Calendar date = Calendar.getInstance();
		long t = date.getTimeInMillis();
		Date afterAddingTenMins = new Date(t + (10 * ONE_MINUTE_IN_MILLIS));

		SlackResponse slackResponse = getSlackTemplate().reminderOperations().addReminder("Test reminder spring slack",
				afterAddingTenMins.getTime() / 1000L);
		Assert.notNull(slackResponse);
		Assert.isTrue(slackResponse.isOk());

		slackResponse = getSlackTemplate().reminderOperations().addReminder("Drink water", "in 15 minutes");
		Assert.notNull(slackResponse);
		Assert.isTrue(slackResponse.isOk());

	}

	
	@Test
	public void testGetReminderList() throws SlackException {
	
		SlackResponse slackResponse = getSlackTemplate().reminderOperations().addReminder("Test reminder list slack",
				"in 2 minutes");
		Assert.notNull(slackResponse);
		Assert.isTrue(slackResponse.isOk());
		
		SlackReminderListResponse slackListResponse = getSlackTemplate().reminderOperations().getReminderList();
				
		Assert.notNull(slackListResponse);
		Assert.isTrue(slackListResponse.isOk());
		Assert.isTrue(!slackListResponse.getReminders().isEmpty());

	}
}
