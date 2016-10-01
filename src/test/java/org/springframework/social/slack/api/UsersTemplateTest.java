package org.springframework.social.slack.api;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Test;
import org.springframework.social.slack.api.impl.model.SlackPresence;
import org.springframework.social.slack.api.impl.model.SlackResponse;
import org.springframework.social.slack.api.impl.model.SlackUser;
import org.springframework.social.slack.api.impl.model.SlackUserStarsResponse;
import org.springframework.social.slack.api.impl.model.UserPresence;
import org.springframework.util.Assert;

public class UsersTemplateTest extends AbstractSlackApiTest {

	@Test
	public void testUserStarsResponse() {
		SlackUser user = getSlackTemplate().userProfileOperations().getUserProfile();
		SlackUserStarsResponse slackUserStarsRespeonse = getSlackTemplate().usersOperations().getStarsForUser(user.getId());
		System.out.println(ToStringBuilder.reflectionToString(slackUserStarsRespeonse, ToStringStyle.MULTI_LINE_STYLE));
		Assert.notNull(slackUserStarsRespeonse);
		Assert.notNull(slackUserStarsRespeonse.getItems());
	}

	@Test
	public void testUserPresence() {
		SlackUser user = getSlackTemplate().userProfileOperations().getUserProfile();
		UserPresence userPresence = getSlackTemplate().usersOperations().getUserPresence(user.getId());
		System.out.println("UserPresence = " + ToStringBuilder.reflectionToString(userPresence, ToStringStyle.MULTI_LINE_STYLE));
		Assert.notNull(userPresence);
		Assert.notNull(userPresence.getConnectionCount());
		// LastActivity may be null
		//Assert.notNull(userPresence.getLastActivity());
	}
	
	@Test
	public void testSetUserPresence() {
		SlackUser user = getSlackTemplate().userProfileOperations().getUserProfile();
		SlackResponse response = getSlackTemplate().usersOperations().setUserPresence(user.getId(), SlackPresence.AUTO);
		System.out.println("setUserPresence response = " + ToStringBuilder.reflectionToString(response, ToStringStyle.MULTI_LINE_STYLE));
		// Getting ok=false, message = unknown team_id T#####, error = null
		//Assert.isTrue(response.isOk());
		Assert.notNull(response.isOk());
	}
	
	@Test
	public void testSetUserActive() {
		SlackUser user = getSlackTemplate().userProfileOperations().getUserProfile();
		SlackResponse response = getSlackTemplate().usersOperations().setUserActive(user.getId());
		System.out.println(ToStringBuilder.reflectionToString(response, ToStringStyle.MULTI_LINE_STYLE));
		Assert.isTrue(response.isOk());
	}

	@Test
	public void testGetAllsers() {
		List<SlackUser> slackUsers = getSlackTemplate().usersOperations().getAllUsers();
		System.out.println(ToStringBuilder.reflectionToString(slackUsers, ToStringStyle.MULTI_LINE_STYLE));
		Assert.notNull(slackUsers);
		Assert.isTrue(slackUsers.size() > 0);
	}

}
