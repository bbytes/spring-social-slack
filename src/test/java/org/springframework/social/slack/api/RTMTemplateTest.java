package org.springframework.social.slack.api;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Test;
import org.springframework.social.slack.api.impl.model.SlackRTMResponse;
import org.springframework.social.slack.rtm.RTMClient;
import org.springframework.social.slack.rtm.SlackEvent;
import org.springframework.social.slack.rtm.SlackEventListener;
import org.springframework.util.Assert;

public class RTMTemplateTest extends AbstractSlackApiTest {

	@Test
	public void testRTMResponse() {
		SlackRTMResponse slackRTMResponse = getSlackTemplate().rtmOperations().startRealTimeMessagingApi();
		System.out.println(ToStringBuilder.reflectionToString(slackRTMResponse, ToStringStyle.MULTI_LINE_STYLE));
		Assert.isTrue(slackRTMResponse.isOk());
	}

	@Test
	public void testRTMMessaging() throws Exception {
		SlackRTMResponse slackRTMResponse = getSlackTemplate().rtmOperations().startRealTimeMessagingApi();
		RTMClient rtmClient = getSlackTemplate().rtmOperations().getRTMClient(slackRTMResponse);

		rtmClient.addListener(SlackEvent.message, new SlackEventListener() {

			@Override
			public void handleMessage(String message) {
				System.out.println(message);
				Assert.isTrue(message != null);

			}
		});

		rtmClient.addListener(SlackEvent.hello, new SlackEventListener() {

			@Override
			public void handleMessage(String message) {
				System.out.println(message);
			}
		});

		rtmClient.connect();

		int index = 0;
		while (index < 10) {
			index++;
			rtmClient.sendMessage("Hi There!!", "#general");
			Thread.sleep(3000);
		}

		try {
			Thread.sleep(20 * 1000);
			rtmClient.close();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
