package org.springframework.social.slack.api.impl;

import java.util.List;

import org.springframework.social.slack.api.UsersOperations;
import org.springframework.social.slack.api.impl.model.SlackPresence;
import org.springframework.social.slack.api.impl.model.SlackResponse;
import org.springframework.social.slack.api.impl.model.SlackUser;
import org.springframework.social.slack.api.impl.model.SlackUserListResponse;
import org.springframework.social.slack.api.impl.model.SlackUserStarsResponse;
import org.springframework.social.slack.api.impl.model.UserPresence;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;

/**
 * UsersOperations impl
 * 
 * @author Thanneer
 *
 */
public class UsersTemplate extends AbstractTemplate implements UsersOperations {

	public UsersTemplate(RestOperations restOperations) {
		super(restOperations);
	}

	@Override
	public SlackUserStarsResponse getStarsForUser(String userId) {
		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("user", userId);
		SlackUserStarsResponse slackUserStarsRespeonse = get("/stars.list", map, SlackUserStarsResponse.class);
		return slackUserStarsRespeonse;
	}

	@Override
	public UserPresence getUserPresence(String userId) {
		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("user", userId);
		UserPresence userPresenceResponse = get("/users.getPresence", map, UserPresence.class);
		return userPresenceResponse;
	}

	@Override
	public List<SlackUser> getAllUsers() {
		SlackUserListResponse slackUserAllResponse = get("/users.list", SlackUserListResponse.class);
		return slackUserAllResponse.getUserList();
	}

	@Override
	public SlackResponse setUserActive(String userId) {
		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("user", userId);
		SlackResponse slackResponse = get("/users.setActive", map, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackResponse setUserPresence(String userId, SlackPresence presence) {
		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("presence", presence.toString());
		SlackResponse slackResponse = get("/users.setPresence", map, SlackResponse.class);
		return slackResponse;
	}

}
