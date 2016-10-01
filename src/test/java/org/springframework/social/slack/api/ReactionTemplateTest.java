package org.springframework.social.slack.api;

import java.io.File;

import org.junit.Test;
import org.springframework.social.slack.api.impl.SlackException;
import org.springframework.social.slack.api.impl.model.SlackFileResponse;
import org.springframework.social.slack.api.impl.model.SlackReactionItemListResponse;
import org.springframework.social.slack.api.impl.model.SlackResponse;
import org.springframework.util.Assert;

public class ReactionTemplateTest extends AbstractSlackApiTest {

	@Test
	public void testAddReaction() throws Exception {
		String channelId =  getSlackTemplate().channelOperations().getAllChannels().get(0).getId();
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("files/sample.txt").getFile());
		SlackFileResponse slackFileResponse = getSlackTemplate().filesOperations().uploadFile(file,
				"Spring-test--upload-for-reaction-test",channelId);
		String fileId = slackFileResponse.getFile().getId();
		
		SlackResponse slackResponse = getSlackTemplate().reactionOperations().addReactionToFile("thumbsup", fileId);
				
		Assert.notNull(slackResponse);
		Assert.isTrue(slackResponse.isOk());
	}

	
	@Test
	public void testGetReactionList() throws SlackException {
	
		SlackReactionItemListResponse slackResponse = getSlackTemplate().reactionOperations().getReactionList(1);
				
		Assert.notNull(slackResponse);
		Assert.isTrue(slackResponse.isOk());
		Assert.isTrue(!slackResponse.getReactionItems().isEmpty());

	}
}
