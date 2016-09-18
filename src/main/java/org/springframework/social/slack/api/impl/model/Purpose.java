package org.springframework.social.slack.api.impl.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Purpose {

	@JsonProperty("value")
	private String value;
	
	@JsonProperty("creator")
	private String creator;
	
	@JsonProperty("last_set")
	private Integer lastSet;

	/**
	 * 
	 * @return The value
	 */
	@JsonProperty("value")
	public String getValue() {
		return value;
	}

	/**
	 * 
	 * @param value
	 *            The value
	 */
	@JsonProperty("value")
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * 
	 * @return The creator
	 */
	@JsonProperty("creator")
	public String getCreator() {
		return creator;
	}

	/**
	 * 
	 * @param creator
	 *            The creator
	 */
	@JsonProperty("creator")
	public void setCreator(String creator) {
		this.creator = creator;
	}

	/**
	 * 
	 * @return The lastSet
	 */
	@JsonProperty("last_set")
	public Integer getLastSet() {
		return lastSet;
	}

	/**
	 * 
	 * @param lastSet
	 *            The last_set
	 */
	@JsonProperty("last_set")
	public void setLastSet(Integer lastSet) {
		this.lastSet = lastSet;
	}

}