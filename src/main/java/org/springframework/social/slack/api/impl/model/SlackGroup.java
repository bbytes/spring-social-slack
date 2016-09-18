package org.springframework.social.slack.api.impl.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackGroup {

	@JsonProperty("id")
	private String id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("is_group")
	private Boolean isGroup;
	@JsonProperty("created")
	private Integer created;
	@JsonProperty("creator")
	private String creator;
	@JsonProperty("is_archived")
	private Boolean isArchived;
	@JsonProperty("is_mpim")
	private Boolean isMpim;
	@JsonProperty("is_open")
	private Boolean isOpen;
	@JsonProperty("last_read")
	private String lastRead;
	@JsonProperty("latest")
	private Object latest;
	@JsonProperty("unread_count")
	private Integer unreadCount;
	@JsonProperty("unread_count_display")
	private Integer unreadCountDisplay;
	@JsonProperty("members")
	private List<String> members = new ArrayList<String>();
	@JsonProperty("topic")
	private Topic topic;
	@JsonProperty("purpose")
	private Purpose purpose;

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
	 * @return The isGroup
	 */
	@JsonProperty("is_group")
	public Boolean getIsGroup() {
		return isGroup;
	}

	/**
	 * 
	 * @param isGroup
	 *            The is_group
	 */
	@JsonProperty("is_group")
	public void setIsGroup(Boolean isGroup) {
		this.isGroup = isGroup;
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
	 * @return The creator
	 */
	@JsonProperty("creator")
	public String getCreator() {
		return creator;
	}

	/**
	 * 
	 * @param creator
	 *            The creator
	 */
	@JsonProperty("creator")
	public void setCreator(String creator) {
		this.creator = creator;
	}

	/**
	 * 
	 * @return The isArchived
	 */
	@JsonProperty("is_archived")
	public Boolean getIsArchived() {
		return isArchived;
	}

	/**
	 * 
	 * @param isArchived
	 *            The is_archived
	 */
	@JsonProperty("is_archived")
	public void setIsArchived(Boolean isArchived) {
		this.isArchived = isArchived;
	}

	/**
	 * 
	 * @return The isMpim
	 */
	@JsonProperty("is_mpim")
	public Boolean getIsMpim() {
		return isMpim;
	}

	/**
	 * 
	 * @param isMpim
	 *            The is_mpim
	 */
	@JsonProperty("is_mpim")
	public void setIsMpim(Boolean isMpim) {
		this.isMpim = isMpim;
	}

	/**
	 * 
	 * @return The isOpen
	 */
	@JsonProperty("is_open")
	public Boolean getIsOpen() {
		return isOpen;
	}

	/**
	 * 
	 * @param isOpen
	 *            The is_open
	 */
	@JsonProperty("is_open")
	public void setIsOpen(Boolean isOpen) {
		this.isOpen = isOpen;
	}

	/**
	 * 
	 * @return The lastRead
	 */
	@JsonProperty("last_read")
	public String getLastRead() {
		return lastRead;
	}

	/**
	 * 
	 * @param lastRead
	 *            The last_read
	 */
	@JsonProperty("last_read")
	public void setLastRead(String lastRead) {
		this.lastRead = lastRead;
	}

	/**
	 * 
	 * @return The latest
	 */
	@JsonProperty("latest")
	public Object getLatest() {
		return latest;
	}

	/**
	 * 
	 * @param latest
	 *            The latest
	 */
	@JsonProperty("latest")
	public void setLatest(Object latest) {
		this.latest = latest;
	}

	/**
	 * 
	 * @return The unreadCount
	 */
	@JsonProperty("unread_count")
	public Integer getUnreadCount() {
		return unreadCount;
	}

	/**
	 * 
	 * @param unreadCount
	 *            The unread_count
	 */
	@JsonProperty("unread_count")
	public void setUnreadCount(Integer unreadCount) {
		this.unreadCount = unreadCount;
	}

	/**
	 * 
	 * @return The unreadCountDisplay
	 */
	@JsonProperty("unread_count_display")
	public Integer getUnreadCountDisplay() {
		return unreadCountDisplay;
	}

	/**
	 * 
	 * @param unreadCountDisplay
	 *            The unread_count_display
	 */
	@JsonProperty("unread_count_display")
	public void setUnreadCountDisplay(Integer unreadCountDisplay) {
		this.unreadCountDisplay = unreadCountDisplay;
	}

	/**
	 * 
	 * @return The members
	 */
	@JsonProperty("members")
	public List<String> getMembers() {
		return members;
	}

	/**
	 * 
	 * @param members
	 *            The members
	 */
	@JsonProperty("members")
	public void setMembers(List<String> members) {
		this.members = members;
	}

	/**
	 * 
	 * @return The topic
	 */
	@JsonProperty("topic")
	public Topic getTopic() {
		return topic;
	}

	/**
	 * 
	 * @param topic
	 *            The topic
	 */
	@JsonProperty("topic")
	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	/**
	 * 
	 * @return The purpose
	 */
	@JsonProperty("purpose")
	public Purpose getPurpose() {
		return purpose;
	}

	/**
	 * 
	 * @param purpose
	 *            The purpose
	 */
	@JsonProperty("purpose")
	public void setPurpose(Purpose purpose) {
		this.purpose = purpose;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
