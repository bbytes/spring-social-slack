package org.springframework.social.slack.api.impl.model;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackAttachment {

	private static final String HEX_REGEX = "^([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
	private static final String PREDEFINED_COLOR_REGEX = "^(good|warning|danger)$";

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("fallback")
	private String fallback;

	@JsonProperty("color")
	private String color;

	@JsonProperty("pretext")
	private String pretext;

	@JsonProperty("author_name")
	private String author_name;

	@JsonProperty("author_link")
	private String author_link;

	@JsonProperty("author_icon")
	private String author_icon;

	@JsonProperty("title")
	private String title;

	@JsonProperty("title_link")
	private String title_link;

	@JsonProperty("text")
	private String text;

	@JsonProperty("fields")
	private List<Field> fields;

	@JsonProperty("image_url")
	private String image_url;

	@JsonProperty("thumb_url")
	private String thumb_url;

	@JsonProperty("mrkdwn_in")
	private List<String> mrkdwn_in;

	@JsonProperty("footer")
	private String footer;

	@JsonProperty("footer_icon")
	private String footer_icon;

	@JsonProperty("ts")
	private Integer ts;

	public String getFallback() {
		return fallback;
	}

	public void setFallback(String fallback) {
		this.fallback = fallback;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color != null) {
			if (color.charAt(0) == '#') {
				if (!color.substring(1).matches(HEX_REGEX)) {
					throw new IllegalArgumentException("invalid hex color");
				}
			} else if (!color.isEmpty()) {
				if (!color.matches(HEX_REGEX) && !color.matches(PREDEFINED_COLOR_REGEX)) {
					throw new IllegalArgumentException("invalid color");
				}
			}
		}

		this.color = color;
	}

	public void setColor(Color color) {
		if (color != null) {
			this.color = color.name().toLowerCase();
		}
	}

	public String getPretext() {
		return pretext;
	}

	public void setPretext(String pretext) {
		this.pretext = pretext;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public String getAuthor_link() {
		return author_link;
	}

	public void setAuthor_link(String author_link) {
		this.author_link = author_link;
	}

	public String getAuthor_icon() {
		return author_icon;
	}

	public void setAuthor_icon(String author_icon) {
		this.author_icon = author_icon;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle_link() {
		return title_link;
	}

	public void setTitle_link(String title_link) {
		this.title_link = title_link;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void addField(Field field) {
		getFields().add(field);
	}

	public List<Field> getFields() {
		if (fields == null) {
			fields = new ArrayList<Field>();
		}
		return fields;
	}

	public void setFields(List<Field> fields) {
		this.fields = fields;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public String getThumb_url() {
		return thumb_url;
	}

	public void setThumb_url(String thumb_url) {
		this.thumb_url = thumb_url;
	}

	public void addMrkdwn_in(String field) {
		getMrkdwn_in().add(field);
	}

	public List<String> getMrkdwn_in() {
		if (mrkdwn_in == null) {
			mrkdwn_in = new ArrayList<String>();
		}
		return mrkdwn_in;
	}

	public void setMrkdwn_in(List<String> mrkdwn_in) {
		this.mrkdwn_in = mrkdwn_in;
	}

	public String getFooter() {
		return footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	public String getFooter_icon() {
		return footer_icon;
	}

	public void setFooter_icon(String footer_icon) {
		this.footer_icon = footer_icon;
	}

	public Integer getTs() {
		return ts;
	}

	public void setTs(Integer ts) {
		this.ts = ts;
	}

	@Override
	public String toString() {
		return "Attachment{" + "fallback='" + fallback + '\'' + ", color='" + color + '\'' + ", pretext='" + pretext
				+ '\'' + ", author_name='" + author_name + '\'' + ", author_link='" + author_link + '\''
				+ ", author_icon='" + author_icon + '\'' + ", title='" + title + '\'' + ", title_link='" + title_link
				+ '\'' + ", text='" + text + '\'' + ", fields=" + fields + ", image_url='" + image_url + '\''
				+ ", thumb_url='" + thumb_url + '\'' + ", mrkdwn_in=" + mrkdwn_in + ", footer='" + footer + '\''
				+ ", footer_icon='" + footer_icon + '\'' + ", ts=" + ts + '}';
	}

}