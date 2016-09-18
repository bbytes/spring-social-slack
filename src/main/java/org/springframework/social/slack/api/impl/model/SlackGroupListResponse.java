package org.springframework.social.slack.api.impl.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackGroupListResponse extends SlackResponse {

	@JsonProperty("groups")
	private List<SlackGroup> grouplList;

	public List<SlackGroup> getGrouplList() {
		return grouplList;
	}

	public void setGrouplList(List<SlackGroup> grouplList) {
		this.grouplList = grouplList;
	}

}
