package org.springframework.social.slack.api.impl.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SlackFile {

	@JsonProperty("id")
	private String id;
	@JsonProperty("timestamp")
	private Integer timestamp;
	@JsonProperty("name")
	private String name;
	@JsonProperty("title")
	private String title;
	@JsonProperty("mimetype")
	private String mimetype;
	@JsonProperty("filetype")
	private String filetype;
	@JsonProperty("pretty_type")
	private String prettyType;
	@JsonProperty("user")
	private String user;
	@JsonProperty("mode")
	private String mode;
	@JsonProperty("editable")
	private Boolean editable;
	@JsonProperty("is_external")
	private Boolean isExternal;
	@JsonProperty("external_type")
	private String externalType;
	@JsonProperty("size")
	private Integer size;
	@JsonProperty("url")
	private String url;
	@JsonProperty("url_download")
	private String urlDownload;
	@JsonProperty("url_private")
	private String urlPrivate;
	@JsonProperty("url_private_download")
	private String urlPrivateDownload;
	@JsonProperty("thumb_64")
	private String thumb64;
	@JsonProperty("thumb_80")
	private String thumb80;
	@JsonProperty("thumb_360")
	private String thumb360;
	@JsonProperty("thumb_360_gif")
	private String thumb360Gif;
	@JsonProperty("thumb_360_w")
	private Integer thumb360W;
	@JsonProperty("thumb_360_h")
	private Integer thumb360H;
	@JsonProperty("permalink")
	private String permalink;
	@JsonProperty("edit_link")
	private String editLink;
	@JsonProperty("preview")
	private String preview;
	@JsonProperty("preview_highlight")
	private String previewHighlight;
	@JsonProperty("lines")
	private Integer lines;
	@JsonProperty("lines_more")
	private Integer linesMore;
	@JsonProperty("is_public")
	private Boolean isPublic;
	@JsonProperty("public_url_shared")
	private Boolean publicUrlShared;
	@JsonProperty("channels")
	private List<String> channels = new ArrayList<String>();
	@JsonProperty("groups")
	private List<String> groups = new ArrayList<String>();
	@JsonProperty("initial_comment")
	private SlackComment initialComment;
	@JsonProperty("num_stars")
	private Integer numStars;
	@JsonProperty("is_starred")
	private Boolean isStarred;

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
	 * @return The timestamp
	 */
	@JsonProperty("timestamp")
	public Integer getTimestamp() {
		return timestamp;
	}

	/**
	 * 
	 * @param timestamp
	 *            The timestamp
	 */
	@JsonProperty("timestamp")
	public void setTimestamp(Integer timestamp) {
		this.timestamp = timestamp;
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
	 * @return The title
	 */
	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	/**
	 * 
	 * @param title
	 *            The title
	 */
	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 
	 * @return The mimetype
	 */
	@JsonProperty("mimetype")
	public String getMimetype() {
		return mimetype;
	}

	/**
	 * 
	 * @param mimetype
	 *            The mimetype
	 */
	@JsonProperty("mimetype")
	public void setMimetype(String mimetype) {
		this.mimetype = mimetype;
	}

	/**
	 * 
	 * @return The filetype
	 */
	@JsonProperty("filetype")
	public String getFiletype() {
		return filetype;
	}

	/**
	 * 
	 * @param filetype
	 *            The filetype
	 */
	@JsonProperty("filetype")
	public void setFiletype(String filetype) {
		this.filetype = filetype;
	}

	/**
	 * 
	 * @return The prettyType
	 */
	@JsonProperty("pretty_type")
	public String getPrettyType() {
		return prettyType;
	}

	/**
	 * 
	 * @param prettyType
	 *            The pretty_type
	 */
	@JsonProperty("pretty_type")
	public void setPrettyType(String prettyType) {
		this.prettyType = prettyType;
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
	 * @return The mode
	 */
	@JsonProperty("mode")
	public String getMode() {
		return mode;
	}

	/**
	 * 
	 * @param mode
	 *            The mode
	 */
	@JsonProperty("mode")
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * 
	 * @return The editable
	 */
	@JsonProperty("editable")
	public Boolean getEditable() {
		return editable;
	}

	/**
	 * 
	 * @param editable
	 *            The editable
	 */
	@JsonProperty("editable")
	public void setEditable(Boolean editable) {
		this.editable = editable;
	}

	/**
	 * 
	 * @return The isExternal
	 */
	@JsonProperty("is_external")
	public Boolean getIsExternal() {
		return isExternal;
	}

	/**
	 * 
	 * @param isExternal
	 *            The is_external
	 */
	@JsonProperty("is_external")
	public void setIsExternal(Boolean isExternal) {
		this.isExternal = isExternal;
	}

	/**
	 * 
	 * @return The externalType
	 */
	@JsonProperty("external_type")
	public String getExternalType() {
		return externalType;
	}

	/**
	 * 
	 * @param externalType
	 *            The external_type
	 */
	@JsonProperty("external_type")
	public void setExternalType(String externalType) {
		this.externalType = externalType;
	}

	/**
	 * 
	 * @return The size
	 */
	@JsonProperty("size")
	public Integer getSize() {
		return size;
	}

	/**
	 * 
	 * @param size
	 *            The size
	 */
	@JsonProperty("size")
	public void setSize(Integer size) {
		this.size = size;
	}

	/**
	 * 
	 * @return The url
	 */
	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	/**
	 * 
	 * @param url
	 *            The url
	 */
	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 
	 * @return The urlDownload
	 */
	@JsonProperty("url_download")
	public String getUrlDownload() {
		return urlDownload;
	}

	/**
	 * 
	 * @param urlDownload
	 *            The url_download
	 */
	@JsonProperty("url_download")
	public void setUrlDownload(String urlDownload) {
		this.urlDownload = urlDownload;
	}

	/**
	 * 
	 * @return The urlPrivate
	 */
	@JsonProperty("url_private")
	public String getUrlPrivate() {
		return urlPrivate;
	}

	/**
	 * 
	 * @param urlPrivate
	 *            The url_private
	 */
	@JsonProperty("url_private")
	public void setUrlPrivate(String urlPrivate) {
		this.urlPrivate = urlPrivate;
	}

	/**
	 * 
	 * @return The urlPrivateDownload
	 */
	@JsonProperty("url_private_download")
	public String getUrlPrivateDownload() {
		return urlPrivateDownload;
	}

	/**
	 * 
	 * @param urlPrivateDownload
	 *            The url_private_download
	 */
	@JsonProperty("url_private_download")
	public void setUrlPrivateDownload(String urlPrivateDownload) {
		this.urlPrivateDownload = urlPrivateDownload;
	}

	/**
	 * 
	 * @return The thumb64
	 */
	@JsonProperty("thumb_64")
	public String getThumb64() {
		return thumb64;
	}

	/**
	 * 
	 * @param thumb64
	 *            The thumb_64
	 */
	@JsonProperty("thumb_64")
	public void setThumb64(String thumb64) {
		this.thumb64 = thumb64;
	}

	/**
	 * 
	 * @return The thumb80
	 */
	@JsonProperty("thumb_80")
	public String getThumb80() {
		return thumb80;
	}

	/**
	 * 
	 * @param thumb80
	 *            The thumb_80
	 */
	@JsonProperty("thumb_80")
	public void setThumb80(String thumb80) {
		this.thumb80 = thumb80;
	}

	/**
	 * 
	 * @return The thumb360
	 */
	@JsonProperty("thumb_360")
	public String getThumb360() {
		return thumb360;
	}

	/**
	 * 
	 * @param thumb360
	 *            The thumb_360
	 */
	@JsonProperty("thumb_360")
	public void setThumb360(String thumb360) {
		this.thumb360 = thumb360;
	}

	/**
	 * 
	 * @return The thumb360Gif
	 */
	@JsonProperty("thumb_360_gif")
	public String getThumb360Gif() {
		return thumb360Gif;
	}

	/**
	 * 
	 * @param thumb360Gif
	 *            The thumb_360_gif
	 */
	@JsonProperty("thumb_360_gif")
	public void setThumb360Gif(String thumb360Gif) {
		this.thumb360Gif = thumb360Gif;
	}

	/**
	 * 
	 * @return The thumb360W
	 */
	@JsonProperty("thumb_360_w")
	public Integer getThumb360W() {
		return thumb360W;
	}

	/**
	 * 
	 * @param thumb360W
	 *            The thumb_360_w
	 */
	@JsonProperty("thumb_360_w")
	public void setThumb360W(Integer thumb360W) {
		this.thumb360W = thumb360W;
	}

	/**
	 * 
	 * @return The thumb360H
	 */
	@JsonProperty("thumb_360_h")
	public Integer getThumb360H() {
		return thumb360H;
	}

	/**
	 * 
	 * @param thumb360H
	 *            The thumb_360_h
	 */
	@JsonProperty("thumb_360_h")
	public void setThumb360H(Integer thumb360H) {
		this.thumb360H = thumb360H;
	}

	/**
	 * 
	 * @return The permalink
	 */
	@JsonProperty("permalink")
	public String getPermalink() {
		return permalink;
	}

	/**
	 * 
	 * @param permalink
	 *            The permalink
	 */
	@JsonProperty("permalink")
	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

	/**
	 * 
	 * @return The editLink
	 */
	@JsonProperty("edit_link")
	public String getEditLink() {
		return editLink;
	}

	/**
	 * 
	 * @param editLink
	 *            The edit_link
	 */
	@JsonProperty("edit_link")
	public void setEditLink(String editLink) {
		this.editLink = editLink;
	}

	/**
	 * 
	 * @return The preview
	 */
	@JsonProperty("preview")
	public String getPreview() {
		return preview;
	}

	/**
	 * 
	 * @param preview
	 *            The preview
	 */
	@JsonProperty("preview")
	public void setPreview(String preview) {
		this.preview = preview;
	}

	/**
	 * 
	 * @return The previewHighlight
	 */
	@JsonProperty("preview_highlight")
	public String getPreviewHighlight() {
		return previewHighlight;
	}

	/**
	 * 
	 * @param previewHighlight
	 *            The preview_highlight
	 */
	@JsonProperty("preview_highlight")
	public void setPreviewHighlight(String previewHighlight) {
		this.previewHighlight = previewHighlight;
	}

	/**
	 * 
	 * @return The lines
	 */
	@JsonProperty("lines")
	public Integer getLines() {
		return lines;
	}

	/**
	 * 
	 * @param lines
	 *            The lines
	 */
	@JsonProperty("lines")
	public void setLines(Integer lines) {
		this.lines = lines;
	}

	/**
	 * 
	 * @return The linesMore
	 */
	@JsonProperty("lines_more")
	public Integer getLinesMore() {
		return linesMore;
	}

	/**
	 * 
	 * @param linesMore
	 *            The lines_more
	 */
	@JsonProperty("lines_more")
	public void setLinesMore(Integer linesMore) {
		this.linesMore = linesMore;
	}

	/**
	 * 
	 * @return The isPublic
	 */
	@JsonProperty("is_public")
	public Boolean getIsPublic() {
		return isPublic;
	}

	/**
	 * 
	 * @param isPublic
	 *            The is_public
	 */
	@JsonProperty("is_public")
	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}

	/**
	 * 
	 * @return The publicUrlShared
	 */
	@JsonProperty("public_url_shared")
	public Boolean getPublicUrlShared() {
		return publicUrlShared;
	}

	/**
	 * 
	 * @param publicUrlShared
	 *            The public_url_shared
	 */
	@JsonProperty("public_url_shared")
	public void setPublicUrlShared(Boolean publicUrlShared) {
		this.publicUrlShared = publicUrlShared;
	}

	/**
	 * 
	 * @return The channels
	 */
	@JsonProperty("channels")
	public List<String> getChannels() {
		return channels;
	}

	/**
	 * 
	 * @param channels
	 *            The channels
	 */
	@JsonProperty("channels")
	public void setChannels(List<String> channels) {
		this.channels = channels;
	}

	/**
	 * 
	 * @return The groups
	 */
	@JsonProperty("groups")
	public List<String> getGroups() {
		return groups;
	}

	/**
	 * 
	 * @param groups
	 *            The groups
	 */
	@JsonProperty("groups")
	public void setGroups(List<String> groups) {
		this.groups = groups;
	}

	/**
	 * 
	 * @return The initialComment
	 */
	@JsonProperty("initial_comment")
	public SlackComment getInitialComment() {
		return initialComment;
	}

	/**
	 * 
	 * @param initialComment
	 *            The initial_comment
	 */
	@JsonProperty("initial_comment")
	public void setInitialComment(SlackComment initialComment) {
		this.initialComment = initialComment;
	}

	/**
	 * 
	 * @return The numStars
	 */
	@JsonProperty("num_stars")
	public Integer getNumStars() {
		return numStars;
	}

	/**
	 * 
	 * @param numStars
	 *            The num_stars
	 */
	@JsonProperty("num_stars")
	public void setNumStars(Integer numStars) {
		this.numStars = numStars;
	}

	/**
	 * 
	 * @return The isStarred
	 */
	@JsonProperty("is_starred")
	public Boolean getIsStarred() {
		return isStarred;
	}

	/**
	 * 
	 * @param isStarred
	 *            The is_starred
	 */
	@JsonProperty("is_starred")
	public void setIsStarred(Boolean isStarred) {
		this.isStarred = isStarred;
	}

}
