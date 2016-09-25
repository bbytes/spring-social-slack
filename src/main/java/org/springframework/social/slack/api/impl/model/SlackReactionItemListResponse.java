package org.springframework.social.slack.api.impl.model;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackReactionItemListResponse extends SlackResponse {

	@JsonProperty("items")
	private List<SlackReactionItem> reactionItems;

	@JsonProperty("paging")
	private Paging paging;

	public List<SlackReactionItem> getReactionItems() {
		return reactionItems;
	}

	public Paging getPaging() {
		return paging;
	}

	public void setReactionItems(List<SlackReactionItem> reactionItems) {
		this.reactionItems = reactionItems;
	}

	public void setPaging(Paging paging) {
		this.paging = paging;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
