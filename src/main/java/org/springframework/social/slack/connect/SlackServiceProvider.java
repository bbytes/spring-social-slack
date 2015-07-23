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

import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.slack.api.Slack;
import org.springframework.social.slack.api.impl.SlackTemplate;

/**
* Slack ServiceProvider implementation.
* @author Thanneer
*/
public class SlackServiceProvider extends AbstractOAuth2ServiceProvider<Slack>{

	private String clientId;
	
	public SlackServiceProvider(String clientId, String clientSecret) {
		this(clientId, clientSecret, null);
	}
	

	public SlackServiceProvider(String clientId, String clientSecret, String redirectUri) {
		super(new SlackOAuth2Template(clientId, clientSecret, redirectUri));
	}

	@Override
	public Slack getApi(String accessToken) {
		return new SlackTemplate(clientId, accessToken);
	}

}
