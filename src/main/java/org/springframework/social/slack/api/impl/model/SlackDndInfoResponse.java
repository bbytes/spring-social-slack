package org.springframework.social.slack.api.impl.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackDndInfoResponse extends SlackResponse{

	@JsonProperty("dnd_enabled")
	private Boolean dndEnabled;
	@JsonProperty("next_dnd_start_ts")
	private Integer nextDndStartTs;
	@JsonProperty("next_dnd_end_ts")
	private Integer nextDndEndTs;
	@JsonProperty("snooze_enabled")
	private Boolean snoozeEnabled;
	@JsonProperty("snooze_endtime")
	private Integer snoozeEndtime;
	@JsonProperty("snooze_remaining")
	private Integer snoozeRemaining;

	/**
	 * 
	 * @return The dndEnabled
	 */
	@JsonProperty("dnd_enabled")
	public Boolean getDndEnabled() {
		return dndEnabled;
	}

	/**
	 * 
	 * @param dndEnabled
	 *            The dnd_enabled
	 */
	@JsonProperty("dnd_enabled")
	public void setDndEnabled(Boolean dndEnabled) {
		this.dndEnabled = dndEnabled;
	}

	/**
	 * 
	 * @return The nextDndStartTs
	 */
	@JsonProperty("next_dnd_start_ts")
	public Integer getNextDndStartTs() {
		return nextDndStartTs;
	}

	/**
	 * 
	 * @param nextDndStartTs
	 *            The next_dnd_start_ts
	 */
	@JsonProperty("next_dnd_start_ts")
	public void setNextDndStartTs(Integer nextDndStartTs) {
		this.nextDndStartTs = nextDndStartTs;
	}

	/**
	 * 
	 * @return The nextDndEndTs
	 */
	@JsonProperty("next_dnd_end_ts")
	public Integer getNextDndEndTs() {
		return nextDndEndTs;
	}

	/**
	 * 
	 * @param nextDndEndTs
	 *            The next_dnd_end_ts
	 */
	@JsonProperty("next_dnd_end_ts")
	public void setNextDndEndTs(Integer nextDndEndTs) {
		this.nextDndEndTs = nextDndEndTs;
	}

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
