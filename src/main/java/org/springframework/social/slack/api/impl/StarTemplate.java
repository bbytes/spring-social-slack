package org.springframework.social.slack.api.impl;

import org.springframework.social.slack.api.StarOperations;
import org.springframework.social.slack.api.impl.model.SlackResponse;
import org.springframework.social.slack.api.impl.model.SlackStarItemListResponse;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;

public class StarTemplate extends AbstractTemplate implements StarOperations {

	public StarTemplate(RestOperations restOperations) {
		super(restOperations);
	}

	@Override
	public SlackResponse addStarToFile(String file) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("file", file);
		SlackResponse slackResponse = get("/stars.add", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackResponse addStarToFileComment(String file_comment) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("file_comment", file_comment);
		SlackResponse slackResponse = get("/stars.add", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackResponse addStarToMessage(String channel, String timestamp) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		paramMap.add("timestamp", timestamp);
		SlackResponse slackResponse = get("/stars.add", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackStarItemListResponse getStarList(int page) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("page", new Integer(page).toString());
		SlackStarItemListResponse slackResponse = get("/stars.list", paramMap, SlackStarItemListResponse.class);
		return slackResponse;
	}

	@Override
	public SlackStarItemListResponse getStarList(int page, int count) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("page", new Integer(page).toString());
		paramMap.add("count", new Integer(count).toString());
		SlackStarItemListResponse slackResponse = get("/stars.list", paramMap, SlackStarItemListResponse.class);
		return slackResponse;
	}

	@Override
	public SlackStarItemListResponse getStarList(String user, int page) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("page", new Integer(page).toString());
		paramMap.add("user", user);
		SlackStarItemListResponse slackResponse = get("/stars.list", paramMap, SlackStarItemListResponse.class);
		return slackResponse;
	}

	@Override
	public SlackStarItemListResponse getStarList(String user, int page, int count) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("page", new Integer(page).toString());
		paramMap.add("count", new Integer(count).toString());
		paramMap.add("user", user);
		SlackStarItemListResponse slackResponse = get("/stars.list", paramMap, SlackStarItemListResponse.class);
		return slackResponse;
	}

	@Override
	public SlackResponse removeStarFromFile(String file) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("file", file);
		SlackResponse slackResponse = get("/stars.remove", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackResponse removeStarFromFileComment(String file_comment) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("file_comment", file_comment);
		SlackResponse slackResponse = get("/stars.remove", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackResponse removeStarFromMessage(String channel, String timestamp) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		paramMap.add("timestamp", timestamp);
		SlackResponse slackResponse = get("/stars.remove", paramMap, SlackResponse.class);
		return slackResponse;
	}

}
