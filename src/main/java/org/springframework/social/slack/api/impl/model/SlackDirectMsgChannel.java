
package org.springframework.social.slack.api.impl.model;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackDirectMsgChannel implements Serializable {

	
	private static final long serialVersionUID = 8273664615867694289L;
	
	@JsonProperty("id")
	private String id;
	@JsonProperty("user")
	private String user;
	@JsonProperty("created")
	private Integer created;
	@JsonProperty("is_im")
	private Boolean isIm;
	@JsonProperty("is_org_shared")
	private Boolean isOrgShared;
	@JsonProperty("is_user_deleted")
	private Boolean isUserDeleted;

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
	 * @return The user
	 */
	@JsonProperty("user")
	public String getUser() {
		return user;
	}

	/**
	 * 
	 * @param user
	 *            The user
	 */
	@JsonProperty("user")
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * 
	 * @return The created
	 */
	@JsonProperty("created")
	public Integer getCreated() {
		return created;
	}

	/**
	 * 
	 * @param created
	 *            The created
	 */
	@JsonProperty("created")
	public void setCreated(Integer created) {
		this.created = created;
	}

	/**
	 * 
	 * @return The isIm
	 */
	@JsonProperty("is_im")
	public Boolean getIsIm() {
		return isIm;
	}

	/**
	 * 
	 * @param isIm
	 *            The is_im
	 */
	@JsonProperty("is_im")
	public void setIsIm(Boolean isIm) {
		this.isIm = isIm;
	}

	/**
	 * 
	 * @return The isOrgShared
	 */
	@JsonProperty("is_org_shared")
	public Boolean getIsOrgShared() {
		return isOrgShared;
	}

	/**
	 * 
	 * @param isOrgShared
	 *            The is_org_shared
	 */
	@JsonProperty("is_org_shared")
	public void setIsOrgShared(Boolean isOrgShared) {
		this.isOrgShared = isOrgShared;
	}

	/**
	 * 
	 * @return The isUserDeleted
	 */
	@JsonProperty("is_user_deleted")
	public Boolean getIsUserDeleted() {
		return isUserDeleted;
	}

	/**
	 * 
	 * @param isUserDeleted
	 *            The is_user_deleted
	 */
	@JsonProperty("is_user_deleted")
	public void setIsUserDeleted(Boolean isUserDeleted) {
		this.isUserDeleted = isUserDeleted;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
