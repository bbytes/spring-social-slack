package org.springframework.social.slack.api;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Test;
import org.springframework.social.slack.api.impl.SlackException;
import org.springframework.social.slack.api.impl.model.SlackAttachment;
import org.springframework.social.slack.api.impl.model.Color;
import org.springframework.social.slack.api.impl.model.SlackMessageResponse;
import org.springframework.util.Assert;

public class ChatTemplateTest extends AbstractSlackApiTest {

	@Test
	public void testSendPostMessage() {
		ChatOperations chatOperations = getSlackTemplate().chatOperations();
		SlackMessageResponse messageResponse = chatOperations
				.postMessage("junit test case message with id " + UUID.randomUUID(), "#general");
		System.out.println(ToStringBuilder.reflectionToString(messageResponse, ToStringStyle.MULTI_LINE_STYLE));
		Assert.isTrue(messageResponse.isOk());
	}
	
	@Test
	public void testDirectSendPostMessage() {
		ChatOperations chatOperations = getSlackTemplate().chatOperations();
		String userName = getTestUserName();
		SlackMessageResponse messageResponse = chatOperations
				.postMessage("Direct message with id " + UUID.randomUUID(), "@" + userName);
		System.out.println(ToStringBuilder.reflectionToString(messageResponse, ToStringStyle.MULTI_LINE_STYLE));
		Assert.isTrue(messageResponse.isOk());
	}

	@Test
	public void testDetailSendPostMessage() throws SlackException {
		ChatOperations chatOperations = getSlackTemplate().chatOperations();
		SlackAttachment attachment = new SlackAttachment();
		attachment.setText("Random text in attachment");
		attachment.setColor(Color.GOOD);
		List<SlackAttachment> attachments = new ArrayList<>();
		attachments.add(attachment);
		
		SlackMessageResponse messageResponse = chatOperations
				.postMessage("#general", "test message to be sent", "My Bot", false, true, 
						attachments, true, true, null, null);
		System.out.println(ToStringBuilder.reflectionToString(messageResponse, ToStringStyle.MULTI_LINE_STYLE));
		Assert.isTrue(messageResponse.isOk());
	}

	@Test
	public void testSendMeMessage() {
		ChatOperations chatOperations = getSlackTemplate().chatOperations();
		SlackMessageResponse messageResponse = chatOperations
				.meMessage("/remind me on June 1st to wish BBytes happy birthday", "#general");
		System.out.println(ToStringBuilder.reflectionToString(messageResponse, ToStringStyle.MULTI_LINE_STYLE));
		Assert.isTrue(messageResponse.isOk());
	}

	@Test
	public void testDeleteMessage() throws InterruptedException {

		ChatOperations chatOperations = getSlackTemplate().chatOperations();
		SlackMessageResponse messageResponse = chatOperations.postMessage("junit delete test case message", "#general");
		System.out.println(ToStringBuilder.reflectionToString(messageResponse, ToStringStyle.MULTI_LINE_STYLE));
		Assert.isTrue(messageResponse.isOk());

		Thread.sleep(2000);

		messageResponse = chatOperations.deleteMessage(messageResponse.getTimeStamp(), messageResponse.getChannel(),
				true);
		Assert.isTrue(messageResponse.isOk());

	}

	@Test
	public void testUpdateMessage() throws InterruptedException {

		ChatOperations chatOperations = getSlackTemplate().chatOperations();
		SlackMessageResponse messageResponse = chatOperations.postMessage("junit first message before update",
				"#general");
		System.out.println(ToStringBuilder.reflectionToString(messageResponse, ToStringStyle.MULTI_LINE_STYLE));
		Assert.isTrue(messageResponse.isOk());

		Thread.sleep(2000);

		messageResponse = chatOperations.updateMessage(messageResponse.getTimeStamp(), messageResponse.getChannel(),
				true, "junit post update message");
		Assert.isTrue(messageResponse.isOk());

	}

}
