package org.springframework.social.slack.api.impl.model;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackChannelAllResponse extends SlackResponse {

	@JsonProperty("channels")
	private List<SlackChannel> channelList;

	@JsonProperty("channels")
	public List<SlackChannel> getChannelList() {
		return channelList;
	}

	@JsonProperty("channels")
	public void setChannelList(List<SlackChannel> channelList) {
		this.channelList = channelList;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}