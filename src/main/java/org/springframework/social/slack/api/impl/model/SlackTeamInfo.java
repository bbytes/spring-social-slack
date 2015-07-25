package org.springframework.social.slack.api.impl.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackTeamInfo {

	@JsonProperty("id")
	private String id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("domain")
	private String domain;
	@JsonProperty("email_domain")
	private String emailDomain;
	@JsonProperty("icon")
	private Icon icon;

	/**
	 * 
	 * @return The id
	 */
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The id
	 */
	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 
	 * @return The name
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            The name
	 */
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return The domain
	 */
	@JsonProperty("domain")
	public String getDomain() {
		return domain;
	}

	/**
	 * 
	 * @param domain
	 *            The domain
	 */
	@JsonProperty("domain")
	public void setDomain(String domain) {
		this.domain = domain;
	}

	/**
	 * 
	 * @return The emailDomain
	 */
	@JsonProperty("email_domain")
	public String getEmailDomain() {
		return emailDomain;
	}

	/**
	 * 
	 * @param emailDomain
	 *            The email_domain
	 */
	@JsonProperty("email_domain")
	public void setEmailDomain(String emailDomain) {
		this.emailDomain = emailDomain;
	}

	/**
	 * 
	 * @return The icon
	 */
	@JsonProperty("icon")
	public Icon getIcon() {
		return icon;
	}

	/**
	 * 
	 * @param icon
	 *            The icon
	 */
	@JsonProperty("icon")
	public void setIcon(Icon icon) {
		this.icon = icon;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
