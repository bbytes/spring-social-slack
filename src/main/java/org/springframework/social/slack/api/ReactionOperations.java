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

import org.springframework.social.slack.api.impl.model.SlackReactionItemListResponse;
import org.springframework.social.slack.api.impl.model.SlackResponse;

/**
* Defines operations for interacting with reactions
* @author Thanneer
*/
public interface ReactionOperations {
	
	public SlackResponse addReactionToFile(String emojiName, String file);
	
	public SlackResponse addReactionToFileComment(String emojiName, String file_comment);
	
	public SlackResponse addReactionToMessage(String emojiName, String channel, String timestamp);
	
	public SlackReactionItemListResponse getReactionByFile(String emojiName, String file);
	
	public SlackReactionItemListResponse getReactionByFileComment(String emojiName, String file_comment);
	
	public SlackReactionItemListResponse getReactionByMessage(String emojiName, String channel, String timestamp);
	
	public SlackReactionItemListResponse getReactionList(int page);
	
	public SlackReactionItemListResponse getReactionList(int page, int count);
	
	public SlackReactionItemListResponse getReactionList(String user, int page);
	
	public SlackReactionItemListResponse getReactionList(String user, int page, int count);
	
	public SlackResponse removeReactionFromFile(String emojiName, String file);
	
	public SlackResponse removeReactionFromFileComment(String emojiName, String file_comment);
	
	public SlackResponse removeReactionFromMessage(String emojiName, String channel, String timestamp);

}
