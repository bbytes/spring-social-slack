package org.springframework.social.slack.api.impl;

import java.io.File;
import java.nio.file.Files;

import org.apache.commons.io.FilenameUtils;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.social.slack.api.FilesOperations;
import org.springframework.social.slack.api.impl.model.SlackFileInfo;
import org.springframework.social.slack.api.impl.model.SlackFileListResponse;
import org.springframework.social.slack.api.impl.model.SlackFileResponse;
import org.springframework.social.slack.api.impl.model.SlackResponse;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;

public class FileTemplate extends AbstractTemplate implements FilesOperations {

	public FileTemplate(RestOperations restOperations) {
		super(restOperations);
	}

	@Override
	public SlackResponse deleteFile(String fileId) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("file", fileId);
		SlackResponse slackResponse = get("/files.delete", paramMap, SlackResponse.class);
		return slackResponse;
	}

	@Override
	public SlackFileInfo getFileInfo(String fileId) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("file", fileId);
		SlackFileInfo slackFileInfo = get("/files.info", paramMap, SlackFileInfo.class);
		return slackFileInfo;
	}

	@Override
	public SlackFileInfo getFileInfo(String fileId, int page) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("file", fileId);
		paramMap.add("page", new Integer(page).toString());
		SlackFileInfo slackFileInfo = get("/files.info", paramMap, SlackFileInfo.class);
		return slackFileInfo;
	}

	@Override
	public SlackFileInfo getFileInfo(String fileId, int page, int count) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("file", fileId);
		paramMap.add("page", new Integer(page).toString());
		paramMap.add("count", new Integer(count).toString());
		SlackFileInfo slackFileInfo = get("/files.info", paramMap, SlackFileInfo.class);
		return slackFileInfo;
	}

	@Override
	public SlackFileListResponse getFileList() {
		SlackFileListResponse slackFileListResponse = get("/files.list", SlackFileListResponse.class);
		return slackFileListResponse;
	}

	@Override
	public SlackFileListResponse getFileList(int page) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("page", new Integer(page).toString());
		SlackFileListResponse slackFileListResponse = get("/files.list", SlackFileListResponse.class);
		return slackFileListResponse;
	}

	@Override
	public SlackFileListResponse getFileList(int page, int count) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("page", new Integer(page).toString());
		paramMap.add("count", new Integer(count).toString());
		SlackFileListResponse slackFileListResponse = get("/files.list", SlackFileListResponse.class);
		return slackFileListResponse;
	}

	@Override
	public SlackFileListResponse getFileListForUser(String userId) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("user", userId);
		SlackFileListResponse slackFileListResponse = get("/files.list", SlackFileListResponse.class);
		return slackFileListResponse;
	}
	
	@Override
	public SlackFileListResponse getFileListForChannel(String channelId) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channelId);
		SlackFileListResponse slackFileListResponse = get("/files.list", SlackFileListResponse.class);
		return slackFileListResponse;
	}

	@Override
	public SlackFileListResponse getFileList(String channelId, String userId) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("channel", channelId);
		paramMap.add("user", userId);
		SlackFileListResponse slackFileListResponse = get("/files.list", SlackFileListResponse.class);
		return slackFileListResponse;
	}
	
	@Override
	public SlackFileListResponse getFileList(String userId, int page) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("user", userId);
		paramMap.add("page", new Integer(page).toString());

		SlackFileListResponse slackFileListResponse = get("/files.list", SlackFileListResponse.class);
		return slackFileListResponse;
	}

	@Override
	public SlackFileListResponse getFileList(String userId, int page, int count) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("user", userId);
		paramMap.add("page", new Integer(page).toString());
		paramMap.add("count", new Integer(count).toString());

		SlackFileListResponse slackFileListResponse = get("/files.list", SlackFileListResponse.class);
		return slackFileListResponse;
	}

	@Override
	public SlackFileListResponse getFileList(String userId, String ts_from, String ts_to, String types, int page,
			int count) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("user", userId);
		paramMap.add("page", new Integer(page).toString());
		paramMap.add("count", new Integer(count).toString());
		paramMap.add("ts_from", ts_from);
		paramMap.add("ts_to", ts_to);
		paramMap.add("types", types);

		SlackFileListResponse slackFileListResponse = get("/files.list", SlackFileListResponse.class);
		return slackFileListResponse;
	}

	@Override
	public SlackFileResponse revokeFilePublicURL(String fileId) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("file", fileId);

		SlackFileResponse slackFileResponse = get("/files.revokePublicURL", SlackFileResponse.class);
		return slackFileResponse;
	}

	@Override
	public SlackFileResponse sharedFilePublicURL(String fileId) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("file", fileId);

		SlackFileResponse slackFileResponse = get("/files.sharedPublicURL", SlackFileResponse.class);
		return slackFileResponse;
	}

	@Override
	public SlackFileResponse uploadFile(File file, String title, String initialComment, String channels)
			throws Exception {
		LinkedMultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
		map.add("file", new FileSystemResource(file));
		map.add("title", title);
		map.add("filetype", FilenameUtils.getExtension(file.getName()));
		map.add("initialComment", initialComment);
		map.add("channels", channels);

		return uploadFileViaPost(map);

	}

	@Override
	public SlackFileResponse uploadFile(File file, String title, String fileType, String initialComment,
			String channels) throws Exception {
		LinkedMultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
		map.add("file", new FileSystemResource(file));
		map.add("title", title);
		map.add("filetype", fileType);
		map.add("initialComment", initialComment);
		map.add("channels", channels);

		return uploadFileViaPost(map);
	}

	@Override
	public SlackFileResponse uploadFile(File file, String title, String channels) throws Exception {
		LinkedMultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
		map.add("file", new FileSystemResource(file));
		map.add("title", title);
		map.add("filetype", FilenameUtils.getExtension(file.getName()));
		map.add("channels", channels);

		return uploadFileViaPost(map);
	}

	@Override
	public SlackFileResponse uploadFile(File file, String title) throws Exception {
		LinkedMultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
		map.add("file", new FileSystemResource(file));
		map.add("title", title);
		map.add("filetype", FilenameUtils.getExtension(file.getName()));

		return uploadFileViaPost(map);
	}

	private SlackFileResponse uploadFileViaPost(LinkedMultiValueMap<String, Object> map) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);
		HttpEntity<LinkedMultiValueMap<String, Object>> requestEntity = new HttpEntity<LinkedMultiValueMap<String, Object>>(
				map, headers);
		SlackFileResponse slackFileResponse = post("/files.upload", requestEntity, SlackFileResponse.class);
		return slackFileResponse;
	}



}
