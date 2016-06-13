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

import org.springframework.social.slack.api.ChannelOperations;
import org.springframework.social.slack.api.impl.model.SlackChannel;
import org.springframework.social.slack.api.impl.model.SlackChannelAllResponse;
import org.springframework.social.slack.api.impl.model.SlackChannelResponse;
import org.springframework.social.slack.api.impl.model.SlackResponse;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;

/**
 * Defines operations for interacting with slack team
 * 
 * @author Thanneer
 */
public class ChannelTemplate extends AbstractTemplate implements ChannelOperations {

	public ChannelTemplate(RestOperations restOperations) {
		super(restOperations);
	}

	@Override
	public SlackResponse archiveChannel(String channelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SlackChannel createChannel(String channelName) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public SlackChannel findChannelById(String channelId) {
		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("channel",channelId);
		SlackChannelResponse slackChannelResponse = get("/channels.info", map, SlackChannelResponse.class);
		return slackChannelResponse.getChannel();
	}

	/**
	 * Doesnt return archived channels.
	 */
	@Override
	public List<SlackChannel> getAllChannels() {
		SlackChannelAllResponse channelAllResponse = get("/channels.list", SlackChannelAllResponse.class);
		return channelAllResponse.getChannelList();
	}

	
}
