
package org.springframework.social.slack.api.impl.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackMessage implements Serializable{

	
	private static final long serialVersionUID = 2930666680528350166L;
	
	@JsonProperty("type")
	private String type;
	@JsonProperty("user")
	private String user;
	@JsonProperty("text")
	private String text;
	@JsonProperty("bot_id")
	private String botId;
	@JsonProperty("subtype")
	private String subtype;
	@JsonProperty("ts")
	private String ts;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getBotId() {
		return botId;
	}

	public void setBotId(String botId) {
		this.botId = botId;
	}

	public String getTs() {
		return ts;
	}

	public void setTs(String ts) {
		this.ts = ts;
	}



	public String getSubtype() {
		return subtype;
	}

	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
