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
package org.springframework.social.slack.connect;

import org.springframework.social.ApiException;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;
import org.springframework.social.slack.api.Slack;
import org.springframework.social.slack.api.impl.model.SlackPresence;
import org.springframework.social.slack.api.impl.model.SlackUser;

/**
 * Slack ApiAdapter implementation.
 * 
 * @author Thanneer
 */
public class SlackAdapter implements ApiAdapter<Slack> {

	@Override
	public boolean test(Slack api) {
		try {
			api.userProfileOperations().getUserProfile();
			return true;
		} catch (ApiException e) {
			return false;
		}
	}

	@Override
	public void setConnectionValues(Slack api, ConnectionValues values) {
		SlackUser profile = api.userProfileOperations().getUserProfile();
		values.setProviderUserId(profile.getId());
		values.setDisplayName(profile.getUserInfo().getRealName());
		values.setProfileUrl(profile.getUserInfo().getImage72());
		values.setImageUrl(profile.getUserInfo().getImage48());

	}

	@Override
	public UserProfile fetchUserProfile(Slack api) {
		SlackUser profile = api.userProfileOperations().getUserProfile();
		return new UserProfileBuilder().setName(profile.getName()).setFirstName(profile.getUserInfo().getFirstName()).setLastName(profile.getUserInfo().getLastName())
				.setEmail(profile.getUserInfo().getEmail()).build();
	}

	@Override
	public void updateStatus(Slack api, String message) {
		api.userProfileOperations().setStatus(SlackPresence.getEnum(message));

	}

}
