package org.springframework.social.slack.api.impl.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackSetSnoozeResponse extends SlackResponse {

	@JsonProperty("snooze_enabled")
	private Boolean snoozeEnabled;
	@JsonProperty("snooze_endtime")
	private Integer snoozeEndtime;
	@JsonProperty("snooze_remaining")
	private Integer snoozeRemaining;

	/**
	 * 
	 * @return The snoozeEnabled
	 */
	@JsonProperty("snooze_enabled")
	public Boolean getSnoozeEnabled() {
		return snoozeEnabled;
	}

	/**
	 * 
	 * @param snoozeEnabled
	 *            The snooze_enabled
	 */
	@JsonProperty("snooze_enabled")
	public void setSnoozeEnabled(Boolean snoozeEnabled) {
		this.snoozeEnabled = snoozeEnabled;
	}

	/**
	 * 
	 * @return The snoozeEndtime
	 */
	@JsonProperty("snooze_endtime")
	public Integer getSnoozeEndtime() {
		return snoozeEndtime;
	}

	/**
	 * 
	 * @param snoozeEndtime
	 *            The snooze_endtime
	 */
	@JsonProperty("snooze_endtime")
	public void setSnoozeEndtime(Integer snoozeEndtime) {
		this.snoozeEndtime = snoozeEndtime;
	}

	/**
	 * 
	 * @return The snoozeRemaining
	 */
	@JsonProperty("snooze_remaining")
	public Integer getSnoozeRemaining() {
		return snoozeRemaining;
	}

	/**
	 * 
	 * @param snoozeRemaining
	 *            The snooze_remaining
	 */
	@JsonProperty("snooze_remaining")
	public void setSnoozeRemaining(Integer snoozeRemaining) {
		this.snoozeRemaining = snoozeRemaining;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
