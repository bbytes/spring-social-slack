
package org.springframework.social.slack.api.impl.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackAccessLogResponse extends SlackResponse {

	@JsonProperty("logins")
	private List<SlackAccessLogs> accessLogs = new ArrayList<SlackAccessLogs>();
	@JsonProperty("paging")
	private Paging paging;

	/**
	 * 
	 * @return The logins
	 */
	@JsonProperty("logins")
	public List<SlackAccessLogs> getAccessLogs() {
		return accessLogs;
	}

	/**
	 * 
	 * @param logins
	 *            The logins
	 */
	@JsonProperty("logins")
	public void setAccessLogs(List<SlackAccessLogs> accessLogs) {
		this.accessLogs = accessLogs;
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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
