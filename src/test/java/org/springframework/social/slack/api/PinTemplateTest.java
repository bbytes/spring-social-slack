package org.springframework.social.slack.api;

import java.io.File;

import org.junit.Test;
import org.springframework.social.slack.api.impl.SlackException;
import org.springframework.social.slack.api.impl.model.SlackFileListResponse;
import org.springframework.social.slack.api.impl.model.SlackFileResponse;
import org.springframework.social.slack.api.impl.model.SlackItemListResponse;
import org.springframework.social.slack.api.impl.model.SlackResponse;
import org.springframework.util.Assert;

public class PinTemplateTest extends AbstractSlackApiTest {

	
	@Test
	public void testGetPinList() throws SlackException {
		String channelId =  getSlackTemplate().channelOperations().getAllChannels().get(0).getId();
		SlackItemListResponse result = getSlackTemplate().pinOperations().getPinList(channelId);
		Assert.notNull(result);
		Assert.isTrue(!result.getItemList().isEmpty());

		System.out.println(result);

	}
	
	@Test
	public void testChannelAddPin() throws Exception {
		String channelId =  getSlackTemplate().channelOperations().getAllChannels().get(0).getId();
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("files/sample.txt").getFile());
		SlackFileResponse slackFileResponse = getSlackTemplate().filesOperations().uploadFile(file,
				"Spring-test-upload-pin-test",channelId);
		String fileId = slackFileResponse.getFile().getId();
		
		SlackResponse result = getSlackTemplate().pinOperations().pinFile(channelId, fileId);
		Assert.isTrue(result.isOk());

		System.out.println(result);

	}

}
