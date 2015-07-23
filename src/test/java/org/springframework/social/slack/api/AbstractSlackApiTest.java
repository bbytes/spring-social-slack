
package org.springframework.social.slack.api;

import org.junit.Before;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.social.slack.api.impl.SlackTemplate;
import org.springframework.social.test.client.MockRestServiceServer;

public class AbstractSlackApiTest {

	protected static final String APP_ACCESS_TOKEN = "xoxp-3105667121-3107455865-8047331825-961bf";

	protected SlackTemplate slackTemplate;
	protected SlackTemplate slack;
	protected MockRestServiceServer mockServer;
	

	@Before
	public void setup() {

		slackTemplate = new SlackTemplate(APP_ACCESS_TOKEN);
//		mockServer = MockRestServiceServer.createServer(slackTemplate.getRestTemplate());
	}

	protected SlackTemplate getSlackTemplate() {
		return slackTemplate;
	}

	protected Resource jsonResource(String filename) {
		return new ClassPathResource(filename + ".json", getClass());
	}

}