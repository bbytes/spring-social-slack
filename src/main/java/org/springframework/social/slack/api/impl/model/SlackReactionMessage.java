package org.springframework.social.slack.api.impl.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackReactionMessage {

	@JsonProperty("text")
	private String text;
	
	@JsonProperty("username")
	private String username;
	
	@JsonProperty("bot_id")
	private String botId;
	
	@JsonProperty("attachments")
	private List<SlackAttachment> attachments = new ArrayList<SlackAttachment>();
	
	@JsonProperty("type")
	private String type;
	
	@JsonProperty("subtype")
	private String subtype;
	
	@JsonProperty("ts")
	private String ts;
	
	@JsonProperty("permalink")
	private String permalink;
	
	@JsonProperty("reactions")
	private List<SlackReaction> reactions = new ArrayList<SlackReaction>();

	public String getText() {
		return text;
	}

	public String getUsername() {
		return username;
	}

	public String getBotId() {
		return botId;
	}

	public List<SlackAttachment> getAttachments() {
		return attachments;
	}

	public String getType() {
		return type;
	}

	public String getSubtype() {
		return subtype;
	}

	public String getTs() {
		return ts;
	}

	public String getPermalink() {
		return permalink;
	}

	public List<SlackReaction> getReactions() {
		return reactions;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setBotId(String botId) {
		this.botId = botId;
	}

	public void setAttachments(List<SlackAttachment> attachments) {
		this.attachments = attachments;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}

	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

	public void setReactions(List<SlackReaction> reactions) {
		this.reactions = reactions;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
