package org.springframework.social.slack.api.impl;

import org.springframework.social.slack.api.GroupOperations;
import org.springframework.social.slack.api.impl.model.SlackHistoryResponse;
import org.springframework.social.slack.api.impl.model.SlackGroupListResponse;
import org.springframework.social.slack.api.impl.model.SlackGroupResponse;
import org.springframework.social.slack.api.impl.model.SlackResponse;
import org.springframework.social.slack.util.DataUtil;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;

public class GroupTemplate extends AbstractTemplate implements GroupOperations {

	public GroupTemplate(RestOperations restOperations) {
		super(restOperations);
	}

	@Override
	public SlackResponse archiveGroup(String channel) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		SlackResponse slackResponse = get("/groups.archive", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackResponse closeGroup(String channel) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		SlackResponse slackResponse = get("/groups.close", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackGroupResponse createGroup(String name) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("name", name);
		SlackGroupResponse slackGroupResponse = get("/groups.create", paramMap, SlackGroupResponse.class);
		return slackGroupResponse;
	}

	@Override
	public SlackGroupResponse createChildGroup(String name) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("name", name);
		SlackGroupResponse slackGroupResponse = get("/groups.createChild", paramMap, SlackGroupResponse.class);
		return slackGroupResponse;
	}

	@Override
	public SlackGroupResponse getGroupInfo(String channel) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		SlackGroupResponse slackGroupResponse = get("/groups.info", paramMap, SlackGroupResponse.class);
		return slackGroupResponse;
	}

	@Override
	public SlackGroupResponse inviteUserToGroup(String channel, String user) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		paramMap.add("user", user);
		SlackGroupResponse slackGroupResponse = get("/groups.invite", paramMap, SlackGroupResponse.class);
		return slackGroupResponse;
	}

	@Override
	public SlackResponse leaveGroup(String channel) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		SlackResponse slackResponse = get("/groups.leave", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackResponse kickUserFormGroup(String channel, String user) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		paramMap.add("user", user);
		SlackResponse slackResponse = get("/groups.kick", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackGroupListResponse getGroupList() {
		SlackGroupListResponse groups = get("/groups.list", SlackGroupListResponse.class);
		return groups;
	}

	@Override
	public SlackGroupListResponse getGroupList(boolean exclude_archived) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("exclude_archived", DataUtil.getStringValue(exclude_archived));
		SlackGroupListResponse groups = get("/groups.list", paramMap, SlackGroupListResponse.class);
		return groups;
	}

	@Override
	public SlackResponse markGroup(String channel, String ts) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		paramMap.add("ts", ts);
		SlackResponse slackResponse = get("/groups.mark", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackResponse openGroup(String channel) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		SlackResponse slackResponse = get("/groups.open", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackGroupResponse renameGroup(String channel, String name) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		paramMap.add("name", name);
		SlackGroupResponse slackGroupResponse = get("/groups.rename", paramMap, SlackGroupResponse.class);
		return slackGroupResponse;
	}

	@Override
	public SlackResponse setGroupPurpose(String channel, String purpose) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		paramMap.add("purpose", purpose);
		SlackResponse slackResponse = get("/groups.setPurpose", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackResponse setGroupTopic(String channel, String topic) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		paramMap.add("topic", topic);
		SlackResponse slackResponse = get("/groups.setTopic", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackResponse unarchiveGroup(String channel) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		SlackResponse slackResponse = get("/groups.unarchive", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackHistoryResponse getGroupHistory(String channel) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		SlackHistoryResponse groupHistory = get("/groups.history", paramMap, SlackHistoryResponse.class);
		return groupHistory;
	}

	@Override
	public SlackHistoryResponse getGroupHistory(String channel, int count) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		paramMap.add("count", new Integer(count).toString());
		SlackHistoryResponse groupHistory = get("/groups.history", paramMap, SlackHistoryResponse.class);
		return groupHistory;
	}

	@Override
	public SlackHistoryResponse getGroupHistory(String channel, String latest, String oldest, boolean inclusive, int count,
			boolean unreads) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channel);
		paramMap.add("latest", latest);
		paramMap.add("oldest", oldest);
		paramMap.add("inclusive", DataUtil.getStringValue(inclusive));
		paramMap.add("unreads", DataUtil.getStringValue(unreads));
		
		paramMap.add("count", new Integer(count).toString());
		SlackHistoryResponse groupHistory = get("/groups.history", paramMap, SlackHistoryResponse.class);
		return groupHistory;
	}

}
