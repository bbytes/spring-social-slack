package org.springframework.social.slack.api.impl.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackUserInfoResponse extends SlackResponse {

	@JsonProperty("user")
	private SlackUser user;

	/**
	 *
	 * @return The user
	 */
	@JsonProperty("user")
	public SlackUser getUser() {
		return user;
	}

	/**
	 *
	 * @param user
	 *            The user
	 */
	@JsonProperty("user")
	public void setUser(SlackUser user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}