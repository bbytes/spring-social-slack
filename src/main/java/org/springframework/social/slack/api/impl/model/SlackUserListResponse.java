package org.springframework.social.slack.api.impl.model;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackUserListResponse extends SlackResponse {

	@JsonProperty("members")
	private List<SlackUser> userList;

	@JsonProperty("members")
	public List<SlackUser> getUserList() {
		return userList;
	}

	@JsonProperty("members")
	public void setUserList(List<SlackUser> userList) {
		this.userList = userList;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}