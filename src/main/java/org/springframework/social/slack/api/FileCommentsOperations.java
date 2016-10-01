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

import org.springframework.social.slack.api.impl.model.SlackCommentResponse;
import org.springframework.social.slack.api.impl.model.SlackResponse;

/**
 * Defines operations for interacting with slack files
 * 
 * @author Thanneer
 */
public interface FileCommentsOperations {

	public SlackCommentResponse addFileComment(String file, String comment);

	public SlackCommentResponse editFileComment(String file, String id, String comment);

	public SlackResponse deleteFileComment(String file, String id);

}
