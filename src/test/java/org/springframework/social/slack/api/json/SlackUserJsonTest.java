package org.springframework.social.slack.api.json;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.social.slack.api.AbstractSlackApiTest;
import org.springframework.social.slack.api.impl.model.SlackUserInfoResponse;
import org.springframework.util.Assert;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SlackUserJsonTest extends AbstractSlackApiTest {

	@Test
	public void deserializeSlackUserTest() throws IOException {
		ObjectMapper objectMapper = getSlackTemplate().getJsonMessageConverter().getObjectMapper();

		String userJson = IOUtils.toString(new ClassPathResource("slackUser.json", getClass()).getInputStream());
		SlackUserInfoResponse userInfoResponse = objectMapper.readValue(userJson, SlackUserInfoResponse.class);
		Assert.notNull(userInfoResponse.getUser().getUserInfo().getEmail());
	}
}
