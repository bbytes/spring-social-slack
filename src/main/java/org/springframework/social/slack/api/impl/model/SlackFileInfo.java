package org.springframework.social.slack.api.impl.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackFileInfo extends SlackResponse {

	@JsonProperty("file")
	private SlackFile file;

	@JsonProperty("comments")
	private List<SlackComment> comments = new ArrayList<SlackComment>();

	@JsonProperty("paging")
	private Paging paging;

	/**
	 * 
	 * @return The file
	 */
	@JsonProperty("file")
	public SlackFile getFile() {
		return file;
	}

	/**
	 * 
	 * @param file
	 *            The file
	 */
	@JsonProperty("file")
	public void setFile(SlackFile file) {
		this.file = file;
	}

	/**
	 * 
	 * @return The comments
	 */
	@JsonProperty("comments")
	public List<SlackComment> getComments() {
		return comments;
	}

	/**
	 * 
	 * @param comments
	 *            The comments
	 */
	@JsonProperty("comments")
	public void setComments(List<SlackComment> comments) {
		this.comments = comments;
	}

	/**
	 * 
	 * @return The paging
	 */
	@JsonProperty("paging")
	public Paging getPaging() {
		return paging;
	}

	/**
	 * 
	 * @param paging
	 *            The paging
	 */
	@JsonProperty("paging")
	public void setPaging(Paging paging) {
		this.paging = paging;
	}

}
