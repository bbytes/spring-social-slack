package org.springframework.social.slack.api.impl.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DndSimpleInfo {

	@JsonProperty("dnd_enabled")
	private Boolean dndEnabled;
	@JsonProperty("next_dnd_start_ts")
	private Integer nextDndStartTs;
	@JsonProperty("next_dnd_end_ts")
	private Integer nextDndEndTs;

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

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
