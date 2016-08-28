package org.springframework.social.slack.api;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.social.slack.api.impl.SlackTemplate;
import org.springframework.social.test.client.MockRestServiceServer;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Before;

public class AbstractSlackApiTest {
			
	protected static final String APP_ACCESS_TOKEN;

	static {
		final Properties properties = new Properties();
		try (final InputStream stream =
				 AbstractSlackApiTest.class.getResourceAsStream("test.properties")) {
			properties.load(stream);

			APP_ACCESS_TOKEN = properties.getProperty("appAccessToken");
		} catch (IOException ioe) {
			throw new RuntimeException("Can't load test.properties from classpath", ioe);
		}
	}

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