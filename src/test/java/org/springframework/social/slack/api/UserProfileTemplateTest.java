package org.springframework.social.slack.api;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.junit.Test;
import org.springframework.social.slack.api.impl.model.SlackUser;
import org.springframework.util.Assert;

public class UserProfileTemplateTest extends AbstractSlackApiTest{

	@Test
	public void getCurrentAuthUser() {		
		SlackUser user = getSlackTemplate().userProfileOperations().getUserProfile();
		System.out.println(ToStringBuilder.reflectionToString(user));
		Assert.notNull(user);
		Assert.notNull(user.getName());
	}
	
}
