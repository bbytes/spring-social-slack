package org.springframework.social.slack.api;

import org.junit.Test;
import org.springframework.social.slack.api.impl.SlackException;
import org.springframework.social.slack.api.impl.model.SlackChannelResponse;
import org.springframework.social.slack.api.impl.model.SlackDirectMsgChannelListResponse;
import org.springframework.social.slack.api.impl.model.SlackGroupListResponse;
import org.springframework.util.Assert;

public class MessageTemplateTest extends AbstractSlackApiTest {

	@Test
	public void testDirectMsgChannels() throws SlackException {
		SlackDirectMsgChannelListResponse response = getSlackTemplate().messageOperations()
				.getDirectMessageChannelList();
		Assert.isTrue(response.isOk());
		Assert.isTrue(!response.getDirectMsgChannels().isEmpty());
		System.out.println(response);
	}

	@Test
	public void testMultipartyDirectMessageChannelList() throws SlackException {
		SlackGroupListResponse response = getSlackTemplate().messageOperations()
				.getMultipartyDirectMessageChannelList();
		Assert.isTrue(response.isOk());
		System.out.println(response);

	}
	
	@Test
	public void testOpenDirectMessageChannel() throws SlackException {
	
		SlackChannelResponse response = getSlackTemplate().messageOperations()
				.openDirectMessageChannel(getSlackTemplate().userProfileOperations().getUserProfile().getId());
		Assert.isTrue(response.isOk());
		Assert.notNull(response.getChannel().getId());
		System.out.println(response);

	}

}
