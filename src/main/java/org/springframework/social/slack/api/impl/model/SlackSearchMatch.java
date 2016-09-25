package org.springframework.social.slack.api.impl.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackSearchMatch {

	@JsonProperty("type")
	private String type;

	@JsonProperty("user")
	private String user;

	@JsonProperty("username")
	private String username;

	@JsonProperty("ts")
	private String ts;

	@JsonProperty("team")
	private String team;

	@JsonProperty("attachments")
	private List<SlackAttachment> attachments = new ArrayList<SlackAttachment>();

	@JsonProperty("channel")
	private SlackChannel channel;

	@JsonProperty("permalink")
	private String permalink;

	@JsonProperty("text")
	private String text;

	public String getType() {
		return type;
	}

	public String getUser() {
		return user;
	}

	public String getUsername() {
		return username;
	}

	public String getTs() {
		return ts;
	}

	public String getTeam() {
		return team;
	}

	public List<SlackAttachment> getAttachments() {
		return attachments;
	}

	public SlackChannel getChannel() {
		return channel;
	}

	public String getPermalink() {
		return permalink;
	}

	public String getText() {
		return text;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setAttachments(List<SlackAttachment> attachments) {
		this.attachments = attachments;
	}

	public void setChannel(SlackChannel channel) {
		this.channel = channel;
	}

	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
