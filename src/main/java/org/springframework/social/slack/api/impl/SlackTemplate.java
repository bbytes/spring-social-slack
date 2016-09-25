package org.springframework.social.slack.api.impl;

import java.io.IOException;
import java.net.URI;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.slack.api.ChannelOperations;
import org.springframework.social.slack.api.ChatOperations;
import org.springframework.social.slack.api.DndOperations;
import org.springframework.social.slack.api.FileCommentsOperations;
import org.springframework.social.slack.api.FilesOperations;
import org.springframework.social.slack.api.GroupOperations;
import org.springframework.social.slack.api.MessageOperations;
import org.springframework.social.slack.api.MiscOperations;
import org.springframework.social.slack.api.PinOperations;
import org.springframework.social.slack.api.RTMOperations;
import org.springframework.social.slack.api.ReactionOperations;
import org.springframework.social.slack.api.ReminderOperations;
import org.springframework.social.slack.api.SearchOperations;
import org.springframework.social.slack.api.Slack;
import org.springframework.social.slack.api.StarOperations;
import org.springframework.social.slack.api.TeamOperations;
import org.springframework.social.slack.api.UserProfileOperations;
import org.springframework.social.slack.api.UsersOperations;
import org.springframework.social.slack.api.impl.json.SlackModule;
import org.springframework.social.support.HttpRequestDecorator;
import org.springframework.util.Assert;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SlackTemplate extends AbstractOAuth2ApiBinding implements Slack {

	protected String clientId;

	protected ObjectMapper objectMapper;

	public SlackTemplate(String accessToken) {
		super(accessToken);
		Assert.hasLength(accessToken, "Access token cannot be null or empty.");
		registerInterceptors(accessToken);
	}

	public SlackTemplate(String clientId, String accessToken) {
		this(accessToken);
		this.clientId = clientId;
	}

	private void registerInterceptors(String accessToken) {
		List<ClientHttpRequestInterceptor> interceptors = getRestTemplate().getInterceptors();
		interceptors.add(new OAuth2TokenParameterRequestInterceptor(accessToken));
		interceptors.add(new LoggingRequestInterceptor());
		getRestTemplate().setInterceptors(interceptors);
	}

	@Override
	public MappingJackson2HttpMessageConverter getJsonMessageConverter() {
		MappingJackson2HttpMessageConverter converter = super.getJsonMessageConverter();
		objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.registerModule(new SlackModule());
		converter.setObjectMapper(objectMapper);
		return converter;
	}

	private static final class LoggingRequestInterceptor implements ClientHttpRequestInterceptor {

		private static final Log log = LogFactory.getLog(LoggingRequestInterceptor.class);

		@Override
		public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
			ClientHttpResponse response = execution.execute(request, body);
			log(request, body, response);
			return response;
		}

		private void log(HttpRequest request, byte[] body, ClientHttpResponse response) throws IOException {
			log.debug(request.getMethod().toString() + " request sent to url : " + request.getURI().toString());
			log.debug(request.getMethod().toString() + " request body : " + new String(body));
		}
	}

	private static final class OAuth2TokenParameterRequestInterceptor implements ClientHttpRequestInterceptor {
		private final String accessToken;

		public OAuth2TokenParameterRequestInterceptor(String accessToken) {
			this.accessToken = accessToken;
		}

		public ClientHttpResponse intercept(final HttpRequest request, final byte[] body, ClientHttpRequestExecution execution) throws IOException {
			HttpRequestDecorator protectedResourceRequest = new HttpRequestDecorator(request) {
				@Override
				public URI getURI() {
					return URI.create(super.getURI().toString() + (((super.getURI().getQuery() == null) ? "?" : "&") + "token=" + accessToken));
				}

			};

			if (protectedResourceRequest.getMethod().equals(HttpMethod.POST)) {
				protectedResourceRequest.addParameter("token", accessToken);
			}
			return execution.execute(protectedResourceRequest, body);
		}

	}

	@Override
	public UsersOperations usersOperations() {
		return new UsersTemplate(getRestTemplate());
	}

	@Override
	public UserProfileOperations userProfileOperations() {
		return new UserProfileTemplate(getRestTemplate());
	}

	@Override
	public SearchOperations searchOperations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FilesOperations filesOperations() {
		return new FileTemplate(getRestTemplate());
	}

	@Override
	public ChatOperations chatOperations() {
		return new ChatTemplate(getRestTemplate());
	}

	@Override
	public ChannelOperations channelOperations() {
		return new ChannelTemplate(getRestTemplate());
	}

	@Override
	public MessageOperations messageOperations() {
		return new MessageTemplate(getRestTemplate());
	}

	@Override
	public RTMOperations rtmOperations() {
		return new RTMTemplate(getRestTemplate());
	}

	@Override
	public TeamOperations teamOperations() {
		return new TeamTemplate(getRestTemplate());
	}

	@Override
	public GroupOperations groupOperations() {
		return new GroupTemplate(getRestTemplate());
	}

	@Override
	public FileCommentsOperations fileCommentOperations() {
		return new FileCommentsTemplate(getRestTemplate());
	}

	@Override
	public MiscOperations miscOperations() {
		return new MiscTemplate(getRestTemplate());
	}

	@Override
	public DndOperations dndOperations() {
		return new DndTemplate(getRestTemplate());
	}
	
	@Override
	public ReactionOperations reactionOperations() {
		return new ReactionTemplate(getRestTemplate());
	}
	
	@Override
	public PinOperations pinOperations() {
		return new PinTemplate(getRestTemplate());
	}
	
	@Override
	public ReminderOperations reminderOperations() {
		return new ReminderTemplate(getRestTemplate());
	}
	
	@Override
	public StarOperations starOperations() {
		return new StarTemplate(getRestTemplate());
	}

}
