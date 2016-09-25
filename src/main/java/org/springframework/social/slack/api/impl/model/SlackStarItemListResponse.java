package org.springframework.social.slack.api.impl.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackStarItemListResponse extends SlackResponse {

	@JsonProperty("items")
	private List<SlackStarItem> items;
	
	@JsonProperty("paging")
	private Paging paging;

	public List<SlackStarItem> getItems() {
		return items;
	}

	public Paging getPaging() {
		return paging;
	}

	public void setItems(List<SlackStarItem> items) {
		this.items = items;
	}

	public void setPaging(Paging paging) {
		this.paging = paging;
	}
	
}
