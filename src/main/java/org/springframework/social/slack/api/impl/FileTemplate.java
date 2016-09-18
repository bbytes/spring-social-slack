package org.springframework.social.slack.api.impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.FilenameUtils;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.social.slack.api.FilesOperations;
import org.springframework.social.slack.api.impl.model.SlackFile;
import org.springframework.social.slack.api.impl.model.SlackFileInfo;
import org.springframework.social.slack.api.impl.model.SlackFileList;
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
	public SlackFileList getFileList() {
		SlackFileList slackFileInfo = get("/files.list", SlackFileList.class);
		return slackFileInfo;
	}

	@Override
	public SlackFileList getFileList(int page) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("page", new Integer(page).toString());
		SlackFileList slackFileList = get("/files.list", SlackFileList.class);
		return slackFileList;
	}

	@Override
	public SlackFileList getFileList(int page, int count) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("page", new Integer(page).toString());
		paramMap.add("count", new Integer(count).toString());
		SlackFileList slackFileList = get("/files.list", SlackFileList.class);
		return slackFileList;
	}

	@Override
	public SlackFileList getFileList(String userId) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("user", userId);
		SlackFileList slackFileList = get("/files.list", SlackFileList.class);
		return slackFileList;
	}

	@Override
	public SlackFileList getFileList(String userId, int page) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("user", userId);
		paramMap.add("page", new Integer(page).toString());

		SlackFileList slackFileList = get("/files.list", SlackFileList.class);
		return slackFileList;
	}

	@Override
	public SlackFileList getFileList(String userId, int page, int count) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("user", userId);
		paramMap.add("page", new Integer(page).toString());
		paramMap.add("count", new Integer(count).toString());

		SlackFileList slackFileList = get("/files.list", SlackFileList.class);
		return slackFileList;
	}

	@Override
	public SlackFileList getFileList(String userId, String ts_from, String ts_to, String types, int page, int count) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("user", userId);
		paramMap.add("page", new Integer(page).toString());
		paramMap.add("count", new Integer(count).toString());
		paramMap.add("ts_from", ts_from);
		paramMap.add("ts_to", ts_to);
		paramMap.add("types", types);

		SlackFileList slackFileList = get("/files.list", SlackFileList.class);
		return slackFileList;
	}

	@Override
	public SlackFile revokeFilePublicURL(String fileId) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("file", fileId);

		SlackFile slackFile = get("/files.revokePublicURL", SlackFile.class);
		return slackFile;
	}

	@Override
	public SlackFile sharedFilePublicURL(String fileId) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("file", fileId);

		SlackFile slackFile = get("/files.sharedPublicURL", SlackFile.class);
		return slackFile;
	}

	@Override
	public SlackFile uploadFile(File file, String title, String initialComment, String channels) throws Exception {
		LinkedMultiValueMap<String, Object> map = new LinkedMultiValueMap<>();
		map.add("file", new ByteArrayResource(Files.readAllBytes(file.toPath())));
		map.add("title", title);
		map.add("filetype", FilenameUtils.getExtension(file.getName()));
		map.add("initialComment", initialComment);
		map.add("channels", channels);
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);
		HttpEntity<LinkedMultiValueMap<String, Object>> requestEntity = new HttpEntity<LinkedMultiValueMap<String, Object>>(
				map, headers);
		SlackFile slackFile = post("/files.upload", requestEntity, SlackFile.class);
		return slackFile;

	}

}
