package org.springframework.social.slack.api.impl;

import java.net.URI;

import org.springframework.social.slack.api.RTMOperations;
import org.springframework.social.slack.api.impl.model.SlackRTMResponse;
import org.springframework.social.slack.rtm.ProxyServer;
import org.springframework.social.slack.rtm.RTMClient;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestOperations;

import com.fasterxml.jackson.databind.ObjectMapper;

public class RTMTemplate extends AbstractTemplate implements RTMOperations {

	public RTMTemplate(RestOperations restOperations) {
		super(restOperations);
	}

	@Override
	public SlackRTMResponse startRealTimeMessagingApi() {
		SlackRTMResponse slackResponse = get("/rtm.start", SlackRTMResponse.class);
		return slackResponse;
	}

	@Override
	public SlackRTMResponse startRealTimeMessagingApi(String simple_latest, String no_unreads, String mpim_aware) {
		MultiValueMap<String, String> paramMap = new LinkedMultiValueMap<String, String>();
		paramMap.add("simple_latest", simple_latest);
		paramMap.add("no_unreads", no_unreads);
		paramMap.add("mpim_aware", mpim_aware);

		SlackRTMResponse slackResponse = get("/rtm.start", paramMap, SlackRTMResponse.class);
		return slackResponse;
	}

	@Override
	public RTMClient getRTMClient(SlackRTMResponse slackRTMResponse, ProxyServer proxyServer) throws Exception {
		return new RTMClient(new URI(slackRTMResponse.getWebSocketURL()));
	}

	@Override
	public RTMClient getRTMClient(SlackRTMResponse slackRTMResponse) throws Exception {
		return new RTMClient(new URI(slackRTMResponse.getWebSocketURL()));
	}

	@Override
	public RTMClient getRTMClient(SlackRTMResponse slackRTMResponse, ProxyServer proxyServer,
			ObjectMapper objectMapper) throws Exception {
		return new RTMClient(new URI(slackRTMResponse.getWebSocketURL()));
	}

}
