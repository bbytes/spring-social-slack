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

import org.springframework.social.slack.api.impl.model.SlackRTMResponse;
import org.springframework.social.slack.rtm.ProxyServer;
import org.springframework.social.slack.rtm.RTMClient;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Defines operations for interacting with real time messaging
 * 
 * @author Thanneer
 */
public interface RTMOperations {

	public SlackRTMResponse startRealTimeMessagingApi();

	public SlackRTMResponse startRealTimeMessagingApi(String simple_latest, String no_unreads, String mpim_aware);

	/**
	 * Get Slack Real Time Messaging Client to do rtm messaging
	 * 
	 * @param slackRTMResponse
	 * @return
	 */
	public RTMClient getRTMClient(SlackRTMResponse slackRTMResponse) throws Exception;

	/**
	 * Get Slack Real Time Messaging Client to do rtm messaging
	 * 
	 * @param slackRTMResponse
	 * @param proxyServer
	 *            can be null
	 * @return
	 */
	public RTMClient getRTMClient(SlackRTMResponse slackRTMResponse, ProxyServer proxyServer) throws Exception;

	/**
	 * Get Slack Real Time Messaging Client to do rtm messaging
	 * 
	 * @param slackRTMResponse
	 * @param proxyServer
	 *            can be null
	 * @param objectMapper
	 *            can be null
	 * @return
	 */
	public RTMClient getRTMClient(SlackRTMResponse slackRTMResponse, ProxyServer proxyServer, ObjectMapper objectMapper)
			throws Exception;
}
