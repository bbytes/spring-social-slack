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

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackUser implements Serializable {

	
	private static final long serialVersionUID = 8225015612753804339L;

	@JsonProperty("id")
	private String id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("deleted")
	private Boolean deleted;
	@JsonProperty("status")
	private Object status;
	@JsonProperty("color")
	private String color;
	@JsonProperty("real_name")
	private String realName;
	@JsonProperty("tz")
	private String tz;
	@JsonProperty("tz_label")
	private String tzLabel;
	@JsonProperty("tz_offset")
	private Integer tzOffset;

	@JsonProperty("is_admin")
	private Boolean isAdmin;
	@JsonProperty("is_owner")
	private Boolean isOwner;
	@JsonProperty("is_primary_owner")
	private Boolean isPrimaryOwner;
	@JsonProperty("is_restricted")
	private Boolean isRestricted;
	@JsonProperty("is_ultra_restricted")
	private Boolean isUltraRestricted;
	@JsonProperty("is_bot")
	private Boolean isBot;
	@JsonProperty("has_files")
	private Boolean hasFiles;
	@JsonProperty("has_2fa")
	private Boolean has2fa;

	@JsonProperty("profile")
	private SlackUserInfo userInfo;

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
	 * @return The deleted
	 */
	@JsonProperty("deleted")
	public Boolean getDeleted() {
		return deleted;
	}

	/**
	 *
	 * @param deleted
	 *            The deleted
	 */
	@JsonProperty("deleted")
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	/**
	 *
	 * @return The status
	 */
	@JsonProperty("status")
	public Object getStatus() {
		return status;
	}

	/**
	 *
	 * @param status
	 *            The status
	 */
	@JsonProperty("status")
	public void setStatus(Object status) {
		this.status = status;
	}

	/**
	 *
	 * @return The color
	 */
	@JsonProperty("color")
	public String getColor() {
		return color;
	}

	/**
	 *
	 * @param color
	 *            The color
	 */
	@JsonProperty("color")
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 *
	 * @return The realName
	 */
	@JsonProperty("real_name")
	public String getRealName() {
		return realName;
	}

	/**
	 *
	 * @param realName
	 *            The real_name
	 */
	@JsonProperty("real_name")
	public void setRealName(String realName) {
		this.realName = realName;
	}

	/**
	 *
	 * @return The tz
	 */
	@JsonProperty("tz")
	public String getTz() {
		return tz;
	}

	/**
	 *
	 * @param tz
	 *            The tz
	 */
	@JsonProperty("tz")
	public void setTz(String tz) {
		this.tz = tz;
	}

	/**
	 *
	 * @return The tzLabel
	 */
	@JsonProperty("tz_label")
	public String getTzLabel() {
		return tzLabel;
	}

	/**
	 *
	 * @param tzLabel
	 *            The tz_label
	 */
	@JsonProperty("tz_label")
	public void setTzLabel(String tzLabel) {
		this.tzLabel = tzLabel;
	}

	/**
	 *
	 * @return The tzOffset
	 */
	@JsonProperty("tz_offset")
	public Integer getTzOffset() {
		return tzOffset;
	}

	/**
	 *
	 * @param tzOffset
	 *            The tz_offset
	 */
	@JsonProperty("tz_offset")
	public void setTzOffset(Integer tzOffset) {
		this.tzOffset = tzOffset;
	}

	/**
	 *
	 * @return The isAdmin
	 */
	@JsonProperty("is_admin")
	public Boolean getIsAdmin() {
		return isAdmin;
	}

	/**
	 *
	 * @param isAdmin
	 *            The is_admin
	 */
	@JsonProperty("is_admin")
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	/**
	 *
	 * @return The isOwner
	 */
	@JsonProperty("is_owner")
	public Boolean getIsOwner() {
		return isOwner;
	}

	/**
	 *
	 * @param isOwner
	 *            The is_owner
	 */
	@JsonProperty("is_owner")
	public void setIsOwner(Boolean isOwner) {
		this.isOwner = isOwner;
	}

	/**
	 *
	 * @return The isPrimaryOwner
	 */
	@JsonProperty("is_primary_owner")
	public Boolean getIsPrimaryOwner() {
		return isPrimaryOwner;
	}

	/**
	 *
	 * @param isPrimaryOwner
	 *            The is_primary_owner
	 */
	@JsonProperty("is_primary_owner")
	public void setIsPrimaryOwner(Boolean isPrimaryOwner) {
		this.isPrimaryOwner = isPrimaryOwner;
	}

	/**
	 *
	 * @return The isRestricted
	 */
	@JsonProperty("is_restricted")
	public Boolean getIsRestricted() {
		return isRestricted;
	}

	/**
	 *
	 * @param isRestricted
	 *            The is_restricted
	 */
	@JsonProperty("is_restricted")
	public void setIsRestricted(Boolean isRestricted) {
		this.isRestricted = isRestricted;
	}

	/**
	 *
	 * @return The isUltraRestricted
	 */
	@JsonProperty("is_ultra_restricted")
	public Boolean getIsUltraRestricted() {
		return isUltraRestricted;
	}

	/**
	 *
	 * @param isUltraRestricted
	 *            The is_ultra_restricted
	 */
	@JsonProperty("is_ultra_restricted")
	public void setIsUltraRestricted(Boolean isUltraRestricted) {
		this.isUltraRestricted = isUltraRestricted;
	}

	/**
	 *
	 * @return The isBot
	 */
	@JsonProperty("is_bot")
	public Boolean getIsBot() {
		return isBot;
	}

	/**
	 *
	 * @param isBot
	 *            The is_bot
	 */
	@JsonProperty("is_bot")
	public void setIsBot(Boolean isBot) {
		this.isBot = isBot;
	}

	/**
	 *
	 * @return The hasFiles
	 */
	@JsonProperty("has_files")
	public Boolean getHasFiles() {
		return hasFiles;
	}

	/**
	 *
	 * @param hasFiles
	 *            The has_files
	 */
	@JsonProperty("has_files")
	public void setHasFiles(Boolean hasFiles) {
		this.hasFiles = hasFiles;
	}

	/**
	 *
	 * @return The has2fa
	 */
	@JsonProperty("has_2fa")
	public Boolean getHas2fa() {
		return has2fa;
	}

	/**
	 *
	 * @param has2fa
	 *            The has_2fa
	 */
	@JsonProperty("has_2fa")
	public void setHas2fa(Boolean has2fa) {
		this.has2fa = has2fa;
	}

	@JsonProperty("profile")
	public SlackUserInfo getUserInfo() {
		return userInfo;
	}

	@JsonProperty("profile")
	public void setUserInfo(SlackUserInfo userInfo) {
		this.userInfo = userInfo;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
