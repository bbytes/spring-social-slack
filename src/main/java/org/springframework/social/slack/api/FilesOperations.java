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

import org.springframework.social.slack.api.impl.model.SlackFileInfo;
import org.springframework.social.slack.api.impl.model.SlackFileListResponse;
import org.springframework.social.slack.api.impl.model.SlackFileResponse;
import org.springframework.social.slack.api.impl.model.SlackResponse;

/**
 * Defines operations for interacting with slack files
 * 
 * @author Thanneer
 */
public interface FilesOperations {

	public SlackResponse deleteFile(String fileId);

	public SlackFileInfo getFileInfo(String fileId);

	public SlackFileInfo getFileInfo(String fileId, int page);

	public SlackFileInfo getFileInfo(String fileId, int page, int count);

	public SlackFileListResponse getFileList();

	public SlackFileListResponse getFileList(int page);

	public SlackFileListResponse getFileList(int page, int count);

	public SlackFileListResponse getFileListForUser(String user);
	
	public SlackFileListResponse getFileListForChannel(String channel);
	
	public SlackFileListResponse getFileList(String channel, String user);

	public SlackFileListResponse getFileList(String user, int page);

	public SlackFileListResponse getFileList(String user, int page, int count);

	public SlackFileListResponse getFileList(String user, String ts_from, String ts_to, String types, int page, int count);

	public SlackFileResponse revokeFilePublicURL(String fileId);

	/**
	 * Look for permalink_public field value in response for public url of the
	 * file
	 * 
	 * @param fileId
	 * @return
	 */
	public SlackFileResponse sharedFilePublicURL(String fileId);

	/**
	 * 
	 * @param file
	 *            actual file to be uploaded
	 * @param title
	 *            file title
	 * @param initialComment
	 *            initial comment to be added about the file
	 * @param channels
	 *            - Comma-separated list of channel names or IDs where the file
	 *            will be shared.
	 * @return
	 */
	public SlackFileResponse uploadFile(java.io.File file, String title, String initialComment, String channels)
			throws Exception;

	public SlackFileResponse uploadFile(java.io.File file, String title, String fileType, String initialComment,
			String channels) throws Exception;

	public SlackFileResponse uploadFile(java.io.File file, String title, String channels) throws Exception;


	public SlackFileResponse uploadFile(java.io.File file, String title) throws Exception;

}
