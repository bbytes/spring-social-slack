package org.springframework.social.slack.api.impl.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackItemListResponse extends SlackResponse{

	@JsonProperty("items")
	private List<SlackItem> itemList;

	public List<SlackItem> getItemList() {
		return itemList;
	}

	public void setItemList(List<SlackItem> itemList) {
		this.itemList = itemList;
	}
}
