package org.springframework.social.slack.api.impl.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackReactionItem {

	@JsonProperty("type")
	private String type;

	@JsonProperty("channel")
	private String channel;

	@JsonProperty("message")
	private SlackReactionMessage message;

	public String getType() {
		return type;
	}

	public String getChannel() {
		return channel;
	}

	public SlackReactionMessage getMessage() {
		return message;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public void setMessage(SlackReactionMessage message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}