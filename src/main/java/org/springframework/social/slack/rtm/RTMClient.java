package org.springframework.social.slack.rtm;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.websocket.ClientEndpoint;
import javax.websocket.CloseReason;
import javax.websocket.ContainerProvider;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@ClientEndpoint
public class RTMClient {

	private final static Log logger = LogFactory.getLog(RTMClient.class);

	protected Session userSession = null;

	private Map<String, List<SlackEventListener>> listeners = new HashMap<String, List<SlackEventListener>>();
	protected ObjectMapper mapper = new ObjectMapper();

	protected URI endpointURI;

	public RTMClient(URI endpointURI) {
		this.endpointURI = endpointURI;
	}

	public void connect() throws Exception {
		try {
			WebSocketContainer container = ContainerProvider.getWebSocketContainer();
			container.connectToServer(this, endpointURI);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	/**
	 * Callback hook for Connection open events.
	 * 
	 * @param userSession
	 *            the userSession which is opened.
	 */
	@OnOpen
	public void onOpen(Session userSession) {
		this.userSession = userSession;
	}

	/**
	 * Callback hook for Connection close events.
	 * 
	 * @param userSession
	 *            the userSession which is getting closed.
	 * @param reason
	 *            the reason for connection close
	 */
	@OnClose
	public void onClose(Session userSession, CloseReason reason) {
		this.userSession = null;
	}

	/**
	 * Callback hook for Message Events. This method will be invoked when a
	 * client send a message.
	 * 
	 * @param message
	 *            The text message
	 */
	@OnMessage
	public void onMessage(String message) {
		String type = null;
		JsonNode node = null;
		try {
			node = mapper.readTree(message);
			type = node.findPath("type").asText();
		} catch (Exception e) {
			logger.error(e);
		}

		if (type != null) {
			List<SlackEventListener> eventListeners = listeners.get(type);
			if (eventListeners != null && !eventListeners.isEmpty()) {
				for (SlackEventListener listener : eventListeners) {
					listener.handleMessage(message);
				}
			}
		}

	}

	/**
	 * Send message to given channel id
	 * 
	 * @param message
	 * @param channelId
	 * @throws IOException
	 */
	public void sendMessage(String message, String channelId) throws IOException {
		ObjectNode messageNode = mapper.createObjectNode();
		messageNode.put("id", UUID.randomUUID().toString());
		messageNode.put("type", SlackEvent.message.toString());
		messageNode.put("text", message);
		messageNode.put("channel", channelId);
		String messageJson = messageNode.toString();

		if (this.userSession != null && this.userSession.isOpen())
			this.userSession.getAsyncRemote().sendText(messageJson);
	}

	/**
	 * Make sure the message is in slack json format for it to work . Sample
	 * json given below
	 * 
	 * { "id": 1, "type": "message", "channel": "C024BE91L", "text":
	 * "Hello world" }
	 * 
	 * @param json
	 * @throws IOException
	 */
	public void sendJsonMessage(String json) throws IOException {
		if (this.userSession != null && this.userSession.isOpen())
			this.userSession.getAsyncRemote().sendText(json);
	}

	public void addListener(SlackEvent event, SlackEventListener listener) {
		addListener(event.name().toLowerCase(), listener);
	}

	public void addListener(String event, SlackEventListener listener) {
		List<SlackEventListener> eventListeners = listeners.get(event);
		if (eventListeners == null) {
			eventListeners = new ArrayList<SlackEventListener>();
			listeners.put(event, eventListeners);
		}
		eventListeners.add(listener);
	}

	public void close() {
		if (userSession != null && userSession.isOpen()) {
			try {
				userSession.close();
			} catch (IOException e) {
				// ignore
			}
		}
	}

}
