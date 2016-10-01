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

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Before;

public class AbstractSlackApiTest {

	protected static final String API_ACCESS_TOKEN_PROP = "API_ACCESS_TOKEN";
	protected static final String TEST_USERNAME_PROP = "TEST_USERNAME";

	protected static final Properties TEST_PROPERTIES = new Properties();

	static {
		InputStream is = ClassLoader.getSystemResourceAsStream("test.properties");
		try {
			TEST_PROPERTIES.load(is);
		} catch (IOException ios) {
			System.err.println("Can't load test properties!");
		}
	}

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

	protected String getTestUserName() {
		return TEST_PROPERTIES.getProperty(TEST_USERNAME_PROP);
	}

	private String getTestAPIToken() {
		return TEST_PROPERTIES.getProperty(API_ACCESS_TOKEN_PROP);
	}
}