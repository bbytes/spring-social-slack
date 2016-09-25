package org.springframework.social.slack.api.impl;

import org.springframework.social.slack.api.PinOperations;
import org.springframework.social.slack.api.impl.model.SlackItemListResponse;
import org.springframework.social.slack.api.impl.model.SlackResponse;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;

public class PinTemplate extends AbstractTemplate implements PinOperations {

	public PinTemplate(RestOperations restOperations) {
		super(restOperations);
	}

	@Override
	public SlackResponse pinFile(String channel, String file) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		paramMap.add("file", file);
		SlackResponse slackResponse = get("/pins.add", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackResponse pinFileComment(String channel, String file_comment) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		paramMap.add("file_comment", file_comment);
		SlackResponse slackResponse = get("/pins.add", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackResponse pinMessage(String channel, String timestamp) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		paramMap.add("timestamp", timestamp);
		SlackResponse slackResponse = get("/pins.add", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackItemListResponse getPinList(String channel) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		SlackItemListResponse slackResponse = get("/pins.list", paramMap, SlackItemListResponse.class);
		return slackResponse;
	}

	@Override
	public SlackResponse unpinFile(String channel, String file) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		paramMap.add("file", file);
		SlackItemListResponse slackResponse = get("/pins.remove", paramMap, SlackItemListResponse.class);
		return slackResponse;
	}

	@Override
	public SlackResponse unpinFileComment(String channel, String file_comment) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		paramMap.add("file_comment", file_comment);
		SlackItemListResponse slackResponse = get("/pins.remove", paramMap, SlackItemListResponse.class);
		return slackResponse;
	}

	@Override
	public SlackResponse unpinMessage(String channel, String timestamp) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		paramMap.add("timestamp", timestamp);
		SlackItemListResponse slackResponse = get("/pins.remove", paramMap, SlackItemListResponse.class);
		return slackResponse;
	}

}
