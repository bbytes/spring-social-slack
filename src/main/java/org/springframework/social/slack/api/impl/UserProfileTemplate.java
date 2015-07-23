package org.springframework.social.slack.api.impl;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.social.slack.api.SlackAuthInfo;
import org.springframework.social.slack.api.SlackPresence;
import org.springframework.social.slack.api.SlackResponse;
import org.springframework.social.slack.api.SlackUser;
import org.springframework.social.slack.api.SlackUserInfoResponse;
import org.springframework.social.slack.api.UserProfileOperations;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;

public class UserProfileTemplate extends AbstractTemplate implements UserProfileOperations {

	private static final Log log = LogFactory.getLog(UserProfileTemplate.class);

	public UserProfileTemplate(RestOperations restOperations) {
		super(restOperations);
	}

	@Override
	public SlackUser getUserProfile() {
		SlackAuthInfo slackAuthInfo = get("/auth.test", SlackAuthInfo.class);
		SlackUser user = getUserProfile(slackAuthInfo.getUserId());
		return user;
	}

	@Override
	public SlackResponse setStatus(SlackPresence status) {
		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("presence", status.toString());
		return post("/users.setPresence", map, SlackResponse.class);
	}

	@Override
	public SlackUser getUserProfile(String userId) {
		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("user", userId);
		SlackUserInfoResponse userInfoResponse = get("/users.info", map, SlackUserInfoResponse.class);
		return userInfoResponse.getUser();
	}

}
