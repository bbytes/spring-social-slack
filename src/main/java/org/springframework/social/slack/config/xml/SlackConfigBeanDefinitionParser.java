package org.springframework.social.slack.config.xml;

/*
 * Copyright 2013 the original author or authors.
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

import java.util.Map;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.social.config.xml.AbstractProviderConfigBeanDefinitionParser;
import org.springframework.social.security.provider.SocialAuthenticationService;
import org.springframework.social.slack.config.support.SlackApiHelper;
import org.springframework.social.slack.connect.SlackConnectionFactory;
import org.springframework.social.slack.security.SlackAuthenticationService;

/**
 * Implementation of {@link AbstractConnectionFactoryBeanDefinitionParser} that creates a {@link SlackConnectionFactory}.
 * @author Thanneer
 */
public class SlackConfigBeanDefinitionParser extends AbstractProviderConfigBeanDefinitionParser {

	public SlackConfigBeanDefinitionParser() {
		super(SlackConnectionFactory.class, SlackApiHelper.class);
	}
	
	@Override
	protected Class<? extends SocialAuthenticationService<?>> getAuthenticationServiceClass() {
		return SlackAuthenticationService.class;
	}

	@Override
	protected BeanDefinition getAuthenticationServiceBeanDefinition(
			String appId, String appSecret, Map<String, Object> allAttributes) {
		return BeanDefinitionBuilder.genericBeanDefinition(authenticationServiceClass).addConstructorArgValue(appId).addConstructorArgValue(appSecret).addConstructorArgValue(getRedirectUri(allAttributes)).getBeanDefinition();
	}

	@Override
	protected BeanDefinition getConnectionFactoryBeanDefinition(String appId, String appSecret, Map<String, Object> allAttributes) {
		BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(SlackConnectionFactory.class).addConstructorArgValue(appId).addConstructorArgValue(appSecret);
		builder.addConstructorArgValue(getRedirectUri(allAttributes));			
		return builder.getBeanDefinition();
	}
	
	protected String getRedirectUri(Map<String, Object> allAttributes) {
		if (allAttributes.containsKey("redirect-uri")) {
			String redirectUri = (String)allAttributes.get("redirect-uri");
			return redirectUri.isEmpty() ? null : redirectUri;	
		}
		else
		{
			return null;
		}
	}

}
