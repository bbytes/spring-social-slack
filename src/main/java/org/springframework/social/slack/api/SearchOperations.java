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

import org.springframework.social.slack.api.impl.model.SlackSearchResponse;

/**
 * Defines operations for interacting with search
 * 
 * @author Thanneer
 */
public interface SearchOperations {

	public SlackSearchResponse searchAll(String query);

	public SlackSearchResponse searchAll(String query, String sort, String sortDirection);

	public SlackSearchResponse searchAll(String query, int count, int page);

	public SlackSearchResponse searchAll(String query, String sort, String sortDirection, boolean highlight, int count,
			int page);
	
	public SlackSearchResponse searchFiles(String query);

	public SlackSearchResponse searchFiles(String query, String sort, String sortDirection);

	public SlackSearchResponse searchFiles(String query, int count, int page);

	public SlackSearchResponse searchFiles(String query, String sort, String sortDirection, boolean highlight, int count,
			int page);
	
	
	public SlackSearchResponse searchMessages(String query);

	public SlackSearchResponse searchMessages(String query, String sort, String sortDirection);

	public SlackSearchResponse searchMessages(String query, int count, int page);

	public SlackSearchResponse searchMessages(String query, String sort, String sortDirection, boolean highlight, int count,
			int page);

}
