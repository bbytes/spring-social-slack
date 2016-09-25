package org.springframework.social.slack.api;

import org.springframework.social.slack.api.impl.model.SlackResponse;
import org.springframework.social.slack.api.impl.model.SlackStarItemListResponse;

public interface StarOperations {

	public SlackResponse addStarToFile(String file);
	
	public SlackResponse addStarToFileComment(String file_comment);
	
	public SlackResponse addStarToMessage(String channel, String timestamp);
	
	public SlackStarItemListResponse getStarList(int page);
	
	public SlackStarItemListResponse getStarList(int page, int count);
	
	public SlackStarItemListResponse getStarList(String user, int page);
	
	public SlackStarItemListResponse getStarList(String user, int page, int count);
	
	public SlackResponse removeStarFromFile(String file);
	
	public SlackResponse removeStarFromFileComment(String file_comment);
	
	public SlackResponse removeStarFromMessage(String channel, String timestamp);
}
