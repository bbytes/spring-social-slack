package org.springframework.social.slack.api.impl.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackRTMResponse extends SlackResponse{

	@JsonProperty("url")
	private String webSocketURL;
	
	@JsonProperty("team")
	private SlackTeamInfo slackTeamInfo;
	
	@JsonProperty("self")
	private SlackUser currentUser;
	
	@JsonProperty("channels")
	private List<SlackChannel> channelList;
	
	@JsonProperty("groups")
	private List<SlackGroup> grouplList;
	
	@JsonProperty("ims")
	private List<SlackDirectMsgChannel> directMsgChannels;
	
	
	@JsonProperty("users")
	private List<SlackUser> userList;


	public String getWebSocketURL() {
		return webSocketURL;
	}


	public SlackTeamInfo getSlackTeamInfo() {
		return slackTeamInfo;
	}


	public SlackUser getCurrentUser() {
		return currentUser;
	}


	public List<SlackChannel> getChannelList() {
		return channelList;
	}


	public List<SlackGroup> getGrouplList() {
		return grouplList;
	}


	public List<SlackDirectMsgChannel> getDirectMsgChannels() {
		return directMsgChannels;
	}


	public List<SlackUser> getUserList() {
		return userList;
	}


	public void setWebSocketURL(String webSocketURL) {
		this.webSocketURL = webSocketURL;
	}


	public void setSlackTeamInfo(SlackTeamInfo slackTeamInfo) {
		this.slackTeamInfo = slackTeamInfo;
	}


	public void setCurrentUser(SlackUser currentUser) {
		this.currentUser = currentUser;
	}


	public void setChannelList(List<SlackChannel> channelList) {
		this.channelList = channelList;
	}


	public void setGrouplList(List<SlackGroup> grouplList) {
		this.grouplList = grouplList;
	}


	public void setDirectMsgChannels(List<SlackDirectMsgChannel> directMsgChannels) {
		this.directMsgChannels = directMsgChannels;
	}


	public void setUserList(List<SlackUser> userList) {
		this.userList = userList;
	}


	}
