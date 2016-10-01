package org.springframework.social.slack.api.impl;

import org.springframework.social.slack.api.FileCommentsOperations;
import org.springframework.social.slack.api.impl.model.SlackCommentResponse;
import org.springframework.social.slack.api.impl.model.SlackResponse;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;

public class FileCommentsTemplate extends AbstractTemplate implements FileCommentsOperations {

	public FileCommentsTemplate(RestOperations restOperations) {
		super(restOperations);
	}

	@Override
	public SlackCommentResponse addFileComment(String file, String comment) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("file", file);
		paramMap.add("comment", comment);

		SlackCommentResponse slackCommentResponse = get("/files.comments.add", SlackCommentResponse.class);
		return slackCommentResponse;
	}

	@Override
	public SlackCommentResponse editFileComment(String file, String id, String comment) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("file", file);
		paramMap.add("id", id);
		paramMap.add("comment", comment);

		SlackCommentResponse slackCommentResponse = get("/files.comments.edit", SlackCommentResponse.class);
		return slackCommentResponse;
	}

	@Override
	public SlackResponse deleteFileComment(String file, String id) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("file", file);
		paramMap.add("id", id);
		
		SlackResponse slackResponse = get("/files.comments.delete", SlackResponse.class);
		return slackResponse;
	}

}
