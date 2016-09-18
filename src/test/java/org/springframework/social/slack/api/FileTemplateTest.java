package org.springframework.social.slack.api;

import java.io.File;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Test;
import org.springframework.social.slack.api.impl.model.SlackFileListResponse;
import org.springframework.social.slack.api.impl.model.SlackFileResponse;
import org.springframework.social.slack.api.impl.model.SlackResponse;
import org.springframework.util.Assert;

public class FileTemplateTest extends AbstractSlackApiTest {

	@Test
	public void testListFiles() {

		SlackFileListResponse filelIstResp = getSlackTemplate().filesOperations().getFileList();
		Assert.notNull(filelIstResp);
		Assert.isTrue(filelIstResp.isOk());

		System.out.println(ToStringBuilder.reflectionToString(filelIstResp, ToStringStyle.MULTI_LINE_STYLE));
	}

	@Test
	public void testDeleteFile() {
		SlackFileListResponse filelIstResp = getSlackTemplate().filesOperations().getFileList();
		Assert.notNull(filelIstResp.getFiles().get(0).getId());
		SlackResponse response = getSlackTemplate().filesOperations()
				.deleteFile(filelIstResp.getFiles().get(0).getId());
		Assert.isTrue(response.isOk());

		System.out.println(ToStringBuilder.reflectionToString(filelIstResp, ToStringStyle.MULTI_LINE_STYLE));

	}

	@Test
	public void testUplaodFile() throws Exception {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("files/sample.txt").getFile());
		SlackFileResponse slackFileResponse = getSlackTemplate().filesOperations().uploadFile(file,
				"Spring-test-upload");
		Assert.isTrue(slackFileResponse.isOk());

		System.out.println(ToStringBuilder.reflectionToString(slackFileResponse, ToStringStyle.MULTI_LINE_STYLE));

	}

	@Test
	/**
	 * This method takes a while to execute due to the time it takes to upload
	 * file to slack server
	 * 
	 * @throws Exception
	 */
	public void testUplaodLargeFile() throws Exception {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File(classLoader.getResource("files/test10Mb.db").getFile());
		SlackFileResponse slackFileResponse = getSlackTemplate().filesOperations().uploadFile(file,
				"Spring-10mb-file-test-upload");
		Assert.isTrue(slackFileResponse.isOk());

		System.out.println(ToStringBuilder.reflectionToString(slackFileResponse, ToStringStyle.MULTI_LINE_STYLE));

	}

}
