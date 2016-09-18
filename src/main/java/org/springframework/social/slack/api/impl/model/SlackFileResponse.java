package org.springframework.social.slack.api.impl.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackFileResponse extends SlackResponse {

	@JsonProperty("file")
	private SlackFile file;

	public SlackFile getFile() {
		return file;
	}

	public void setFile(SlackFile file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
