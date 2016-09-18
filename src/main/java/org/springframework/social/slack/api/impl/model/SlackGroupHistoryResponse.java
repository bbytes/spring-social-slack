package org.springframework.social.slack.api.impl.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackGroupHistoryResponse extends SlackResponse {

	@JsonProperty("messages")
	private List<SlackMessage> messages = new ArrayList<SlackMessage>();

	@JsonProperty("has_more")
	private Boolean hasMore;

	public Boolean getHasMore() {
		return hasMore;
	}

	public void setHasMore(Boolean hasMore) {
		this.hasMore = hasMore;
	}

}
