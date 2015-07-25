
package org.springframework.social.slack.api.impl.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackTeamInfoResponse extends SlackResponse {

	@JsonProperty("team")
	private SlackTeamInfo team;

	/**
	 * 
	 * @return The team
	 */
	@JsonProperty("team")
	public SlackTeamInfo getTeam() {
		return team;
	}

	/**
	 * 
	 * @param team
	 *            The team
	 */
	@JsonProperty("team")
	public void setTeam(SlackTeamInfo team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
