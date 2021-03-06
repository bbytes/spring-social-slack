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
package org.springframework.social.slack.api;

import java.util.List;

import org.springframework.social.slack.api.impl.model.SlackChannel;
import org.springframework.social.slack.api.impl.model.SlackResponse;

/**
* Defines operations for interacting with a lack User
* @author Thanneer
*/
public interface ChannelOperations {

	public SlackResponse archiveChannel(String channelId);
	
	public SlackResponse unarchiveChannel(String channelId);
	
	public SlackChannel createChannel(String channelName);

	public  SlackChannel findChannelById(String channelId);
	
	/**
	 * Doesnt return archived channels.
	 */
	public List<SlackChannel> getAllChannels();

}
