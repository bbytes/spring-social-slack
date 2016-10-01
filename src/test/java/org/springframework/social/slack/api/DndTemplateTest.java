package org.springframework.social.slack.api;

import java.util.Map;

import org.junit.Test;
import org.springframework.social.slack.api.impl.SlackException;
import org.springframework.social.slack.api.impl.model.DndSimpleInfo;
import org.springframework.social.slack.api.impl.model.SlackDndInfoResponse;
import org.springframework.util.Assert;

public class DndTemplateTest extends AbstractSlackApiTest {

	@Test
	public void testDndInfo() throws SlackException {
		SlackDndInfoResponse response = getSlackTemplate().dndOperations().getDndInfo();
		Assert.isTrue(response.isOk());
		System.out.println(response);
	}

	@Test
	public void testTeamDndInfo() throws SlackException {

		Map<String, DndSimpleInfo> result = getSlackTemplate().dndOperations().getDndTeamInfo();
		Assert.isTrue(!result.isEmpty());
		System.out.println(result);

	}

}
