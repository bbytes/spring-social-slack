package org.springframework.social.slack.api.impl.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackReminder {

	@JsonProperty("id")
	private String id;

	@JsonProperty("creator")
	private String creator;

	@JsonProperty("user")
	private String user;

	@JsonProperty("text")
	private String text;

	@JsonProperty("recurring")
	private Boolean recurring;

	@JsonProperty("time")
	private Integer time;

	@JsonProperty("complete_ts")
	private Integer completeTs;

	public String getId() {
		return id;
	}

	public String getCreator() {
		return creator;
	}

	public String getUser() {
		return user;
	}

	public String getText() {
		return text;
	}

	public Boolean getRecurring() {
		return recurring;
	}

	public Integer getTime() {
		return time;
	}

	public Integer getCompleteTs() {
		return completeTs;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setRecurring(Boolean recurring) {
		this.recurring = recurring;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public void setCompleteTs(Integer completeTs) {
		this.completeTs = completeTs;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
