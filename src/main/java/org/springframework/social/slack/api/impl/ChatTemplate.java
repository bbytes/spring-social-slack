/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.slack.api.impl;

import java.util.List;

import org.springframework.social.slack.api.ChatOperations;
import org.springframework.social.slack.api.impl.model.SlackAttachment;
import org.springframework.social.slack.api.impl.model.SlackMessageResponse;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Defines operations for interacting with slack team
 * 
 * @author Thanneer
 */
public class ChatTemplate extends AbstractTemplate implements ChatOperations {

	public ChatTemplate(RestOperations restOperations) {
		super(restOperations);
	}

	@Override
	public SlackMessageResponse postMessage(String message, String channelNameOrId) {
		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("channel", channelNameOrId);
		map.add("text", message);
		map.add("as_user", "true");
		map.add("unfurl_links", "true");
		SlackMessageResponse slackResponse = post("/chat.postMessage", map, SlackMessageResponse.class);
		return slackResponse;

	}

	@Override
	public SlackMessageResponse meMessage(String message, String channelNameOrId) {
		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("channel", channelNameOrId);
		map.add("text", message);
		SlackMessageResponse slackResponse = post("/chat.meMessage", map, SlackMessageResponse.class);
		return slackResponse;

	}

	@Override
	public SlackMessageResponse postMessage(String channel, String text, String username, boolean asUser,
			boolean link_names, List<SlackAttachment> attachments, boolean unfurl_links, boolean unfurl_media,
			String icon_url, String icon_emoji) throws SlackException {
		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("channel", channel);
		map.add("text", text);
		map.add("username", username);
		map.add("as_user", String.valueOf(asUser));

		if (link_names) {
			map.add("link_names", "1");
			map.add("parse", "full");
		} else {
			map.add("parse", "none");
		}

		if (attachments != null && !attachments.isEmpty()) {
			try {
				map.add("attachments", new ObjectMapper().writeValueAsString(attachments));
			} catch (JsonProcessingException e) {
				throw new SlackException(e);
			}
		}

		map.add("unfurl_links", String.valueOf(unfurl_links));
		map.add("unfurl_media", String.valueOf(unfurl_media));
		map.add("icon_url", icon_url);
		map.add("icon_emoji", icon_emoji);

		SlackMessageResponse slackResponse = post("/chat.postMessage", map, SlackMessageResponse.class);
		return slackResponse;

	}
	
	@Override
	public SlackMessageResponse postMessage(String message, String channelNameOrId, String usernameOrBotName) {
		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("channel", channelNameOrId);
		map.add("text", message);
		map.add("username", usernameOrBotName);
		map.add("as_user", "false");
		map.add("unfurl_links", "true");
		
		SlackMessageResponse slackResponse = post("/chat.postMessage", map, SlackMessageResponse.class);
		return slackResponse;

	}

	
	@Override
	public SlackMessageResponse deleteMessage(String timestamp, String channelNameOrId, boolean asUser) {
		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("ts", timestamp);
		map.add("channel", channelNameOrId);
		map.add("as_user", Boolean.toString(asUser));

		SlackMessageResponse slackResponse = get("/chat.delete", map, SlackMessageResponse.class);
		return slackResponse;

	}

	@Override
	public SlackMessageResponse updateMessage(String timestamp, String channelNameOrId, boolean asUser,
			String message) {
		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("ts", timestamp);
		map.add("channel", channelNameOrId);
		map.add("text", message);
		map.add("as_user", String.valueOf(asUser));

		SlackMessageResponse slackResponse = post("/chat.update", map, SlackMessageResponse.class);
		return slackResponse;
	}

	@Override
	public SlackMessageResponse updateMessage(String timestamp, String channelNameOrId, boolean asUser, String message,
			List<SlackAttachment> attachments, boolean linkNames) throws SlackException {

		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("ts", timestamp);
		map.add("channel", channelNameOrId);
		map.add("text", message);
		map.add("as_user", String.valueOf(asUser));

		if (attachments != null && !attachments.isEmpty()) {
			try {
				map.add("attachments", new ObjectMapper().writeValueAsString(attachments));
			} catch (JsonProcessingException e) {
				throw new SlackException(e);
			}
		}

		if (linkNames) {
			map.add("link_names", "1");
			map.add("parse", "full");
		} else {
			map.add("parse", "none");
		}

		SlackMessageResponse slackResponse = post("/chat.update", map, SlackMessageResponse.class);
		return slackResponse;

	}



}