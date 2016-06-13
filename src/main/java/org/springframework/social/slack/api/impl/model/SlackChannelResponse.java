package org.springframework.social.slack.api.impl.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackChannelResponse extends SlackResponse {

	@JsonProperty("channel")
	private SlackChannel channel;

	@JsonProperty("channel")
	public SlackChannel getChannel() {
		return channel;
	}

	@JsonProperty("channel")
	public void setChannel(SlackChannel channel) {
		this.channel = channel;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}