
package org.springframework.social.slack.api.impl.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackDirectMsgChannelListResponse extends SlackResponse {

	@JsonProperty("ims")
	private List<SlackDirectMsgChannel> directMsgChannels = new ArrayList<SlackDirectMsgChannel>();

	@JsonProperty("ims")
	public List<SlackDirectMsgChannel> getDirectMsgChannels() {
		return directMsgChannels;
	}

	@JsonProperty("ims")
	public void setDirectMsgChannels(List<SlackDirectMsgChannel> directMsgChannels) {
		this.directMsgChannels = directMsgChannels;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
