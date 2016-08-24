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

import org.springframework.social.slack.api.TeamOperations;
import org.springframework.social.slack.api.impl.model.SlackAccessLogResponse;
import org.springframework.social.slack.api.impl.model.SlackAccessLogs;
import org.springframework.social.slack.api.impl.model.SlackTeamInfo;
import org.springframework.social.slack.api.impl.model.SlackTeamInfoResponse;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;

/**
 * Defines operations for interacting with slack team
 * 
 * @author Thanneer
 */
public class TeamTemplate extends AbstractTemplate implements TeamOperations {

	public TeamTemplate(RestOperations restOperations) {
		super(restOperations);
	}

	@Override
	public List<SlackAccessLogs> getAccessLogs(Integer count, Integer page) {
		MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
		map.add("count", Integer.toString(count));
		map.add("page", Integer.toString(page));
		SlackAccessLogResponse accessLogResponse = get("/team.accessLogs", map, SlackAccessLogResponse.class);
		return accessLogResponse.getAccessLogs();
	}

	@Override
	public SlackTeamInfo getTeamInfo() {
		SlackTeamInfoResponse slackTeamInfoResponse = get("/team.info", SlackTeamInfoResponse.class);
		return slackTeamInfoResponse.getTeam();
	}

}
