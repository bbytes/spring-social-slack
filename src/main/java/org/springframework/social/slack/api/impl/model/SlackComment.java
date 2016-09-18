package org.springframework.social.slack.api.impl.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackComment {

	@JsonProperty("id")
	private String id;
	@JsonProperty("timestamp")
	private Integer timestamp;
	@JsonProperty("user")
	private String user;
	@JsonProperty("comment")
	private String comment;
	@JsonProperty("channel")
	private String channel;
	
	

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
	 * @return The timestamp
	 */
	@JsonProperty("timestamp")
	public Integer getTimestamp() {
		return timestamp;
	}

	/**
	 * 
	 * @param timestamp
	 *            The timestamp
	 */
	@JsonProperty("timestamp")
	public void setTimestamp(Integer timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * 
	 * @return The user
	 */
	@JsonProperty("user")
	public String getUser() {
		return user;
	}

	/**
	 * 
	 * @param user
	 *            The user
	 */
	@JsonProperty("user")
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * 
	 * @return The comment
	 */
	@JsonProperty("comment")
	public String getComment() {
		return comment;
	}

	/**
	 * 
	 * @param comment
	 *            The comment
	 */
	@JsonProperty("comment")
	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

}
