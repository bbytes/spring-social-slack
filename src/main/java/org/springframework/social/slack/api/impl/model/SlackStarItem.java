package org.springframework.social.slack.api.impl.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackStarItem {

	@JsonProperty("type")
	private String type;
	
	@JsonProperty("channel")
	private String channel;
	
	@JsonProperty("message")
	private SlackMessage message;
	
	@JsonProperty("file")
	private SlackFile file;
	
	@JsonProperty("comment")
	private SlackComment comment;

	public String getType() {
		return type;
	}

	public String getChannel() {
		return channel;
	}

	public SlackMessage getMessage() {
		return message;
	}

	public SlackFile getFile() {
		return file;
	}

	public SlackComment getComment() {
		return comment;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public void setMessage(SlackMessage message) {
		this.message = message;
	}

	public void setFile(SlackFile file) {
		this.file = file;
	}

	public void setComment(SlackComment comment) {
		this.comment = comment;
	}
}
