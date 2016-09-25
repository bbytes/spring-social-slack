package org.springframework.social.slack.api.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.social.slack.api.MessageOperations;
import org.springframework.social.slack.api.impl.model.SlackChannelResponse;
import org.springframework.social.slack.api.impl.model.SlackDirectMsgChannelListResponse;
import org.springframework.social.slack.api.impl.model.SlackGroupListResponse;
import org.springframework.social.slack.api.impl.model.SlackGroupResponse;
import org.springframework.social.slack.api.impl.model.SlackHistoryResponse;
import org.springframework.social.slack.api.impl.model.SlackResponse;
import org.springframework.social.slack.util.DataUtil;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;

public class MessageTemplate extends AbstractTemplate implements MessageOperations {

	public MessageTemplate(RestOperations restOperations) {
		super(restOperations);
	}

	@Override
	public SlackResponse closeDirectMessageChannel(String channel) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);

		SlackResponse slackResponse = get("/im.close", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackHistoryResponse getDirectMessageChannelHistory(String channel) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);

		SlackHistoryResponse slackHistoryResponse = get("/im.history", paramMap, SlackHistoryResponse.class);
		return slackHistoryResponse;
	}

	@Override
	public SlackHistoryResponse getDirectMessageChannelHistory(String channel, int count) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		paramMap.add("count", new Integer(count).toString());

		SlackHistoryResponse slackHistoryResponse = get("/im.history", paramMap, SlackHistoryResponse.class);
		return slackHistoryResponse;
	}

	@Override
	public SlackHistoryResponse getDirectMessageChannelHistory(String channel, String latest, String oldest,
			boolean inclusive, int count, boolean unreads) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		paramMap.add("latest", latest);
		paramMap.add("oldest", oldest);
		paramMap.add("inclusive", DataUtil.getStringValue(inclusive));
		paramMap.add("unreads", DataUtil.getStringValue(unreads));
		paramMap.add("count", new Integer(count).toString());

		SlackHistoryResponse slackHistoryResponse = get("/im.history", paramMap, SlackHistoryResponse.class);
		return slackHistoryResponse;
	}

	@Override
	public SlackDirectMsgChannelListResponse getDirectMessageChannelList() {
		SlackDirectMsgChannelListResponse slackDirectMsgChannelListResponse = get("/im.list",
				SlackDirectMsgChannelListResponse.class);
		return slackDirectMsgChannelListResponse;
	}

	@Override
	public SlackResponse markDirectMessageChannel(String channel, String ts) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		paramMap.add("ts", ts);

		SlackResponse slackResponse = get("/im.mark", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackChannelResponse openDirectMessageChannel(String user) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("user", user);
		paramMap.add("return_im", "1");

		SlackChannelResponse slackResponse = get("/im.open", paramMap, SlackChannelResponse.class);
		return slackResponse;
	}

	@Override
	public SlackResponse closeMultipartyDirectMessageChannel(String channel) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);

		SlackResponse slackResponse = get("/mpim.close", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackHistoryResponse getMultipartyDirectMessageChannelHistory(String channel) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);

		SlackHistoryResponse slackResponse = get("/mpim.history", paramMap, SlackHistoryResponse.class);
		return slackResponse;
	}

	@Override
	public SlackHistoryResponse getMultipartyDirectMessageChannelHistory(String channel, int count) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		paramMap.add("count", new Integer(count).toString());

		SlackHistoryResponse slackResponse = get("/mpim.history", paramMap, SlackHistoryResponse.class);
		return slackResponse;
	}

	@Override
	public SlackHistoryResponse getMultipartyDirectMessageChannelHistory(String channel, String latest, String oldest,
			boolean inclusive, int count, boolean unreads) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		paramMap.add("latest", latest);
		paramMap.add("oldest", oldest);
		paramMap.add("inclusive", DataUtil.getStringValue(inclusive));
		paramMap.add("unreads", DataUtil.getStringValue(unreads));
		paramMap.add("count", new Integer(count).toString());

		SlackHistoryResponse slackResponse = get("/mpim.history", paramMap, SlackHistoryResponse.class);
		return slackResponse;
	}

	@Override
	public SlackGroupListResponse getMultipartyDirectMessageChannelList() {
		SlackGroupListResponse slackResponse = get("/mpim.list", SlackGroupListResponse.class);
		return slackResponse;
	}

	@Override
	public SlackResponse markMultipartyDirectMessageChannel(String channel, String ts) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		paramMap.add("ts", ts);

		SlackResponse slackResponse = get("/mpim.mark", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackGroupResponse openMultipartyDirectMessageChannel(String... users) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("users", StringUtils.join(users, ','));

		SlackGroupResponse slackResponse = get("/mpim.open", paramMap, SlackGroupResponse.class);
		return slackResponse;
	}

}
