package org.springframework.social.slack.api.impl.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackReaction {

	@JsonProperty("name")
	private String name;

	@JsonProperty("users")
	private List<String> users = new ArrayList<String>();

	@JsonProperty("count")
	private Integer count;

	public String getName() {
		return name;
	}

	public List<String> getUsers() {
		return users;
	}

	public Integer getCount() {
		return count;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUsers(List<String> users) {
		this.users = users;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
