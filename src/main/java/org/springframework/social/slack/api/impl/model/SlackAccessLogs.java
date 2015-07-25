package org.springframework.social.slack.api.impl.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackAccessLogs {

	@JsonProperty("user_id")
	private String userId;
	@JsonProperty("username")
	private String username;
	@JsonProperty("date_first")
	private Integer dateFirst;
	@JsonProperty("date_last")
	private Integer dateLast;
	@JsonProperty("count")
	private Integer count;
	@JsonProperty("ip")
	private String ip;
	@JsonProperty("user_agent")
	private String userAgent;
	@JsonProperty("isp")
	private String isp;
	@JsonProperty("country")
	private String country;
	@JsonProperty("region")
	private String region;

	/**
	 * 
	 * @return The userId
	 */
	@JsonProperty("user_id")
	public String getUserId() {
		return userId;
	}

	/**
	 * 
	 * @param userId
	 *            The user_id
	 */
	@JsonProperty("user_id")
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * 
	 * @return The username
	 */
	@JsonProperty("username")
	public String getUsername() {
		return username;
	}

	/**
	 * 
	 * @param username
	 *            The username
	 */
	@JsonProperty("username")
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * 
	 * @return The dateFirst
	 */
	@JsonProperty("date_first")
	public Integer getDateFirst() {
		return dateFirst;
	}

	/**
	 * 
	 * @param dateFirst
	 *            The date_first
	 */
	@JsonProperty("date_first")
	public void setDateFirst(Integer dateFirst) {
		this.dateFirst = dateFirst;
	}

	/**
	 * 
	 * @return The dateLast
	 */
	@JsonProperty("date_last")
	public Integer getDateLast() {
		return dateLast;
	}

	/**
	 * 
	 * @param dateLast
	 *            The date_last
	 */
	@JsonProperty("date_last")
	public void setDateLast(Integer dateLast) {
		this.dateLast = dateLast;
	}

	/**
	 * 
	 * @return The count
	 */
	@JsonProperty("count")
	public Integer getCount() {
		return count;
	}

	/**
	 * 
	 * @param count
	 *            The count
	 */
	@JsonProperty("count")
	public void setCount(Integer count) {
		this.count = count;
	}

	/**
	 * 
	 * @return The ip
	 */
	@JsonProperty("ip")
	public String getIp() {
		return ip;
	}

	/**
	 * 
	 * @param ip
	 *            The ip
	 */
	@JsonProperty("ip")
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * 
	 * @return The userAgent
	 */
	@JsonProperty("user_agent")
	public String getUserAgent() {
		return userAgent;
	}

	/**
	 * 
	 * @param userAgent
	 *            The user_agent
	 */
	@JsonProperty("user_agent")
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	/**
	 * 
	 * @return The isp
	 */
	@JsonProperty("isp")
	public String getIsp() {
		return isp;
	}

	/**
	 * 
	 * @param isp
	 *            The isp
	 */
	@JsonProperty("isp")
	public void setIsp(String isp) {
		this.isp = isp;
	}

	/**
	 * 
	 * @return The country
	 */
	@JsonProperty("country")
	public String getCountry() {
		return country;
	}

	/**
	 * 
	 * @param country
	 *            The country
	 */
	@JsonProperty("country")
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * 
	 * @return The region
	 */
	@JsonProperty("region")
	public String getRegion() {
		return region;
	}

	/**
	 * 
	 * @param region
	 *            The region
	 */
	@JsonProperty("region")
	public void setRegion(String region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
