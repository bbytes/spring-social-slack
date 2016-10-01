package org.springframework.social.slack.api.impl.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackItem {

	@JsonProperty("type")
	private String type;

	@JsonProperty("file")
	private SlackFile slackFile;

	@JsonProperty("created")
	private Integer created;

	@JsonProperty("comment")
	private SlackComment comments;

	public String getType() {
		return type;
	}

	public SlackFile getSlackFile() {
		return slackFile;
	}

	public Integer getCreated() {
		return created;
	}

	public SlackComment getComments() {
		return comments;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSlackFile(SlackFile slackFile) {
		this.slackFile = slackFile;
	}

	public void setCreated(Integer created) {
		this.created = created;
	}

	public void setComments(SlackComment comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}