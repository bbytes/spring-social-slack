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

import org.springframework.social.slack.api.impl.model.SlackChannelResponse;
import org.springframework.social.slack.api.impl.model.SlackDirectMsgChannelListResponse;
import org.springframework.social.slack.api.impl.model.SlackGroupListResponse;
import org.springframework.social.slack.api.impl.model.SlackGroupResponse;
import org.springframework.social.slack.api.impl.model.SlackHistoryResponse;
import org.springframework.social.slack.api.impl.model.SlackResponse;

/**
 * Defines operations for interacting with slack im
 * 
 * @author Thanneer
 */
public interface MessageOperations {

	public SlackResponse closeDirectMessageChannel(String channel);

	public SlackHistoryResponse getDirectMessageChannelHistory(String channel);

	public SlackHistoryResponse getDirectMessageChannelHistory(String channel, int count);

	public SlackHistoryResponse getDirectMessageChannelHistory(String channel, String latest, String oldest,
			boolean inclusive, int count, boolean unreads);

	public SlackDirectMsgChannelListResponse getDirectMessageChannelList();

	public SlackResponse markDirectMessageChannel(String channel, String ts);

	public SlackChannelResponse openDirectMessageChannel(String user);

	public SlackResponse closeMultipartyDirectMessageChannel(String channel);

	public SlackHistoryResponse getMultipartyDirectMessageChannelHistory(String channel);

	public SlackHistoryResponse getMultipartyDirectMessageChannelHistory(String channel, int count);

	public SlackHistoryResponse getMultipartyDirectMessageChannelHistory(String channel, String latest, String oldest,
			boolean inclusive, int count, boolean unreads);

	public SlackGroupListResponse getMultipartyDirectMessageChannelList();

	public SlackResponse markMultipartyDirectMessageChannel(String channel, String ts);

	public SlackGroupResponse openMultipartyDirectMessageChannel(String... users);
}
