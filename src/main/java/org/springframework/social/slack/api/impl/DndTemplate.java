package org.springframework.social.slack.api.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.springframework.social.slack.api.DndOperations;
import org.springframework.social.slack.api.impl.model.DndSimpleInfo;
import org.springframework.social.slack.api.impl.model.SlackDndInfoResponse;
import org.springframework.social.slack.api.impl.model.SlackEndSnoozeResponse;
import org.springframework.social.slack.api.impl.model.SlackResponse;
import org.springframework.social.slack.api.impl.model.SlackSetSnoozeResponse;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DndTemplate extends AbstractTemplate implements DndOperations {

	public DndTemplate(RestOperations restOperations) {
		super(restOperations);
	}

	@Override
	public SlackResponse endDnd() {
		SlackResponse slackResponse = get("/dnd.endDnd", SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackEndSnoozeResponse endSnooze() {
		SlackEndSnoozeResponse slackResponse = get("/dnd.endSnooze", SlackEndSnoozeResponse.class);
		return slackResponse;
	}

	@Override
	public SlackSetSnoozeResponse setSnooze(int numMinutes) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("num_minutes", new Integer(numMinutes).toString());

		SlackSetSnoozeResponse slackResponse = get("/dnd.setSnooze", paramMap, SlackSetSnoozeResponse.class);
		return slackResponse;

	}

	@Override
	public SlackDndInfoResponse getDndInfo() {
		SlackDndInfoResponse slackResponse = get("/dnd.info", SlackDndInfoResponse.class);
		return slackResponse;

	}

	@Override
	public SlackDndInfoResponse getDndInfo(String user) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("user", user);

		SlackDndInfoResponse slackResponse = get("/dnd.info", paramMap, SlackDndInfoResponse.class);
		return slackResponse;
	}

	@Override
	public Map<String, DndSimpleInfo> getDndTeamInfo() throws SlackException {
		String response = get("/dnd.teamInfo", String.class);
		ObjectMapper mapper = new ObjectMapper();
		Map<String, DndSimpleInfo> map = new HashMap<String, DndSimpleInfo>();
		JsonNode retNode = null;
		try {
			retNode = mapper.readTree(response);

			// convert JSON string to Map
			map = mapper.readValue(retNode.findPath("users").toString(), new TypeReference<HashMap<String, DndSimpleInfo>>() {
			});
		} catch (IOException e) {
			throw new SlackException(e);
		}

		return map;

	}

	@Override
	public Map<String, DndSimpleInfo> getDndTeamInfo(String... users) throws SlackException {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("users", StringUtils.join(users, ','));
		
		String response = get("/dnd.teamInfo",paramMap, String.class);
		ObjectMapper mapper = new ObjectMapper();
		Map<String, DndSimpleInfo> map = new HashMap<String, DndSimpleInfo>();
		JsonNode retNode = null;
		try {
			retNode = mapper.readTree(response);

			// convert JSON string to Map
			map = mapper.readValue(retNode.findPath("users").toString(), new TypeReference<HashMap<String, DndSimpleInfo>>() {
			});
		} catch (IOException e) {
			throw new SlackException(e);
		}

		return map;
	}

}
