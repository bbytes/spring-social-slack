package org.springframework.social.slack.api.impl.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackAuthInfo {

	@JsonProperty("ok")
	private Boolean ok;
	@JsonProperty("url")
	private String url;
	@JsonProperty("team")
	private String team;
	@JsonProperty("user")
	private String user;
	@JsonProperty("team_id")
	private String teamId;
	@JsonProperty("user_id")
	private String userId;
	
	/**
	*
	* @return
	* The ok
	*/
	@JsonProperty("ok")
	public Boolean getOk() {
	return ok;
	}

	/**
	*
	* @param ok
	* The ok
	*/
	@JsonProperty("ok")
	public void setOk(Boolean ok) {
	this.ok = ok;
	}

	/**
	*
	* @return
	* The url
	*/
	@JsonProperty("url")
	public String getUrl() {
	return url;
	}

	/**
	*
	* @param url
	* The url
	*/
	@JsonProperty("url")
	public void setUrl(String url) {
	this.url = url;
	}

	/**
	*
	* @return
	* The team
	*/
	@JsonProperty("team")
	public String getTeam() {
	return team;
	}

	/**
	*
	* @param team
	* The team
	*/
	@JsonProperty("team")
	public void setTeam(String team) {
	this.team = team;
	}

	/**
	*
	* @return
	* The user
	*/
	@JsonProperty("user")
	public String getUser() {
	return user;
	}

	/**
	*
	* @param user
	* The user
	*/
	@JsonProperty("user")
	public void setUser(String user) {
	this.user = user;
	}

	/**
	*
	* @return
	* The teamId
	*/
	@JsonProperty("team_id")
	public String getTeamId() {
	return teamId;
	}

	/**
	*
	* @param teamId
	* The team_id
	*/
	@JsonProperty("team_id")
	public void setTeamId(String teamId) {
	this.teamId = teamId;
	}

	/**
	*
	* @return
	* The userId
	*/
	@JsonProperty("user_id")
	public String getUserId() {
	return userId;
	}

	/**
	*
	* @param userId
	* The user_id
	*/
	@JsonProperty("user_id")
	public void setUserId(String userId) {
	this.userId = userId;
	}

}