package org.springframework.social.slack.api;

import java.util.Map;

import org.junit.Test;
import org.springframework.social.slack.api.impl.SlackException;
import org.springframework.social.slack.api.impl.model.SlackResponse;
import org.springframework.util.Assert;

public class MiscTemplateTest extends AbstractSlackApiTest {

	@Test
	public void testApi() throws SlackException {
		SlackResponse response = getSlackTemplate().miscOperations().testAPI();
		Assert.isTrue(response.isOk());
	}
	
	@Test
	public void testEmojiList() throws SlackException {

		Map<String, String> result = getSlackTemplate().miscOperations().getEmojiList();
		Assert.notNull(result);
		Assert.isTrue(!result.values().isEmpty());

		System.out.println(result);

	}

}
