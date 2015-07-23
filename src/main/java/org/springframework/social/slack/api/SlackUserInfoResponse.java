package org.springframework.social.slack.api;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackUserInfoResponse {

	@JsonProperty("ok")
	private Boolean ok;

	@JsonProperty("user")
	private SlackUser user;

	/**
	 *
	 * @return The ok
	 */
	@JsonProperty("ok")
	public Boolean isOk() {
		return ok;
	}

	/**
	 *
	 * @param ok
	 *            The ok
	 */
	@JsonProperty("ok")
	public void setOk(Boolean ok) {
		this.ok = ok;
	}

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