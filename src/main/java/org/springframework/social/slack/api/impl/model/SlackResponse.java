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
package org.springframework.social.slack.api.impl.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackResponse {

	@JsonProperty("ok")
	public Boolean ok;

	public String message;
	
	public String error;
	
	public String needed;
	
	public String provided;
	
	

	@JsonProperty("ok")
	public Boolean isOk() {
		return ok;
	}

	@JsonProperty("ok")
	public void setOk(Boolean ok) {
		this.ok = ok;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getNeeded() {
		return needed;
	}

	public void setNeeded(String needed) {
		this.needed = needed;
	}

	public String getProvided() {
		return provided;
	}

	public void setProvided(String provided) {
		this.provided = provided;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
