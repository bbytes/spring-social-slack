package org.springframework.social.slack.api.impl.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackBotInfo {

	@JsonProperty("id")
	private String id;
	@JsonProperty("deleted")
	private Boolean deleted;
	@JsonProperty("name")
	private String name;
	@JsonProperty("icons")
	private Icon icons;
	@JsonIgnore
	
	/**
	 * 
	 * @return The id
	 */
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The id
	 */
	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 
	 * @return The deleted
	 */
	@JsonProperty("deleted")
	public Boolean getDeleted() {
		return deleted;
	}

	/**
	 * 
	 * @param deleted
	 *            The deleted
	 */
	@JsonProperty("deleted")
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	/**
	 * 
	 * @return The name
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            The name
	 */
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return The icons
	 */
	@JsonProperty("icons")
	public Icon getIcons() {
		return icons;
	}

	/**
	 * 
	 * @param icons
	 *            The icons
	 */
	@JsonProperty("icons")
	public void setIcons(Icon icons) {
		this.icons = icons;
	}

}
