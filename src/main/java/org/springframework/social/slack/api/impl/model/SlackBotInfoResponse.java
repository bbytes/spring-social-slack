package org.springframework.social.slack.api.impl.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackBotInfoResponse extends SlackResponse {

	@JsonProperty("bot")
	private SlackBotInfo botInfo;

	public SlackBotInfo getBotInfo() {
		return botInfo;
	}

	public void setBotInfo(SlackBotInfo botInfo) {
		this.botInfo = botInfo;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
