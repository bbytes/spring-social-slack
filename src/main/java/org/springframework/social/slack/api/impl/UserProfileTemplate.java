package org.springframework.social.slack.api.impl;

import org.springframework.social.slack.api.UserProfileOperations;
import org.springframework.social.slack.api.impl.model.SlackAuthInfo;
import org.springframework.social.slack.api.impl.model.SlackPresence;
import org.springframework.social.slack.api.impl.model.SlackResponse;
import org.springframework.social.slack.api.impl.model.SlackUser;
import org.springframework.social.slack.api.impl.model.SlackUserInfoResponse;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;

public class UserProfileTemplate extends AbstractTemplate implements UserProfileOperations {

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
