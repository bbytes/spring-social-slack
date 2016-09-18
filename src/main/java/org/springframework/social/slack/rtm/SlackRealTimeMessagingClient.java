//package org.springframework.social.slack.rtm;
//
//
//import static org.asynchttpclient.Dsl.asyncHttpClient;
//import static org.asynchttpclient.Dsl.config;
//import static org.asynchttpclient.Dsl.proxyServer;
//
//import java.io.IOException;
//import java.net.URI;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.asynchttpclient.AsyncHttpClient;
//import org.asynchttpclient.BoundRequestBuilder;
//import org.asynchttpclient.ws.DefaultWebSocketListener;
//import org.asynchttpclient.ws.WebSocket;
//import org.asynchttpclient.ws.WebSocketUpgradeHandler;
//import org.springframework.social.slack.api.impl.SlackException;
//
//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.node.ObjectNode;
//
//public class SlackRealTimeMessagingClient {
//
//	private static Log logger = LogFactory.getLog(SlackRealTimeMessagingClient.class);
//
//	private String webSocketUrl;
//	private ProxyServer proxyServer;
//	private AsyncHttpClient asyncHttpClient;
//	private WebSocket webSocket;
//	private Map<String, List<SlackEventListener>> listeners = new HashMap<String, List<SlackEventListener>>();
//	private boolean stop;
//	private ObjectMapper mapper;
//
//	public SlackRealTimeMessagingClient(String webSocketUrl, ObjectMapper mapper) {
//		this(webSocketUrl, null, mapper);
//	}
//
//	public SlackRealTimeMessagingClient(String webSocketUrl, ProxyServer proxyServer, ObjectMapper mapper) {
//		if (mapper == null) {
//			mapper = new ObjectMapper();
//		}
//		this.webSocketUrl = webSocketUrl;
//		this.proxyServer = proxyServer;
//		this.mapper = mapper;
//	}
//	
//	public void addListener(SlackEvent event, SlackEventListener listener) {
//		addListener(event.name().toLowerCase(), listener);
//	}
//
//	public void addListener(String event, SlackEventListener listener) {
//		List<SlackEventListener> eventListeners = listeners.get(event);
//		if (eventListeners == null) {
//			eventListeners = new ArrayList<SlackEventListener>();
//			listeners.put(event, eventListeners);
//		}
//		eventListeners.add(listener);
//	}
//
//	public void close() {
//		logger.info("Slack RTM closing...");
//
//		stop = true;
//		if (webSocket != null && webSocket.isOpen()) {
//			try {
//				webSocket.close();
//			} catch (IOException e) {
//				// ignore
//			}
//		}
//		if (asyncHttpClient != null && !asyncHttpClient.isClosed()) {
//			try {
//				asyncHttpClient.close();
//			} catch (IOException e) {
//				// ignore
//			}
//		}
//
//		logger.info("Slack RTM closed.");
//	}
//
//
//	
//	public boolean connect() {
//		try {
//			asyncHttpClient = proxyServer != null ? asyncHttpClient(config().setProxyServer(proxyServer(proxyServer.getHost(), proxyServer.getPort()))) : asyncHttpClient();
//			BoundRequestBuilder requestBuilder = asyncHttpClient.prepareGet(webSocketUrl);
//			webSocket = requestBuilder.execute(new WebSocketUpgradeHandler.Builder().addWebSocketListener(new DefaultWebSocketListener() {
//
//				@Override
//				public void onMessage(String message) {
//					String type = null;
//					JsonNode node = null;
//					try {
//						node = mapper.readTree(message);
//						type = node.findPath("type").asText();
//					} catch (Exception e) {
//						logger.error(e);
//					}
//
//					if (!"pong".equals(type)) {
//						logger.info("Slack RTM message : " + message);
//					}
//
//					if (type != null) {
//						List<SlackEventListener> eventListeners = listeners.get(type);
//						if (eventListeners != null && !eventListeners.isEmpty()) {
//							for (SlackEventListener listener : eventListeners) {
//								listener.handleMessage(node);
//							}
//						}
//					}
//				}
//
//				@Override
//				public void onClose(WebSocket websocket) {
//					super.onClose(websocket);
//					stop = true;
//				}
//
//				@Override
//				public void onError(Throwable t) {
//					throw new SlackException(t);
//				}
//
//			}).build()).get();
//
//			logger.info("connected Slack RTM(Real Time Messaging) server : " + webSocketUrl);
//
//			await();
//
//		} catch (Exception e) {
//			close();
//			throw new SlackException(e);
//		}
//		return true;
//	}
//
//	private long socketId = 1;
//
//	private void ping() {
//		ObjectNode pingMessage = mapper.createObjectNode();
//		pingMessage.put("id", ++socketId);
//		pingMessage.put("type", "ping");
//		String pingJson = pingMessage.toString();
//		webSocket.sendMessage(pingJson);
//
//		logger.debug("ping : " + pingJson);
//	}
//
//	private void await() {
//		Thread thread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				while (!stop) {
//					try {
//						ping();
//						Thread.sleep(3 * 1000);
//					} catch (Exception e) {
//						throw new SlackException(e);
//					}
//				}
//			}
//		});
//		thread.start();
//	}
//
//}
