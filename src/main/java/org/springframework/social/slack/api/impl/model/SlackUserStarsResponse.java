
package org.springframework.social.slack.api.impl.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackUserStarsResponse extends SlackResponse {

	@JsonProperty("items")
	private List<Item> items = new ArrayList<Item>();
	@JsonProperty("paging")
	private Paging paging;

	/**
	 * 
	 * @return The items
	 */
	@JsonProperty("items")
	public List<Item> getItems() {
		return items;
	}

	/**
	 * 
	 * @param items
	 *            The items
	 */
	@JsonProperty("items")
	public void setItems(List<Item> items) {
		this.items = items;
	}

	/**
	 * 
	 * @return The paging
	 */
	@JsonProperty("paging")
	public Paging getPaging() {
		return paging;
	}

	/**
	 * 
	 * @param paging
	 *            The paging
	 */
	@JsonProperty("paging")
	public void setPaging(Paging paging) {
		this.paging = paging;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
