package org.springframework.social.slack.api.impl.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackGroupResponse extends SlackResponse {

	@JsonProperty("group")
	private SlackGroup group;

	
	public SlackGroup getGroup() {
		return group;
	}


	public void setGroup(SlackGroup group) {
		this.group = group;
	}


	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}