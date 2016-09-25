package org.springframework.social.slack.api.impl.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackSearchResponse extends SlackResponse {

	@JsonProperty("query")
	private String query;
	
	@JsonProperty("messages")
	private SlackSearchListResponse messages;
	
	@JsonProperty("files")
	private SlackSearchListResponse files;
	
	@JsonProperty("posts")
	private SlackSearchListResponse posts;

	public String getQuery() {
		return query;
	}

	public SlackSearchListResponse getMessages() {
		return messages;
	}

	public SlackSearchListResponse getFiles() {
		return files;
	}

	public SlackSearchListResponse getPosts() {
		return posts;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public void setMessages(SlackSearchListResponse messages) {
		this.messages = messages;
	}

	public void setFiles(SlackSearchListResponse files) {
		this.files = files;
	}

	public void setPosts(SlackSearchListResponse posts) {
		this.posts = posts;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
