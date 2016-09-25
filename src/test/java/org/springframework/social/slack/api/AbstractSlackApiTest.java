
package org.springframework.social.slack.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Before;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.social.slack.api.impl.SlackTemplate;
import org.springframework.social.slack.api.impl.model.SlackUser;
import org.springframework.social.test.client.MockRestServiceServer;

public class AbstractSlackApiTest {

	protected static final String API_ACCESS_TOKEN_PROP = "API_ACCESS_TOKEN";

	protected SlackTemplate slackTemplate;
	protected SlackTemplate slack;
	protected MockRestServiceServer mockServer;

	@Before
	public void setup() throws FileNotFoundException, IOException {
		slackTemplate = new SlackTemplate(getTestAPIToken());
	}

	protected SlackTemplate getSlackTemplate() {
		return slackTemplate;
	}

	protected Resource jsonResource(String filename) {
		return new ClassPathResource(filename + ".json", getClass());
	}

	protected SlackUser getCurrentUser() {
		SlackUser user = getSlackTemplate().userProfileOperations().getUserProfile();
		return user;
	}

	private Properties readTestProperties() throws IOException {
		Properties props = new Properties();
		InputStream is = ClassLoader.getSystemResourceAsStream("test.properties");
		props.load(is);
		return props;
	}

	private String getTestAPIToken() throws IOException {
		return readTestProperties().getProperty(API_ACCESS_TOKEN_PROP);
	}

}