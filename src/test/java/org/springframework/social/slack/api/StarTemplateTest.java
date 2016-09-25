package org.springframework.social.slack.api;

import java.io.File;

import org.junit.Test;
import org.springframework.social.slack.api.impl.model.SlackFileResponse;
import org.springframework.social.slack.api.impl.model.SlackResponse;
import org.springframework.social.slack.api.impl.model.SlackStarItemListResponse;
import org.springframework.util.Assert;

public class StarTemplateTest extends AbstractSlackApiTest {

	
	@Test
	public void testStarFile() throws Exception {

		String channelId =  getSlackTemplate().channelOperations().getAllChannels().get(0).getId();
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("files/sample.txt").getFile());
		SlackFileResponse slackFileResponse = getSlackTemplate().filesOperations().uploadFile(file,
				"Spring-test--upload-for-star-test",channelId);
		String fileId = slackFileResponse.getFile().getId();
		
		SlackResponse response = getSlackTemplate().starOperations().addStarToFile(fileId);
		Assert.notNull(response);
		Assert.isTrue(response.isOk());

		System.out.println(response);

	}
	
	@Test
	public void testGetStarList() throws Exception {

		SlackStarItemListResponse response = getSlackTemplate().starOperations().getStarList(1);
		Assert.notNull(response);
		Assert.isTrue(response.isOk());
		Assert.isTrue(!response.getItems().isEmpty());

		System.out.println(response);

	}

}
