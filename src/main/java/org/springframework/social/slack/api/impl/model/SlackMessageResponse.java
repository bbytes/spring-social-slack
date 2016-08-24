package org.springframework.social.slack.api.impl.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackMessageResponse implements Serializable{

	private static final long serialVersionUID = -2400298533894363125L;

	@JsonProperty("ok")
	public Boolean ok;

	@JsonProperty("channel")
	private String channel;

	@JsonProperty("ts")
	private String timeStamp;

	@JsonProperty("message")
	private SlackMessage message;

	public Boolean isOk() {
		return ok;
	}

	public void setOk(Boolean ok) {
		this.ok = ok;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public SlackMessage getMessage() {
		return message;
	}

	public void setMessage(SlackMessage message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}