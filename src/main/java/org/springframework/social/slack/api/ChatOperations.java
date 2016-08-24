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

import org.springframework.social.slack.api.impl.SlackException;
import org.springframework.social.slack.api.impl.model.Attachment;
import org.springframework.social.slack.api.impl.model.SlackMessageResponse;

/**
 * Defines operations for interacting with a lack User
 * 
 * @author Thanneer
 */
public interface ChatOperations {

	public SlackMessageResponse postMessage(String message, String channelNameOrId);

	public SlackMessageResponse meMessage(String message, String channelNameOrId);

	public SlackMessageResponse postMessage(String channel, String text, String username, boolean asUser,
			boolean linkNames, List<Attachment> attachments, boolean unfurlLinks, boolean unfurlMedia,
			String icon_url, String icon_emoji) throws SlackException;

	public SlackMessageResponse deleteMessage(String timestamp, String channelNameOrId, boolean asUser);

	public SlackMessageResponse updateMessage(String timestamp, String channelNameOrId, boolean asUser, String message);

	public SlackMessageResponse updateMessage(String timestamp, String channelNameOrId, boolean asUser, String message,
			List<Attachment> attachments, boolean linkNames) throws SlackException;
}
