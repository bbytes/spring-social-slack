package org.springframework.social.slack.rtm;

public class ProxyServer {

	protected String protocol;
	protected String host;
	protected int port;

	public ProxyServer() {
	}

	public ProxyServer(String host, int port) {
		this.host = host;
		this.port = port;
	}

	public ProxyServer(String protocol, String host, int port) {
		this.protocol = protocol;
		this.host = host;
		this.port = port;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	

}
