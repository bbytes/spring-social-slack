package org.springframework.social.slack.api;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Test;
import org.springframework.social.slack.api.impl.model.SlackAccessLogs;
import org.springframework.social.slack.api.impl.model.SlackTeamInfo;
import org.springframework.util.Assert;

public class TeamTemplateTest extends AbstractSlackApiTest {

	@Test
	public void testGetAccessLogs() {
		List<SlackAccessLogs> slackAccessLogs = getSlackTemplate().teamOperations().getAccessLogs(100, 1);
		System.out.println(ToStringBuilder.reflectionToString(slackAccessLogs, ToStringStyle.MULTI_LINE_STYLE));
		Assert.notNull(slackAccessLogs);
	}

	@Test
	public void testTeamInfo() {
		SlackTeamInfo slackTeamInfo = getSlackTemplate().teamOperations().getTeamInfo();
		System.out.println(ToStringBuilder.reflectionToString(slackTeamInfo, ToStringStyle.MULTI_LINE_STYLE));
		Assert.notNull(slackTeamInfo);
		Assert.notNull(slackTeamInfo.getDomain());
	}

}
