/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.social.slack.api;



import org.springframework.social.slack.api.impl.model.SlackGroupHistoryResponse;
import org.springframework.social.slack.api.impl.model.SlackGroupListResponse;
import org.springframework.social.slack.api.impl.model.SlackGroupResponse;
import org.springframework.social.slack.api.impl.model.SlackResponse;

/**
 * Defines operations for interacting with group
 * 
 * @author Thanneer
 */
public interface GroupOperations {

	public SlackResponse archiveGroup(String channel) ;
	
	public SlackResponse closeGroup(String channel);
	
	public SlackGroupResponse createGroup(String name);
	
	public SlackGroupResponse createChildGroup(String name);
	
	public SlackGroupResponse getGroupInfo(String channel) ;
	
	public SlackGroupResponse inviteUserToGroup(String channel, String user) ;
	
	public SlackResponse leaveGroup(String channel);
	
	public SlackGroupListResponse getGroupList();
	
	public SlackGroupListResponse getGroupList(boolean exclude_archived) ;
	
	public SlackResponse markGroup(String channel, String ts) ;

	public SlackResponse openGroup(String channel) ;

	public SlackGroupResponse renameGroup(String channel, String name) ;

	public SlackResponse setGroupPurpose(String channel, String purpose) ;

	public SlackResponse setGroupTopic(String channel, String topic);

	public SlackResponse unarchiveGroup(String channel) ;
	
	public SlackResponse kickUserFormGroup(String channel, String user);
	
	public SlackGroupHistoryResponse getGroupHistory(String channel);
	
	public SlackGroupHistoryResponse getGroupHistory(String channel, int count) ;
	
	public SlackGroupHistoryResponse getGroupHistory(String channel, String latest, String oldest, boolean inclusive, int count, boolean unreads) ;
	
	
}
