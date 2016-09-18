package org.springframework.social.slack.api.impl.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackCommentResponse extends SlackResponse{

	@JsonProperty("comment")
	private SlackComment comment;

	public SlackComment getComment() {
		return comment;
	}

	public void setComment(SlackComment comment) {
		this.comment = comment;
	}
	

}
