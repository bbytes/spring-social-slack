package org.springframework.social.slack.api.impl;

import org.springframework.social.slack.api.ReactionOperations;
import org.springframework.social.slack.api.impl.model.SlackReactionItemListResponse;
import org.springframework.social.slack.api.impl.model.SlackResponse;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;

public class ReactionTemplate extends AbstractTemplate implements ReactionOperations {

	public ReactionTemplate(RestOperations restOperations) {
		super(restOperations);
	}

	@Override
	public SlackResponse addReactionToFile(String emojiName, String file) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("name", emojiName);
		paramMap.add("file", file);
		SlackResponse slackResponse = get("/reactions.add", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackResponse addReactionToFileComment(String emojiName, String file_comment) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("name", emojiName);
		paramMap.add("file_comment", file_comment);
		SlackResponse slackResponse = get("/reactions.add", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackResponse addReactionToMessage(String emojiName, String channel, String timestamp) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("name", emojiName);
		paramMap.add("channel", channel);
		paramMap.add("timestamp", timestamp);
		SlackResponse slackResponse = get("/reactions.add", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackReactionItemListResponse getReactionByFile(String emojiName, String file) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("name", emojiName);
		paramMap.add("file",file);
		SlackReactionItemListResponse slackResponse = get("/reactions.get", paramMap,
				SlackReactionItemListResponse.class);
		return slackResponse;
	}

	@Override
	public SlackReactionItemListResponse getReactionByFileComment(String emojiName, String file_comment) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("name", emojiName);
		paramMap.add("file_comment",file_comment);
		SlackReactionItemListResponse slackResponse = get("/reactions.get", paramMap,
				SlackReactionItemListResponse.class);
		return slackResponse;
	}

	@Override
	public SlackReactionItemListResponse getReactionByMessage(String emojiName,String channel, String timestamp) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("name", emojiName);
		paramMap.add("channel", channel);
		paramMap.add("timestamp",timestamp);
		SlackReactionItemListResponse slackResponse = get("/reactions.get", paramMap,
				SlackReactionItemListResponse.class);
		return slackResponse;
	}

	@Override
	public SlackReactionItemListResponse getReactionList(int page) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("page", new Integer(page).toString());
		SlackReactionItemListResponse slackResponse = get("/reactions.list", paramMap,
				SlackReactionItemListResponse.class);
		return slackResponse;
	}

	@Override
	public SlackReactionItemListResponse getReactionList(int page, int count) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("page", new Integer(page).toString());
		paramMap.add("count", new Integer(count).toString());
		SlackReactionItemListResponse slackResponse = get("/reactions.list", paramMap,
				SlackReactionItemListResponse.class);
		return slackResponse;
	}

	@Override
	public SlackReactionItemListResponse getReactionList(String user, int page) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("user", user);
		paramMap.add("page", new Integer(page).toString());
		SlackReactionItemListResponse slackResponse = get("/reactions.list", paramMap,
				SlackReactionItemListResponse.class);
		return slackResponse;
	}

	@Override
	public SlackReactionItemListResponse getReactionList(String user, int page, int count) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("user", user);
		paramMap.add("page", new Integer(page).toString());
		paramMap.add("count", new Integer(count).toString());
		SlackReactionItemListResponse slackResponse = get("/reactions.list", paramMap,
				SlackReactionItemListResponse.class);
		return slackResponse;
	}

	@Override
	public SlackResponse removeReactionFromFile(String emojiName, String file) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("name", emojiName);
		paramMap.add("file", file);
		SlackResponse slackResponse = get("/reactions.remove", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackResponse removeReactionFromFileComment(String emojiName, String file_comment) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("name", emojiName);
		paramMap.add("file_comment", file_comment);
		SlackResponse slackResponse = get("/reactions.remove", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackResponse removeReactionFromMessage(String emojiName, String channel, String timestamp) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("name", emojiName);
		paramMap.add("channel", channel);
		paramMap.add("timestamp", timestamp);
		SlackResponse slackResponse = get("/reactions.remove", paramMap, SlackResponse.class);
		return slackResponse;
	}

}
