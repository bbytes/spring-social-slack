
package org.springframework.social.slack.api.impl.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class Item {

	@JsonProperty("type")
	private String type;
	@JsonProperty("channel")
	private String channel;
	@JsonProperty("message")
	private JsonNode message;
	@JsonProperty("file")
	private JsonNode file;
	@JsonProperty("comment")
	private JsonNode comment;

	/**
	 * 
	 * @return The type
	 */
	@JsonProperty("type")
	public String getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 *            The type
	 */
	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 
	 * @return The channel
	 */
	@JsonProperty("channel")
	public String getChannel() {
		return channel;
	}

	/**
	 * 
	 * @param channel
	 *            The channel
	 */
	@JsonProperty("channel")
	public void setChannel(String channel) {
		this.channel = channel;
	}

	/**
	 * 
	 * @return The message
	 */
	@JsonProperty("message")
	public JsonNode getMessage() {
		return message;
	}

	/**
	 * 
	 * @param message
	 *            The message
	 */
	@JsonProperty("message")
	public void setMessage(JsonNode message) {
		this.message = message;
	}

	/**
	 * 
	 * @return The file
	 */
	@JsonProperty("file")
	public JsonNode getFile() {
		return file;
	}

	/**
	 * 
	 * @param file
	 *            The file
	 */
	@JsonProperty("file")
	public void setFile(JsonNode file) {
		this.file = file;
	}

	/**
	 * 
	 * @return The comment
	 */
	@JsonProperty("comment")
	public JsonNode getComment() {
		return comment;
	}

	/**
	 * 
	 * @param comment
	 *            The comment
	 */
	@JsonProperty("comment")
	public void setComment(JsonNode comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
