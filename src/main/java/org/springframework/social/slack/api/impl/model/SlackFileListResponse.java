package org.springframework.social.slack.api.impl.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackFileListResponse extends SlackResponse {

	@JsonProperty("files")
	private List<SlackFile> files;

	@JsonProperty("paging")
	private Paging paging;

	@JsonProperty("files")
	public List<SlackFile> getFiles() {
		return files;
	}

	@JsonProperty("paging")
	public Paging getPaging() {
		return paging;
	}

	@JsonProperty("files")
	public void setFiles(List<SlackFile> files) {
		this.files = files;
	}

	@JsonProperty("paging")
	public void setPaging(Paging paging) {
		this.paging = paging;
	}

}
