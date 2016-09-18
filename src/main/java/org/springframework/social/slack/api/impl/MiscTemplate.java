package org.springframework.social.slack.api.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.social.slack.api.MiscOperations;
import org.springframework.social.slack.api.impl.model.SlackBotInfoResponse;
import org.springframework.social.slack.api.impl.model.SlackCommentResponse;
import org.springframework.social.slack.api.impl.model.SlackResponse;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MiscTemplate extends AbstractTemplate implements MiscOperations {

	public MiscTemplate(RestOperations restOperations) {
		super(restOperations);
	}

	@Override
	public Map<String, String> getEmojiList() throws SlackException {
		String response = get("/emoji.list", String.class);
		ObjectMapper mapper = new ObjectMapper();
		Map<String, String> map = new HashMap<String, String>();
		JsonNode retNode = null;
		try {
			retNode = mapper.readTree(response);

			// convert JSON string to Map
			map = mapper.readValue(retNode.findPath("emoji").toString(), new TypeReference<HashMap<String, String>>() {
			});
		} catch (IOException e) {
			throw new SlackException(e);
		}

		return map;
	}

	@Override
	public SlackResponse testAPI() {
		SlackResponse slackResponse = get("/api.test", SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackBotInfoResponse getbotInfo(String bot) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("bot", bot);
	
		SlackBotInfoResponse slackBotInfoResponse = get("/bots.info",paramMap, SlackBotInfoResponse.class);
		return slackBotInfoResponse;
	}

}
