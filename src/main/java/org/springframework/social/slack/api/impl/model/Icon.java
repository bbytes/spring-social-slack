
package org.springframework.social.slack.api.impl.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Icon {

	@JsonProperty("image_34")
	private String image34;
	@JsonProperty("image_44")
	private String image44;
	@JsonProperty("image_68")
	private String image68;
	@JsonProperty("image_88")
	private String image88;
	@JsonProperty("image_102")
	private String image102;
	@JsonProperty("image_132")
	private String image132;
	@JsonProperty("image_default")
	private Boolean imageDefault;

	/**
	 * 
	 * @return The image34
	 */
	@JsonProperty("image_34")
	public String getImage34() {
		return image34;
	}

	/**
	 * 
	 * @param image34
	 *            The image_34
	 */
	@JsonProperty("image_34")
	public void setImage34(String image34) {
		this.image34 = image34;
	}

	/**
	 * 
	 * @return The image44
	 */
	@JsonProperty("image_44")
	public String getImage44() {
		return image44;
	}

	/**
	 * 
	 * @param image44
	 *            The image_44
	 */
	@JsonProperty("image_44")
	public void setImage44(String image44) {
		this.image44 = image44;
	}

	/**
	 * 
	 * @return The image68
	 */
	@JsonProperty("image_68")
	public String getImage68() {
		return image68;
	}

	/**
	 * 
	 * @param image68
	 *            The image_68
	 */
	@JsonProperty("image_68")
	public void setImage68(String image68) {
		this.image68 = image68;
	}

	/**
	 * 
	 * @return The image88
	 */
	@JsonProperty("image_88")
	public String getImage88() {
		return image88;
	}

	/**
	 * 
	 * @param image88
	 *            The image_88
	 */
	@JsonProperty("image_88")
	public void setImage88(String image88) {
		this.image88 = image88;
	}

	/**
	 * 
	 * @return The image102
	 */
	@JsonProperty("image_102")
	public String getImage102() {
		return image102;
	}

	/**
	 * 
	 * @param image102
	 *            The image_102
	 */
	@JsonProperty("image_102")
	public void setImage102(String image102) {
		this.image102 = image102;
	}

	/**
	 * 
	 * @return The image132
	 */
	@JsonProperty("image_132")
	public String getImage132() {
		return image132;
	}

	/**
	 * 
	 * @param image132
	 *            The image_132
	 */
	@JsonProperty("image_132")
	public void setImage132(String image132) {
		this.image132 = image132;
	}

	/**
	 * 
	 * @return The imageDefault
	 */
	@JsonProperty("image_default")
	public Boolean getImageDefault() {
		return imageDefault;
	}

	/**
	 * 
	 * @param imageDefault
	 *            The image_default
	 */
	@JsonProperty("image_default")
	public void setImageDefault(Boolean imageDefault) {
		this.imageDefault = imageDefault;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
