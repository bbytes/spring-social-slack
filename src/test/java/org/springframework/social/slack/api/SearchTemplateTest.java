package org.springframework.social.slack.api;

import org.junit.Test;
import org.springframework.social.slack.api.impl.SlackException;
import org.springframework.social.slack.api.impl.model.SlackSearchResponse;
import org.springframework.util.Assert;

public class SearchTemplateTest extends AbstractSlackApiTest {

	
	@Test
	public void testSearchAll() throws SlackException {

		SlackSearchResponse response = getSlackTemplate().searchOperations().searchAll("test");
		Assert.notNull(response);
		Assert.isTrue(response.isOk());

		System.out.println(response);

	}

}
