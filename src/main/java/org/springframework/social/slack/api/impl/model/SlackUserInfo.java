package org.springframework.social.slack.api.impl.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SlackUserInfo {

	@JsonProperty("first_name")
	private String firstName;
	@JsonProperty("last_name")
	private String lastName;
	@JsonProperty("real_name")
	private String realName;
	@JsonProperty("real_name_normalized")
	private String realNameNormalized;
	@JsonProperty("email")
	private String email;
	@JsonProperty("image_24")
	private String image24;
	@JsonProperty("image_32")
	private String image32;
	@JsonProperty("image_48")
	private String image48;
	@JsonProperty("image_72")
	private String image72;
	@JsonProperty("image_192")
	private String image192;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	*
	* @return
	* The firstName
	*/
	@JsonProperty("first_name")
	public String getFirstName() {
	return firstName;
	}

	/**
	*
	* @param firstName
	* The first_name
	*/
	@JsonProperty("first_name")
	public void setFirstName(String firstName) {
	this.firstName = firstName;
	}

	/**
	*
	* @return
	* The lastName
	*/
	@JsonProperty("last_name")
	public String getLastName() {
	return lastName;
	}

	/**
	*
	* @param lastName
	* The last_name
	*/
	@JsonProperty("last_name")
	public void setLastName(String lastName) {
	this.lastName = lastName;
	}

	/**
	*
	* @return
	* The realName
	*/
	@JsonProperty("real_name")
	public String getRealName() {
	return realName;
	}

	/**
	*
	* @param realName
	* The real_name
	*/
	@JsonProperty("real_name")
	public void setRealName(String realName) {
	this.realName = realName;
	}

	/**
	*
	* @return
	* The realNameNormalized
	*/
	@JsonProperty("real_name_normalized")
	public String getRealNameNormalized() {
	return realNameNormalized;
	}

	/**
	*
	* @param realNameNormalized
	* The real_name_normalized
	*/
	@JsonProperty("real_name_normalized")
	public void setRealNameNormalized(String realNameNormalized) {
	this.realNameNormalized = realNameNormalized;
	}

	/**
	*
	* @return
	* The email
	*/
	@JsonProperty("email")
	public String getEmail() {
	return email;
	}

	/**
	*
	* @param email
	* The email
	*/
	@JsonProperty("email")
	public void setEmail(String email) {
	this.email = email;
	}

	/**
	*
	* @return
	* The image24
	*/
	@JsonProperty("image_24")
	public String getImage24() {
	return image24;
	}

	/**
	*
	* @param image24
	* The image_24
	*/
	@JsonProperty("image_24")
	public void setImage24(String image24) {
	this.image24 = image24;
	}

	/**
	*
	* @return
	* The image32
	*/
	@JsonProperty("image_32")
	public String getImage32() {
	return image32;
	}

	/**
	*
	* @param image32
	* The image_32
	*/
	@JsonProperty("image_32")
	public void setImage32(String image32) {
	this.image32 = image32;
	}

	/**
	*
	* @return
	* The image48
	*/
	@JsonProperty("image_48")
	public String getImage48() {
	return image48;
	}

	/**
	*
	* @param image48
	* The image_48
	*/
	@JsonProperty("image_48")
	public void setImage48(String image48) {
	this.image48 = image48;
	}

	/**
	*
	* @return
	* The image72
	*/
	@JsonProperty("image_72")
	public String getImage72() {
	return image72;
	}

	/**
	*
	* @param image72
	* The image_72
	*/
	@JsonProperty("image_72")
	public void setImage72(String image72) {
	this.image72 = image72;
	}

	/**
	*
	* @return
	* The image192
	*/
	@JsonProperty("image_192")
	public String getImage192() {
	return image192;
	}

	/**
	*
	* @param image192
	* The image_192
	*/
	@JsonProperty("image_192")
	public void setImage192(String image192) {
	this.image192 = image192;
	}
}
