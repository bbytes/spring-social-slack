package org.springframework.social.slack.api;

import java.util.UUID;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Test;
import org.springframework.social.slack.api.impl.model.SlackHistoryResponse;
import org.springframework.social.slack.api.impl.model.SlackGroupResponse;
import org.springframework.social.slack.api.impl.model.SlackResponse;
import org.springframework.util.Assert;

public class GroupTemplateTest extends AbstractSlackApiTest {

	@Test
	public void testGroupCreate() {

		String groupName = UUID.randomUUID().toString();
		SlackGroupResponse slackGroupResponse = getSlackTemplate().groupOperations().createGroup(groupName);
		System.out.println(ToStringBuilder.reflectionToString(slackGroupResponse, ToStringStyle.MULTI_LINE_STYLE));
		Assert.isTrue(slackGroupResponse.isOk());

		SlackResponse response = getSlackTemplate().groupOperations().archiveGroup(slackGroupResponse.getGroup().getId());
		Assert.isTrue(response.isOk());

		String groupChildName = UUID.randomUUID().toString();
		slackGroupResponse = getSlackTemplate().groupOperations().createChildGroup(groupChildName);
		Assert.notNull(slackGroupResponse);

	}

	@Test
	public void testCloseGroup() {
		String groupName = UUID.randomUUID().toString();
		SlackGroupResponse slackGroupResponse = getSlackTemplate().groupOperations().createGroup(groupName);
		System.out.println(ToStringBuilder.reflectionToString(slackGroupResponse, ToStringStyle.MULTI_LINE_STYLE));
		SlackResponse response = getSlackTemplate().groupOperations().closeGroup(slackGroupResponse.getGroup().getId());
		Assert.isTrue(response.isOk());

		response = getSlackTemplate().groupOperations().archiveGroup(slackGroupResponse.getGroup().getId());
		Assert.isTrue(response.isOk());
	}

	@Test
	public void testGroupHistory() {
		String groupName = UUID.randomUUID().toString();
		SlackGroupResponse slackGroupResponse = getSlackTemplate().groupOperations().createGroup(groupName);

		SlackHistoryResponse history = getSlackTemplate().groupOperations()
				.getGroupHistory(slackGroupResponse.getGroup().getId());
		System.out.println(ToStringBuilder.reflectionToString(history, ToStringStyle.MULTI_LINE_STYLE));

		Assert.isTrue(history.isOk());

	}

}
